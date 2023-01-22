package kr.legossol.userManagement.api.userInfo.service.impl;

import kr.legossol.userManagement.api.userInfo.config.KeycloakConfig;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import kr.legossol.userManagement.api.userInfo.dto.keycloak.Credentials;
import kr.legossol.userManagement.api.userInfo.service.KeycloakUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class KeycloakUserServiceImpl implements KeycloakUserService {

    @Override
    public void saveUserOnKeycloak(UserInfoDto userInfoDto) {
        log.info("들어왔다");
        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
        credentialRepresentation.setTemporary(Boolean.TRUE);
        credentialRepresentation.setId(userInfoDto.getUserId());
        credentialRepresentation.setValue(userInfoDto.getPassword());
        credentialRepresentation.setType(CredentialRepresentation.PASSWORD);

        UserRepresentation userRepresentation = new UserRepresentation();
        userRepresentation.setUsername(userInfoDto.getUserId());
        userRepresentation.setFirstName(userInfoDto.getName());
        userRepresentation.setEmail(userInfoDto.getExternalEmail());
        userRepresentation.setEmailVerified(Boolean.FALSE);
        userRepresentation.setCredentials(Collections.singletonList(credentialRepresentation));
        userRepresentation.setEnabled(Boolean.TRUE);
        UsersResource instance = getInstance();

        instance.create(userRepresentation);
    }

    public List<UserRepresentation> getUser(String userName){
        UsersResource usersResource = getInstance();
        List<UserRepresentation> user = usersResource.search(userName, true);
        return user;

    }

    public void updateUser(String userId, UserInfoDto userInfoDto){
        CredentialRepresentation credential = Credentials
                .createPasswordCredentials(userInfoDto.getPassword());
        UserRepresentation user = new UserRepresentation();
        user.setUsername(userInfoDto.getUserId());
        user.setFirstName(userInfoDto.getName());
        user.setEmail(userInfoDto.getOfficeEmail());
        user.setCredentials(Collections.singletonList(credential));

        UsersResource usersResource = getInstance();
        usersResource.get(userId).update(user);
    }
    public void deleteUser(String userId){
        UsersResource usersResource = getInstance();
        usersResource.get(userId)
                .remove();
    }


    public void sendVerificationLink(String userId){
        UsersResource usersResource = getInstance();
        usersResource.get(userId)
                .sendVerifyEmail();
    }

    public void sendResetPassword(String userId){
        UsersResource usersResource = getInstance();

        usersResource.get(userId)
                .executeActionsEmail(Arrays.asList("UPDATE_PASSWORD"));
    }

    private UsersResource getInstance() {
        return KeycloakConfig.getInstance().realm(KeycloakConfig.realm).users();
    }
}

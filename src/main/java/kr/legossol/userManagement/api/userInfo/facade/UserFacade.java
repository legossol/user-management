package kr.legossol.userManagement.api.userInfo.facade;


import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import kr.legossol.userManagement.api.userInfo.dto.UserInfosDto;
import kr.legossol.userManagement.api.userInfo.entity.UserInfo;
import kr.legossol.userManagement.api.userInfo.service.KeycloakUserService;
import kr.legossol.userManagement.api.userInfo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;
    private final KeycloakUserService keycloakUserService;

    public UserInfoDto saveParkingEmployee(UserInfoDto userInfoDto) {

//        keycloakUserService.saveUserOnKeycloak(parkingEmployeeUserInfoDto);
        return userService.saveEmployee(UserInfo.of(userInfoDto));
    }

    public RelateCode[] getRelateCodes() {
        return userService.getRelateCodes();
    }

    public WorkStateCode[] getWorkStateCode() {
        return userService.getWorkStateCode();
    }

    public CertificateFileCode[] getCertificateCode() {
        return userService.getCertificateCode();
    }

    public void saveKeycloakUser(UserInfoDto userInfoDto) {
         keycloakUserService.saveUserOnKeycloak(userInfoDto);
    }

    public UserInfo getUserInfoDetail(Long userId) {
        return userService.getUserInfo(userId);
    }

    public void deleteUser(Long userId) {
        userService.deleteUser(userId);
    }

    public UserInfo saveUser(UserInfosDto userInfoDto) {
        return userService.saveUser(UserInfo.builder().name(userInfoDto.getName()).build());

    }

    public UserInfo saveUserDetail(UserInfosDto.defaultIndividualInfoDto userInfoDto) {
        return userService.saveUser(UserInfo.builder().name(userInfoDto.getName())
                .dateOfBirth(userInfoDto.getDateOfBirth())
                .externalEmail(userInfoDto.getExternalEmail())
                .build());
    }
}

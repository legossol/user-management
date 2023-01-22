package kr.legossol.userManagement.api.userInfo.dto.keycloak;

import kr.legossol.userManagement.api.userInfo.dto.ParkingEmployeeUserInfoDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.keycloak.representations.idm.CredentialRepresentation;

import java.util.Map;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRepresentation {

    private Map<String,String> access;
    private Map<String,String> attributes;
    private UserConsentRepresentation[] userConsentRepresentation;
    private Map<String,String> clientRoles;
    private Integer createdTimestamp; //now()
    private String[] disableableCredentialTypes;
    private String email;
    private Boolean emailVerified; // false
    private Boolean enabled;
    private FederatedIdentityRepresentation[] federatedIdentityRepresentation;
    private String federationLink;
    private String firstName; // ㅅㅓㅇ + ㅇㅣㄹㅡㅁ
    private String[] groups;
    private String id; //
    private String lastName; //
    private Integer notBefore;
    private String origin;
    private String[] realmRoles;
    private String[] requiredActions;
    private String self;
    private String serviceAccountClientId;
    private String username; //ㅇㅏㅇㅣㄷㅣ?

}

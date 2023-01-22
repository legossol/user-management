package kr.legossol.userManagement.api.userInfo.dto.keycloak;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserConsentRepresentation {
    private String clientId; //option
    private Integer createdDate; //option
    private String[] grantedClientScopes;
    private Integer lastUpdatedDate;

}

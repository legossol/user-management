package kr.legossol.userManagement.api.userInfo.facade;


import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.UserInfo;
import kr.legossol.userManagement.api.userInfo.service.KeycloakUserService;
import kr.legossol.userManagement.api.userInfo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserService parkingCloudService;
    private final KeycloakUserService keycloakUserService;

    public UserInfoDto saveParkingEmployee(UserInfoDto userInfoDto) {

//        keycloakUserService.saveUserOnKeycloak(parkingEmployeeUserInfoDto);
        return parkingCloudService.saveEmployee(UserInfo.of(userInfoDto));
    }

    public RelateCode[] getRelateCodes() {
        return parkingCloudService.getRelateCodes();
    }

    public WorkStateCode[] getWorkStateCode() {
        return parkingCloudService.getWorkStateCode();
    }

    public CertificateFileCode[] getCertificateCode() {
        return parkingCloudService.getCertificateCode();
    }

    public void saveKeycloakUser(UserInfoDto userInfoDto) {
         keycloakUserService.saveUserOnKeycloak(userInfoDto);
    }

    public UserInfo getUserInfoDetail(Long userId) {
        return parkingCloudService.getUserInfo(userId);
    }

    public void deleteUser(Long userId) {
        parkingCloudService.deleteUser(userId);
    }
}

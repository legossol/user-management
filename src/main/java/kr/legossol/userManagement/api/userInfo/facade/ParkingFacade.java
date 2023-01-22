package kr.legossol.userManagement.api.userInfo.facade;


import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.ParkingEmployeeUserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.EmployeeUserInfo;
import kr.legossol.userManagement.api.userInfo.service.KeycloakUserService;
import kr.legossol.userManagement.api.userInfo.service.ParkingCloudService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ParkingFacade {

    private final ParkingCloudService parkingCloudService;
    private final KeycloakUserService keycloakUserService;

    public ParkingEmployeeUserInfoDto saveParkingEmployee(ParkingEmployeeUserInfoDto parkingEmployeeUserInfoDto) {

//        keycloakUserService.saveUserOnKeycloak(parkingEmployeeUserInfoDto);
        return parkingCloudService.saveEmployee(EmployeeUserInfo.of(parkingEmployeeUserInfoDto));
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

    public void saveKeycloakUser(ParkingEmployeeUserInfoDto parkingEmployeeUserInfoDto) {
         keycloakUserService.saveUserOnKeycloak(parkingEmployeeUserInfoDto);
    }
}

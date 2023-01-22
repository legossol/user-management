package kr.legossol.userManagement.api.userInfo.service;

import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.ParkingEmployeeUserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.EmployeeUserInfo;

public interface ParkingCloudService {

    ParkingEmployeeUserInfoDto saveEmployee(EmployeeUserInfo employeeUserInfo);

    RelateCode[] getRelateCodes();

    CertificateFileCode[] getCertificateCode();

    WorkStateCode[] getWorkStateCode();
}

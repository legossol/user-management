package kr.legossol.userManagement.api.userInfo.service.impl;

import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.ParkingEmployeeUserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.EmployeeUserInfo;
import kr.legossol.userManagement.api.userInfo.repository.EmployeeBasicInfoRepository;
import kr.legossol.userManagement.api.userInfo.service.ParkingCloudService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ParkingCloudServiceImpl implements ParkingCloudService {

    private final EmployeeBasicInfoRepository employeeBasicInfoRepository;

    @Override
    public ParkingEmployeeUserInfoDto saveEmployee(EmployeeUserInfo employeeUserInfo) {
        EmployeeUserInfo savedEmployeeInfo = employeeBasicInfoRepository.save(employeeUserInfo);

        return ParkingEmployeeUserInfoDto.of(savedEmployeeInfo);
    }

    @Override
    public RelateCode[] getRelateCodes() {
        return RelateCode.values();
    }

    @Override
    public CertificateFileCode[] getCertificateCode() {
        return CertificateFileCode.values();
    }

    @Override
    public WorkStateCode[] getWorkStateCode() {
        return WorkStateCode.values();
    }


}

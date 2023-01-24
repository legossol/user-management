package kr.legossol.userManagement.api.userInfo.service.impl;

import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.UserInfo;
import kr.legossol.userManagement.api.userInfo.exception.UserNotFoundException;
import kr.legossol.userManagement.api.userInfo.repository.UserBasicInfoRepository;
import kr.legossol.userManagement.api.userInfo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserBasicInfoRepository employeeBasicInfoRepository;

    @Override
    public UserInfoDto saveEmployee(UserInfo userInfo) {
        UserInfo savedEmployeeInfo = employeeBasicInfoRepository.save(userInfo);

        return UserInfoDto.of(savedEmployeeInfo);
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

    @Override
    public UserInfo getUserInfo(Long userId) {
        return  employeeBasicInfoRepository.findById(userId).orElseThrow(UserNotFoundException::new);

    }

    @Override
    public void deleteUser(Long userId) {
        UserInfo userInfo = getUserInfo(userId);
        userInfo.setWorkStatus(WorkStateCode.LEAVE);
        employeeBasicInfoRepository.save(userInfo);

    }

    @Override
    public UserInfo saveUser(UserInfo userInfo) {
        return employeeBasicInfoRepository.save(userInfo);
    }


}

package kr.legossol.userManagement.api.userInfo.service;

import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.UserInfo;

public interface UserService {

    UserInfoDto saveEmployee(UserInfo userInfo);

    RelateCode[] getRelateCodes();

    CertificateFileCode[] getCertificateCode();

    WorkStateCode[] getWorkStateCode();

    UserInfo getUserInfo(Long userId);

    void deleteUser(Long userId);
}

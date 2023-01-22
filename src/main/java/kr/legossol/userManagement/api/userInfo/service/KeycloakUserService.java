package kr.legossol.userManagement.api.userInfo.service;

import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;

public interface KeycloakUserService {
    void saveUserOnKeycloak(UserInfoDto userInfoDto);
}

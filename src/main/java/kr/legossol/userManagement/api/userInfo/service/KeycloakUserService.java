package kr.legossol.userManagement.api.userInfo.service;

import kr.legossol.userManagement.api.userInfo.dto.ParkingEmployeeUserInfoDto;

public interface KeycloakUserService {
    void saveUserOnKeycloak(ParkingEmployeeUserInfoDto parkingEmployeeUserInfoDto);
}

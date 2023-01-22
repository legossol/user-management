package kr.legossol.userManagement.api.userInfo.repository;

import kr.legossol.userManagement.api.userInfo.entity.EmployeeUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeBasicInfoRepository extends JpaRepository<EmployeeUserInfo,Long> {
}

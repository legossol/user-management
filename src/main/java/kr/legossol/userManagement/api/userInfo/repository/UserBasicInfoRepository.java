package kr.legossol.userManagement.api.userInfo.repository;

import kr.legossol.userManagement.api.userInfo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBasicInfoRepository extends JpaRepository<UserInfo,Long> {
}

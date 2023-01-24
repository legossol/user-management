package kr.legossol.userManagement.api.userInfo.dto;

import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.entity.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfosDto {

    @NotNull
    private String name;

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class defaultIndividualInfoDto{
        private String name;
        private String residentRegistrationNumber;// 주민등록번호
        private String dateOfBirth;// 생년월일
        private String cellPhone;
        private String externalEmail;// 사외 이메일
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class defaultOfficialInfoDto{

        @NotNull
        private String departmentId;
        private String groupWareId;// 그룹웨어 ID
        private String workLocate;//근무처
        private WorkStateCode workStatus;//상태(재직,휴직,퇴직)
        private String officeEmail;

    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OfficialInfoDto{
        @NotNull
        private String departmentId;
        private String groupWareId;// 그룹웨어 ID
        private String workLocate;//근무처
        private WorkStateCode workStatus;//상태(재직,휴직,퇴직)
        private String officeEmail;
        private Long paclBusinessId;
        private String grade; //직급 (책임, 선임, 전임, 사원)
        private String position;//직책 (팀장, 팀원, 매니저)
    }

}

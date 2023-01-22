package kr.legossol.userManagement.api.userInfo.dto;

import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.entity.EmployeeUserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingEmployeeUserInfoDto {

    private Long paclBusinessId;
    @NotNull
    private String departmentId;
    private String userId;
    private String password;
    @NotNull
    private String name;
    private String workLocate;//근무처
    private WorkStateCode workStatus;//상태(재직,휴직,퇴직)
    private String officeEmail;
    private String groupWareId;// 그룹웨어 ID
    private String residentRegistrationNumber;// 주민등록번호
    private String dateOfBirth;// 생년월일
    private String cellPhone;
    private String externalEmail;// 사외 이메일
    private String position;//직책 (팀장, 팀원, 매니저)
    private String grade; //직급 (책임, 선임, 전임, 사원)

    public static ParkingEmployeeUserInfoDto of(EmployeeUserInfo employeeUserInfo) {
        return ParkingEmployeeUserInfoDto.builder()
                .paclBusinessId(employeeUserInfo.getId())
                .name(employeeUserInfo.getName())
                .userId(employeeUserInfo.getUserId())
                .workLocate(employeeUserInfo.getWorkLocate())
                .workStatus(employeeUserInfo.getWorkStatus())
                .groupWareId(employeeUserInfo.getGroupWareId())
                .residentRegistrationNumber(employeeUserInfo.getGroupWareId())
                .dateOfBirth(employeeUserInfo.getDateOfBirth())
                .cellPhone(employeeUserInfo.getCellPhone())
                .externalEmail(employeeUserInfo.getExternalEmail())
                .build();
    }


//    private String zipCode;// 우편번호
//    private String address;// 주소
//
//
//    private String personalInstructionFileLink; // 자기소개서 파일 링크
//    private String residentRegistrationFile;    // 주민등록등본 파일 링크
//    private String certificationOfFamily;   // 가족관계증명서 파일 링크
//    private String additionalFileLink;  // 별도 첨부 파일 링크

}

package kr.legossol.userManagement.api.userInfo.entity;


import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity(name = "user")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_uid")
    @Size(max = 12)
    private String userId;

    //password의 경우 100으로

    @Column(name = "department_id")
    private String departmentId;

    @Column(name = "work_locate")
    private String workLocate;//근무처

    @Column(name = "work_status")
    @Enumerated(EnumType.STRING)
    private WorkStateCode workStatus;//상태(재직,휴직,퇴직)

    @Column(name = "group_ware_id")
    private String groupWareId;// 그룹웨어 ID

    @Size(max = 13)
    @Column(name = "cellPhone")
    private String cellPhone;

    @Size(max = 15)
    @Column(name = "resident_registration_number")
    private String residentRegistrationNumber;// 주민등록번호

    @Size(max = 6)
    @Column(name = "date_of_birth")
    private String dateOfBirth;// 생년월일

    @Email
    @Size(max = 100)
    @Column(name = "external_email")
    private String externalEmail;// 사외 이메일

    @Size(max = 10)
    @Column(name = "position")
    private String position; //직책 (팀장, 팀원, 매니저)

    @Size(max = 10)
    @Column(name = "grade")
    private String grade; //직급  (책임, 선임, 전임, 사원)

    public static UserInfo of(UserInfoDto employeeUserInfoDto) {
        return UserInfo.builder()
                .userId(employeeUserInfoDto.getUserId())
                .name(employeeUserInfoDto.getName())
                .departmentId(employeeUserInfoDto.getDepartmentId())
                .workLocate(employeeUserInfoDto.getWorkLocate())
                .workStatus(employeeUserInfoDto.getWorkStatus())
                .cellPhone((employeeUserInfoDto.getCellPhone()))
                .residentRegistrationNumber(employeeUserInfoDto.getResidentRegistrationNumber())
                .dateOfBirth(employeeUserInfoDto.getDateOfBirth())
                .externalEmail(employeeUserInfoDto.getExternalEmail())
                .position(employeeUserInfoDto.getPosition())
                .grade(employeeUserInfoDto.getGrade())
                .build();
    }
}

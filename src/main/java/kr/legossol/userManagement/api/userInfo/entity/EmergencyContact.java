package kr.legossol.userManagement.api.userInfo.entity;


import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "emergency_contract")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmergencyContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "relation")
    private RelateCode relation;

    @NotNull
    @Column(name = "contract_number")
    private String contactNumber;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private EmployeeUserInfo employeeUserInfo;
}

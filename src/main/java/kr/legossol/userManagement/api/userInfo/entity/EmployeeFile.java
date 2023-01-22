package kr.legossol.userManagement.api.userInfo.entity;


import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "employee_file")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 50)
    @Enumerated(value = EnumType.STRING)
    @NotNull
    @Column(name = "species")
    private CertificateFileCode species;

    @NotNull
    @Column(name = "filePath")
    private String filePath;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private EmployeeUserInfo employeeUserInfo;


}

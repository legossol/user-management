package kr.legossol.userManagement.api.userInfo.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CertificateFileCode {
    RESUME("이력서")
    ,CV("자기소개서")
    ,RESIDENT_REGISTRATION("주민등록본")
    ,FAMILY("가족관계증명서")
    ,ETC("기타")
    ;

    private String value;
}

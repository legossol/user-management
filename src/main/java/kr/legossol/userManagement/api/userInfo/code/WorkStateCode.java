package kr.legossol.userManagement.api.userInfo.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum WorkStateCode {
    ON_WORK("재직")
    ,PAID_VACATION("휴직")
    ,LEAVE("퇴직")
    ;
    private String value;
}

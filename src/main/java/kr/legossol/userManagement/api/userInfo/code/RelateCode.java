package kr.legossol.userManagement.api.userInfo.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RelateCode {
    SPOUSE("배우자")
    ,FATHER("부")
    ,MOTHER("모")
    ,GRANDFATHER("할아버지")
    ,GRANDMOTHER("할머니")
    ,SON("아들")
    ,DAUGHTER("딸")
    ;

    private String value;

}

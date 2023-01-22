package kr.legossol.userManagement.api.userInfo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.legossol.userManagement.api.userInfo.code.CertificateFileCode;
import kr.legossol.userManagement.api.userInfo.code.RelateCode;
import kr.legossol.userManagement.api.userInfo.code.WorkStateCode;
import kr.legossol.userManagement.api.userInfo.dto.UserInfoDto;
import kr.legossol.userManagement.api.userInfo.entity.UserInfo;
import kr.legossol.userManagement.api.userInfo.facade.UserFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/user")
@Tag(name = "(파킹클라우드)사원 관리 컨트롤러")
public class UserMangementController {

    private final UserFacade parkingkingFacade;

    @Operation(summary = "(파킹클라우드)사원 정보 생성")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserInfoDto> saveParkingEmployee(@RequestBody UserInfoDto userInfoDto) {
        return new ResponseEntity<>(parkingkingFacade.saveParkingEmployee(userInfoDto),HttpStatus.CREATED);
    }
    @Operation(summary = "(파킹클라우드)사원 정보 조회")
    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserInfo> saveParkingEmployee(@PathVariable(value = "id")Long userId) {
        return ResponseEntity.ok(parkingkingFacade.getUserInfoDetail(userId));
    }
    @Operation(summary = "(파킹클라우드)사원 정보 조회")
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserInfo> saveParkingEmployee(@PathVariable(value = "id")Long userId) {
        return ResponseEntity.ok(parkingkingFacade.deleteUser(userId));
    }

    @Operation(summary = "관계 코드 조회")
    @GetMapping(value = "/code/relate")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RelateCode[]> getRelateCodeValues() {
        return new ResponseEntity<RelateCode[]>(parkingkingFacade.getRelateCodes(), HttpStatus.OK);
    }
    @Operation(summary = "재직 상태 코드 조회 ")
    @GetMapping(value = "/code/workstate")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<WorkStateCode[]> getWorkStateCodeValues() {
        return new ResponseEntity<WorkStateCode[]>(parkingkingFacade.getWorkStateCode(),HttpStatus.OK);
    }
    @Operation(summary = "증명서 종류 코드 조회")
    @GetMapping(value = "/code/certificate")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CertificateFileCode[]> getgetCertificateCodeValues() {
        return new ResponseEntity<CertificateFileCode[]>(parkingkingFacade.getCertificateCode(),HttpStatus.OK);
    }
    @Operation(summary = "keycloak 유저 등록")
    @PostMapping(value = "/keycloak")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> saveKeycloakUser(@RequestBody UserInfoDto userInfoDto) {
        parkingkingFacade.saveKeycloakUser(userInfoDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}

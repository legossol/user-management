package kr.legossol.userManagement.stream;

import com.google.gson.Gson;
import kr.legossol.userManagement.stream.dto.OrganizationEmployeeDtoV1;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Slf4j
@Component
@RequiredArgsConstructor
public class OrganizationKafkaProducer {

    private final StreamBridge streamBridge;
    private final Gson gson;
    private static final String bindName = "employee-out-0";
    private static final String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS[XXX]";

    public void produceEmployeeInfo(OrganizationEmployeeDtoV1 organizationEmployeeDtoV1) {
        log.info("Produce Employee info : {}", organizationEmployeeDtoV1);
        try{
            streamBridge.send(bindName, MessageBuilder.withPayload(gson.toJson(organizationEmployeeDtoV1))
                    .setHeader("version", "V1")
                    .setHeader("createDateTime", ZonedDateTime.now()
                            .format(DateTimeFormatter.ofPattern(dateFormat)))
                    .build()
            );

        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }
    }
}

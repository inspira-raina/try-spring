package org.ait.project.template.modules.client.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ClientResponse {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("comp_name")
    private String compName;

    @JsonProperty("comp_address")
    private String compAddress;

    @JsonProperty("comp_phone")
    private String compPhone;

    @JsonProperty("pic_name")
    private String picName;

    @JsonProperty("pic_phone")
    private String picPhone;
}

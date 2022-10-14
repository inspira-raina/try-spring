package org.ait.project.template.modules.client.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientRequest {
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

    @JsonProperty("created_at")
    private ZonedDateTime createdAt;

    @JsonProperty("updated_at")
    private ZonedDateTime updatedAt;
}

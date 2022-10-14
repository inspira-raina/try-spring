package org.ait.project.template.modules.project.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class ProjectRequest {

    @JsonProperty("title")
    private String title;

    @JsonProperty("client_id")
    private Integer clientId;

    @JsonProperty("description")
    private String Description;

    @JsonProperty("started_at")
    private ZonedDateTime startedAt;

    @JsonProperty("finished_at")
    private ZonedDateTime finishedAt;

    @JsonProperty("created_at")
    private ZonedDateTime createdAt;

    @JsonProperty("updated_at")
    private ZonedDateTime updatedAt;
}

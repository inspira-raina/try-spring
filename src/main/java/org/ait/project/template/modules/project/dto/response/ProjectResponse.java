package org.ait.project.template.modules.project.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.ait.project.template.modules.client.dto.response.ClientResponse;
import java.time.ZonedDateTime;

@Data
public class ProjectResponse {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("client_detail")
    private ClientResponse clientResponse;

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

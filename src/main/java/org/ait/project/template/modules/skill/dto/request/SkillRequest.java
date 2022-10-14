package org.ait.project.template.modules.skill.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SkillRequest {

    @NotNull
    @JsonProperty("title")
    private String title;

}

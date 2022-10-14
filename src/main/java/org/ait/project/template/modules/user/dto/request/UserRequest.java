package org.ait.project.template.modules.user.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UserRequest {

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("email")
    private String email;

    @NotNull
    @JsonProperty("phone_number")
    private String phoneNumber;
}

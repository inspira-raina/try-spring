package org.ait.project.template.modules.skill.transform;

import org.ait.project.template.modules.skill.dto.request.SkillRequest;
import org.ait.project.template.modules.skill.dto.response.SkillResponse;
import org.ait.project.template.modules.skill.model.entity.Skill;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillResponse toSkillResponse(Skill skill);
    List<SkillResponse> toSkillsResponse(List<Skill> skills);

    Skill toSkillRequest(SkillRequest skillRequest);
}
package org.ait.project.template.modules.skill.service.internal;

import org.ait.project.template.modules.skill.dto.request.SkillRequest;
import org.ait.project.template.modules.skill.dto.response.SkillResponse;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface SkillService {
    ResponseEntity<ResponseTemplate<ResponseList<SkillResponse>>> getAllSkills();

    ResponseEntity<ResponseTemplate<ResponseDetail<SkillResponse>>> addSkill(SkillRequest skillRequest);
}

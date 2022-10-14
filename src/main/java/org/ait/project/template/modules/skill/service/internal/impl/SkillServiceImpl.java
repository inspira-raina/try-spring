package org.ait.project.template.modules.skill.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.template.modules.skill.dto.request.SkillRequest;
import org.ait.project.template.modules.skill.dto.response.SkillResponse;
import org.ait.project.template.modules.skill.model.entity.Skill;
import org.ait.project.template.modules.skill.service.delegate.SkillServiceDelegate;
import org.ait.project.template.modules.skill.service.internal.SkillService;
import org.ait.project.template.modules.skill.transform.SkillMapper;
import org.ait.project.template.shared.enums.ResponseEnum;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.ait.project.template.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final ResponseHelper responseHelper;

    private final SkillServiceDelegate skillDelegate;

    private final SkillMapper skillMapper;


    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<SkillResponse>>> addSkill(SkillRequest skillRequest) {
        Skill skill = skillDelegate.saveSkill(skillMapper.toSkillRequest(skillRequest));
        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS, skillMapper.toSkillResponse(skill));
    }


    @Override
    public ResponseEntity<ResponseTemplate<ResponseList<SkillResponse>>> getAllSkills() {
        List<Skill> skillList = skillDelegate.getSkills();
        return responseHelper.createResponseCollection(ResponseEnum.SUCCESS, null, skillMapper.toSkillsResponse(skillList));
    }
}

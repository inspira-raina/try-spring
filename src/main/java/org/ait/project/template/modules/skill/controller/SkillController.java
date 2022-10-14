package org.ait.project.template.modules.skill.controller;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.skill.dto.request.SkillRequest;
import org.ait.project.template.modules.skill.dto.response.SkillResponse;
import org.ait.project.template.modules.skill.service.internal.SkillService;
import org.ait.project.template.shared.template.ResponseDetail;
import org.ait.project.template.shared.template.ResponseList;
import org.ait.project.template.shared.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @GetMapping("/skills")
    public ResponseEntity<ResponseTemplate<ResponseList<SkillResponse>>> getAllSkills() {
        return skillService.getAllSkills();
    }

    @PostMapping("/skill")
    public  ResponseEntity<ResponseTemplate<ResponseDetail<SkillResponse>>> addSkill(@RequestBody SkillRequest skillRequest) {
        return  skillService.addSkill(skillRequest);
    }
}

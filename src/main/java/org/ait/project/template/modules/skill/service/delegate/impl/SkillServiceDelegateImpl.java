package org.ait.project.template.modules.skill.service.delegate.impl;

import lombok.AllArgsConstructor;
import org.ait.project.template.modules.skill.model.entity.Skill;
import org.ait.project.template.modules.skill.model.repository.SkillRepository;
import org.ait.project.template.modules.skill.service.delegate.SkillServiceDelegate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SkillServiceDelegateImpl implements SkillServiceDelegate {

    private final SkillRepository skillRepository;


    @Override
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public List<Skill> getSkills() {
        return skillRepository.findAll();
    }
}

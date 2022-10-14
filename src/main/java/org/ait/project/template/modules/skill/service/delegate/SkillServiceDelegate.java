package org.ait.project.template.modules.skill.service.delegate;
import org.ait.project.template.modules.skill.model.entity.Skill;

import java.util.List;

public interface SkillServiceDelegate {

   Skill saveSkill(Skill skill);

   List<Skill> getSkills();




}

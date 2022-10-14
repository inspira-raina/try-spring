package org.ait.project.template.modules.skill.model.repository;

import org.ait.project.template.modules.skill.model.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {


}

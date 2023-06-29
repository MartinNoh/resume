package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    Skill findFirstByOrderByIdDesc();
}

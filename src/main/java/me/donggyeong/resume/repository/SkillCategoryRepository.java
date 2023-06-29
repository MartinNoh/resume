package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProfileStat;
import me.donggyeong.resume.domain.SkillCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillCategoryRepository extends JpaRepository<SkillCategory, Long>, SkillCategoryRepositoryCustom {
}

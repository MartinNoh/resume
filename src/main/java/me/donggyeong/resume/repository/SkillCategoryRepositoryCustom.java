package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.SkillCategory;

import java.util.List;

public interface SkillCategoryRepositoryCustom {
    List<SkillCategory> findAllInUseOrderBySequence();
}

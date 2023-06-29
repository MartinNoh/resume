package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.SkillItem;

import java.util.List;

public interface SkillItemRepositoryCustom {
    List<SkillItem> findAllInUseOrderBySequence();
}

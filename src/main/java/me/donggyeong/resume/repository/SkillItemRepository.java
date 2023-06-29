package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.SkillItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillItemRepository extends JpaRepository<SkillItem, Long>, SkillItemRepositoryCustom {
}

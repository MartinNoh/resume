package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Skill;
import me.donggyeong.resume.domain.SkillCategory;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class SkillCategoryViewResponse {
    private Long id;
    private Skill skill;
    private String name;
    private String iconShape;
    private String iconColor;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SkillCategoryViewResponse(SkillCategory skillCategory) {
        this.id = skillCategory.getId();
        this.skill = skillCategory.getSkill();
        this.name = skillCategory.getName();
        this.iconShape = skillCategory.getIconShape();
        this.iconColor = skillCategory.getIconColor();
        this.sequence = skillCategory.getSequence();
        this.inUse = skillCategory.getInUse();
        this.createdAt = skillCategory.getCreatedAt();
        this.updatedAt = skillCategory.getUpdatedAt();
    }
}

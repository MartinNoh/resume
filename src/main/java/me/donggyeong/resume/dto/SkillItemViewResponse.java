package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Skill;
import me.donggyeong.resume.domain.SkillCategory;
import me.donggyeong.resume.domain.SkillItem;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class SkillItemViewResponse {
    private Long id;
    private SkillCategory skillCategory;
    private String name;
    private String imagePath;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SkillItemViewResponse(SkillItem skillItem) {
        this.id = skillItem.getId();
        this.skillCategory = skillItem.getSkillCategory();
        this.name = skillItem.getName();
        this.imagePath = skillItem.getImagePath();
        this.sequence = skillItem.getSequence();
        this.inUse = skillItem.getInUse();
        this.createdAt = skillItem.getCreatedAt();
        this.updatedAt = skillItem.getUpdatedAt();
    }
}

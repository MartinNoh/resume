package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Skill;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class SkillViewResponse {
    private Long id;
    private String description;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public SkillViewResponse(Skill skill) {
        this.id = skill.getId();
        this.description = skill.getDescription();
        this.inUse = skill.getInUse();
        this.createdAt = skill.getCreatedAt();
        this.updatedAt = skill.getUpdatedAt();
    }
}

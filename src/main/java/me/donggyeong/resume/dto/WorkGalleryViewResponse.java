package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.SkillCategory;
import me.donggyeong.resume.domain.SkillItem;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class WorkGalleryViewResponse {
    private Long id;
    private WorkExperience workExperience;
    private String name;
    private String imagePath;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WorkGalleryViewResponse(WorkGallery workGallery) {
        this.id = workGallery.getId();
        this.workExperience = workGallery.getWorkExperience();
        this.name = workGallery.getName();
        this.imagePath = workGallery.getImagePath();
        this.sequence = workGallery.getSequence();
        this.inUse = workGallery.getInUse();
        this.createdAt = workGallery.getCreatedAt();
        this.updatedAt = workGallery.getUpdatedAt();
    }
}

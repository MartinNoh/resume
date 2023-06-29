package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.EducationGallery;
import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class EducationGalleryViewResponse {
    private Long id;
    private EducationInstitute educationInstitute;
    private String name;
    private String imagePath;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EducationGalleryViewResponse(EducationGallery educationGallery) {
        this.id = educationGallery.getId();
        this.educationInstitute = educationGallery.getEducationInstitute();
        this.name = educationGallery.getName();
        this.imagePath = educationGallery.getImagePath();
        this.sequence = educationGallery.getSequence();
        this.inUse = educationGallery.getInUse();
        this.createdAt = educationGallery.getCreatedAt();
        this.updatedAt = educationGallery.getUpdatedAt();
    }
}

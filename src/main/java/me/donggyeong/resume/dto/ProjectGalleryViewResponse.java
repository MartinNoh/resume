package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.ProjectGallery;
import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ProjectGalleryViewResponse {
    private Long id;
    private ProjectItem projectItem;
    private String mediaPath;
    private String extension;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProjectGalleryViewResponse(ProjectGallery projectGallery) {
        this.id = projectGallery.getId();
        this.projectItem = projectGallery.getProjectItem();
        this.mediaPath = projectGallery.getMediaPath();
        this.extension = projectGallery.getExtension();
        this.sequence = projectGallery.getSequence();
        this.inUse = projectGallery.getInUse();
        this.createdAt = projectGallery.getCreatedAt();
        this.updatedAt = projectGallery.getUpdatedAt();
    }
}

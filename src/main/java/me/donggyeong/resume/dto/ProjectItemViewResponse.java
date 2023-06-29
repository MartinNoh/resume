package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Project;
import me.donggyeong.resume.domain.ProjectItem;
import me.donggyeong.resume.domain.WorkExperience;
import me.donggyeong.resume.domain.WorkGallery;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ProjectItemViewResponse {
    private Long id;
    private Project project;
    private String name;
    private String briefDescription;
    private String mainImagePath;
    private LocalDate startDate;
    private LocalDate endDate;
    private String category;
    private String feature;
    private String longDescription;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProjectItemViewResponse(ProjectItem projectItem) {
        this.id = projectItem.getId();
        this.project = projectItem.getProject();
        this.name = projectItem.getName();
        this.briefDescription = projectItem.getBriefDescription();
        this.mainImagePath = projectItem.getMainImagePath();
        this.startDate = projectItem.getStartDate();
        this.endDate = projectItem.getEndDate();
        this.category = projectItem.getCategory();
        this.feature = projectItem.getFeature();
        this.longDescription = projectItem.getLongDescription();
        this.inUse = projectItem.getInUse();
        this.createdAt = projectItem.getCreatedAt();
        this.updatedAt = projectItem.getUpdatedAt();
    }
}

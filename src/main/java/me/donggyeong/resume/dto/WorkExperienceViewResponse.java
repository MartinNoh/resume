package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.domain.WorkExperience;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

@NoArgsConstructor
@Getter
public class WorkExperienceViewResponse {
    private Long id;
    private WorkCompany workCompany;
    private String project;
    private LocalDate startDate;
    private LocalDate endDate;
    private String content;
    private String role;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WorkExperienceViewResponse(WorkExperience workExperience) {
        this.id = workExperience.getId();
        this.workCompany = workExperience.getWorkCompany();
        this.project = workExperience.getProject();
        this.startDate = workExperience.getStartDate();
        this.endDate = workExperience.getEndDate();
        this.role = workExperience.getRole();
        this.content = workExperience.getContent();
        this.inUse = workExperience.getInUse();
        this.createdAt = workExperience.getCreatedAt();
        this.updatedAt = workExperience.getUpdatedAt();
    }
}

package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Skill;
import me.donggyeong.resume.domain.SkillCategory;
import me.donggyeong.resume.domain.Work;
import me.donggyeong.resume.domain.WorkCompany;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;

@NoArgsConstructor
@Getter
public class WorkCompanyViewResponse {
    private Long id;
    private Work work;
    private String name;
    private String role;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isPresent;
    private String imagePath;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WorkCompanyViewResponse(WorkCompany workCompany) {
        this.id = workCompany.getId();
        this.work = workCompany.getWork();
        this.name = workCompany.getName();
        this.role = workCompany.getRole();
        this.startDate = workCompany.getStartDate();
        this.endDate = workCompany.getEndDate();
        this.isPresent = workCompany.getIsPresent();
        this.imagePath = workCompany.getImagePath();
        this.inUse = workCompany.getInUse();
        this.createdAt = workCompany.getCreatedAt();
        this.updatedAt = workCompany.getUpdatedAt();
    }
}

package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Education;
import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.Work;
import me.donggyeong.resume.domain.WorkCompany;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class EducationInstituteViewResponse {
    private Long id;
    private Education education;
    private String name;
    private String learning;
    private LocalDate startDate;
    private LocalDate endDate;
    private String imagePath;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EducationInstituteViewResponse(EducationInstitute educationInstitute) {
        this.id = educationInstitute.getId();
        this.education = educationInstitute.getEducation();
        this.name = educationInstitute.getName();
        this.learning = educationInstitute.getLearning();
        this.startDate = educationInstitute.getStartDate();
        this.endDate = educationInstitute.getEndDate();
        this.imagePath = educationInstitute.getImagePath();
        this.inUse = educationInstitute.getInUse();
        this.createdAt = educationInstitute.getCreatedAt();
        this.updatedAt = educationInstitute.getUpdatedAt();
    }
}

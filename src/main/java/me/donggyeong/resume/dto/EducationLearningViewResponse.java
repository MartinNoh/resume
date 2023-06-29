package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.EducationLearning;
import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.domain.WorkExperience;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class EducationLearningViewResponse {
    private Long id;
    private EducationInstitute educationInstitute;
    private String course;
    private LocalDate startDate;
    private LocalDate endDate;
    private String content;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EducationLearningViewResponse(EducationLearning educationLearning) {
        this.id = educationLearning.getId();
        this.educationInstitute = educationLearning.getEducationInstitute();
        this.course = educationLearning.getCourse();
        this.startDate = educationLearning.getStartDate();
        this.endDate = educationLearning.getEndDate();
        this.content = educationLearning.getContent();
        this.inUse = educationLearning.getInUse();
        this.createdAt = educationLearning.getCreatedAt();
        this.updatedAt = educationLearning.getUpdatedAt();
    }
}

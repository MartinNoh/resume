package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Education;
import me.donggyeong.resume.domain.Work;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class EducationViewResponse {
    private Long id;
    private String description;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public EducationViewResponse(Education education) {
        this.id = education.getId();
        this.description = education.getDescription();
        this.inUse = education.getInUse();
        this.createdAt = education.getCreatedAt();
        this.updatedAt = education.getUpdatedAt();
    }
}

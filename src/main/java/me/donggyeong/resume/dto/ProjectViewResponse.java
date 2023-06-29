package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Project;
import me.donggyeong.resume.domain.Work;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ProjectViewResponse {
    private Long id;
    private String description;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProjectViewResponse(Project project) {
        this.id = project.getId();
        this.description = project.getDescription();
        this.inUse = project.getInUse();
        this.createdAt = project.getCreatedAt();
        this.updatedAt = project.getUpdatedAt();
    }
}

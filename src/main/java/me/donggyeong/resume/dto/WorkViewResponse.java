package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Work;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class WorkViewResponse {
    private Long id;
    private String description;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public WorkViewResponse(Work work) {
        this.id = work.getId();
        this.description = work.getDescription();
        this.inUse = work.getInUse();
        this.createdAt = work.getCreatedAt();
        this.updatedAt = work.getUpdatedAt();
    }
}

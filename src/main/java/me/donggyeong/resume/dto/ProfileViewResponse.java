package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Profile;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ProfileViewResponse {
    private Long id;
    private String title;
    private String description;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProfileViewResponse(Profile profile) {
        this.id = profile.getId();
        this.title = profile.getTitle();
        this.description = profile.getDescription();
        this.inUse = profile.getInUse();
        this.createdAt = profile.getCreatedAt();
        this.updatedAt = profile.getUpdatedAt();
    }
}

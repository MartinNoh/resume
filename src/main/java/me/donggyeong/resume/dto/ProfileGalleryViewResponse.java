package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Profile;
import me.donggyeong.resume.domain.ProfileGallery;
import me.donggyeong.resume.domain.ProfileStat;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ProfileGalleryViewResponse {
    private Long id;
    private Profile profile;
    private String title;
    private String imagePath;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProfileGalleryViewResponse(ProfileGallery profileGallery) {
        this.id = profileGallery.getId();
        this.profile = profileGallery.getProfile();
        this.title = profileGallery.getTitle();
        this.imagePath = profileGallery.getImagePath();
        this.sequence = profileGallery.getSequence();
        this.inUse = profileGallery.getInUse();
        this.createdAt = profileGallery.getCreatedAt();
        this.updatedAt = profileGallery.getUpdatedAt();
    }
}

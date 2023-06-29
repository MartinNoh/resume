package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Profile;
import me.donggyeong.resume.domain.ProfileStat;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ProfileStatViewResponse {
    private Long id;
    private Profile profile;
    private String item;
    private String content;
    private Integer sequence;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public ProfileStatViewResponse(ProfileStat profileStat) {
        this.id = profileStat.getId();
        this.profile = profileStat.getProfile();
        this.item = profileStat.getItem();
        this.content = profileStat.getContent();
        this.sequence = profileStat.getSequence();
        this.inUse = profileStat.getInUse();
        this.createdAt = profileStat.getCreatedAt();
        this.updatedAt = profileStat.getUpdatedAt();
    }
}

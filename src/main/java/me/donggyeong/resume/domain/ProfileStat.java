package me.donggyeong.resume.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProfileStat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private Profile profile;

    @Column(name = "item", nullable = false)
    private String item;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "sequence", nullable = false)
    private Integer sequence;


    @Column(name = "in_use", nullable = false)
    private Boolean inUse;

    @PrePersist
    public void prePersist() {
        this.sequence = this.sequence == null ? 1 : this.sequence;
        this.inUse = this.inUse == null ? true : this.inUse;
    }

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Builder
    public ProfileStat(Profile profile, String item, String content, int sequence, boolean inUse) {
        this.profile = profile;
        this.item = item;
        this.content = content;
        this.sequence = sequence;
        this.inUse = inUse;
    }

    public void update(Profile profile, String item, String content, int sequence, boolean inUse) {
        this.profile = profile;
        this.item = item;
        this.content = content;
        this.sequence = sequence;
        this.inUse = inUse;
    }
}

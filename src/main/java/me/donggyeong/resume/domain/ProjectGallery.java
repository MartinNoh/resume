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
public class ProjectGallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private ProjectItem projectItem;

    @Column(name = "media_path", nullable = false)
    private String mediaPath;

    @Column(name = "extension", nullable = false)
    private String extension;

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
    public ProjectGallery(ProjectItem projectItem, String mediaPath, String extension, int sequence, boolean inUse) {
        this.projectItem = projectItem;
        this.mediaPath = mediaPath;
        this.extension = extension;
        this.sequence = sequence;
        this.inUse = inUse;
    }

    public void update(ProjectItem projectItem, String mediaPath, String extension, int sequence, boolean inUse) {
        this.projectItem = projectItem;
        this.mediaPath = mediaPath;
        this.extension = extension;
        this.sequence = sequence;
        this.inUse = inUse;
    }
}

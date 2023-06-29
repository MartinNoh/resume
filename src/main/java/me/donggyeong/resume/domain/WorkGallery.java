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
public class WorkGallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private WorkExperience workExperience;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "image_path", nullable = false)
    private String imagePath;

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
    public WorkGallery(WorkExperience workExperience, String name, String imagePath, int sequence, boolean inUse) {
        this.workExperience = workExperience;
        this.name = name;
        this.imagePath = imagePath;
        this.sequence = sequence;
        this.inUse = inUse;
    }

    public void update(WorkExperience workExperience, String name, String imagePath, int sequence, boolean inUse) {
        this.workExperience = workExperience;
        this.name = name;
        this.imagePath = imagePath;
        this.sequence = sequence;
        this.inUse = inUse;
    }
}

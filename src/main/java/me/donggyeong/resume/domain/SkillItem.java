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
public class SkillItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private SkillCategory skillCategory;

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
        this.inUse = this.inUse == null ? true : this.inUse;
    }

    @CreatedDate // 엔티티가 생성될 때 시간 저장
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate // 엔티티가 수정될 때 시간 저장
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Builder // 빌더 패턴으로 객체 생성
    public SkillItem(SkillCategory skillCategory, String name, String imagePath, Integer sequence, boolean inUse) {
        this.skillCategory = skillCategory;
        this.name = name;
        this.imagePath = imagePath;
        this.sequence = sequence;
        this.inUse = inUse;
    }

    public void update(SkillCategory skillCategory, String name, String imagePath, Integer sequence, boolean inUse) {
        this.skillCategory = skillCategory;
        this.name = name;
        this.imagePath = imagePath;
        this.sequence = sequence;
        this.inUse = inUse;
    }
}

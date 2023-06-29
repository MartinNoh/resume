package me.donggyeong.resume.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ProjectItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private Project project;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brief_description", nullable = false)
    private String briefDescription;

    @Column(name = "main_image_path", nullable = false)
    private String mainImagePath;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "category", nullable = false)
    private String category;

    @Column(name = "feature", nullable = false)
    private String feature;

    @Column(name = "long_description", nullable = false, length = 1000)
    private String longDescription;

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

    @OneToMany(mappedBy = "projectItem", cascade = CascadeType.REMOVE)
    private List<ProjectGallery> projectGalleryList;

    @Builder // 빌더 패턴으로 객체 생성
    public ProjectItem(Project project, String name, String briefDescription, String mainImagePath, LocalDate startDate, LocalDate endDate, String category, String feature, String longDescription, boolean inUse) {
        this.project = project;
        this.name = name;
        this.briefDescription = briefDescription;
        this.mainImagePath = mainImagePath;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.feature = feature;
        this.longDescription = longDescription;
        this.inUse = inUse;
    }

    public void update(Project project, String name, String briefDescription, String mainImagePath, LocalDate startDate, LocalDate endDate, String category, String feature, String description, boolean inUse) {
        this.project = project;
        this.name = name;
        this.briefDescription = briefDescription;
        this.mainImagePath = mainImagePath;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
        this.feature = feature;
        this.longDescription = longDescription;
        this.inUse = inUse;
    }
}

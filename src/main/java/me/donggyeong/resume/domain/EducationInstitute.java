package me.donggyeong.resume.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EducationInstitute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private Education education;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "learning", nullable = false)
    private String learning;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "image_path", nullable = false)
    private String imagePath;

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

    @OneToMany(mappedBy = "educationInstitute", cascade = CascadeType.REMOVE)
    private List<EducationLearning> educationLearningList;

    @OneToMany(mappedBy = "educationInstitute", cascade = CascadeType.REMOVE)
    private List<EducationGallery> educationGalleryList;

    @Builder // 빌더 패턴으로 객체 생성
    public EducationInstitute(Education education, String name, String learning, LocalDate startDate, LocalDate endDate, String imagePath, boolean inUse) {
        this.education = education;
        this.name = name;
        this.learning = learning;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imagePath = imagePath;
        this.inUse = inUse;
    }

    public void update(Education education, String name, LocalDate startDate, LocalDate endDate, String imagePath, boolean inUse) {
        this.education = education;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imagePath = imagePath;
        this.inUse = inUse;
    }
}

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
public class EducationLearning {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private EducationInstitute educationInstitute;

    @Column(name = "course", nullable = false)
    private String course;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "content")
    private String content;

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
    public EducationLearning(EducationInstitute educationInstitute, String course, LocalDate startDate, LocalDate endDate, String content, boolean inUse) {
        this.educationInstitute = educationInstitute;
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.content = content;
        this.inUse = inUse;
    }

    public void update(EducationInstitute educationInstitute, String course, LocalDate startDate, LocalDate endDate, String content, boolean inUse) {
        this.educationInstitute = educationInstitute;
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.content = content;
        this.inUse = inUse;
    }
}

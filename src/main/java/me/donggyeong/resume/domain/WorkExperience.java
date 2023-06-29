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
import java.time.Month;
import java.time.Year;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private WorkCompany workCompany;

    @Column(name = "project", nullable = false)
    private String project;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "role", nullable = false)
    private String role;

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

    @OneToMany(mappedBy = "workExperience", cascade = CascadeType.REMOVE)
    private List<WorkGallery> workGalleryList;

    @Builder // 빌더 패턴으로 객체 생성
    public WorkExperience(WorkCompany workCompany, String project, LocalDate startDate, LocalDate endDate, String content, String role, boolean inUse) {
        this.workCompany = workCompany;
        this.project = project;
        this.startDate = startDate;
        this.endDate = endDate;
        this.content = content;
        this.role = role;
        this.inUse = inUse;
    }

    public void update(WorkCompany workCompany, String project, LocalDate startDate, LocalDate endDate, String content, String role, boolean inUse) {
        this.workCompany = workCompany;
        this.project = project;
        this.startDate = startDate;
        this.endDate = endDate;
        this.content = content;
        this.role = role;
        this.inUse = inUse;
    }
}

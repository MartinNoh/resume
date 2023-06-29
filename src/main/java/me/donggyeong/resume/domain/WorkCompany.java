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
import java.time.Year;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class WorkCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private Work work;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "role", nullable = false)
    private String role;

    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "is_present", nullable = false)
    private Boolean isPresent;

    @Column(name = "image_path")
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

    @OneToMany(mappedBy = "workCompany", cascade = CascadeType.REMOVE)
    private List<WorkExperience> workExperienceList;

    @Builder // 빌더 패턴으로 객체 생성
    public WorkCompany(Work work, String name, String role, LocalDate startDate, LocalDate endDate, Boolean isPresent, String imagePath, boolean inUse) {
        this.work = work;
        this.name = name;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPresent = isPresent;
        this.imagePath = imagePath;
        this.inUse = inUse;
    }

    public void update(Work work, String name, String role, LocalDate startDate, LocalDate endDate, Boolean isPresent, String imagePath, boolean inUse) {
        this.work = work;
        this.name = name;
        this.role = role;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPresent = isPresent;
        this.imagePath = imagePath;
        this.inUse = inUse;
    }
}

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
public class CertificateItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;

    @ManyToOne
    private Certificate certificate;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "acquisition_date", nullable = false)
    private LocalDate acquisitionDate;

    @Column(name = "institution", nullable = false)
    private String institution;

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

    @Builder // 빌더 패턴으로 객체 생성
    public CertificateItem(Certificate certificate, String name, LocalDate acquisitionDate, String institution, String imagePath, boolean inUse) {
        this.certificate = certificate;
        this.name = name;
        this.acquisitionDate = acquisitionDate;
        this.institution = institution;
        this.imagePath = imagePath;
        this.inUse = inUse;
    }

    public void update(Certificate certificate, String name, LocalDate acquisitionDate, String institution, String imagePath, boolean inUse) {
        this.certificate = certificate;
        this.name = name;
        this.acquisitionDate = acquisitionDate;
        this.institution = institution;
        this.imagePath = imagePath;
        this.inUse = inUse;
    }
}

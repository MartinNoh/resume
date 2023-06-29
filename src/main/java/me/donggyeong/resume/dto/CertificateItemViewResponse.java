package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Certificate;
import me.donggyeong.resume.domain.CertificateItem;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class CertificateItemViewResponse {
    private Long id;
    private Certificate certificate;
    private String name;
    private LocalDate acquisitionDate;
    private String institution;
    private String imagePath;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CertificateItemViewResponse(CertificateItem certificateItem) {
        this.id = certificateItem.getId();
        this.certificate = certificateItem.getCertificate();
        this.name = certificateItem.getName();
        this.acquisitionDate = certificateItem.getAcquisitionDate();
        this.institution = certificateItem.getInstitution();
        this.imagePath = certificateItem.getImagePath();
        this.inUse = certificateItem.getInUse();
        this.createdAt = certificateItem.getCreatedAt();
        this.updatedAt = certificateItem.getUpdatedAt();
    }
}

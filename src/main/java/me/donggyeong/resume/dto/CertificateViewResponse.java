package me.donggyeong.resume.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.donggyeong.resume.domain.Certificate;
import me.donggyeong.resume.domain.Education;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class CertificateViewResponse {
    private Long id;
    private String description;
    private Boolean inUse;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CertificateViewResponse(Certificate certificate) {
        this.id = certificate.getId();
        this.description = certificate.getDescription();
        this.inUse = certificate.getInUse();
        this.createdAt = certificate.getCreatedAt();
        this.updatedAt = certificate.getUpdatedAt();
    }
}

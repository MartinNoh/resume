package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Certificate;
import me.donggyeong.resume.domain.Education;
import me.donggyeong.resume.repository.CertificateRepository;
import me.donggyeong.resume.repository.EducationRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CertificateService {

    private final CertificateRepository certificateRepository;

    public Certificate findFirstByOrderByIdDesc() {
        return certificateRepository.findFirstByOrderByIdDesc();
    }
}

package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Certificate;
import me.donggyeong.resume.domain.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
    Certificate findFirstByOrderByIdDesc();
}

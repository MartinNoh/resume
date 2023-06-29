package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.CertificateItem;
import me.donggyeong.resume.domain.ProjectItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateItemRepository extends JpaRepository<CertificateItem, Long>, CertificateItemRepositoryCustom {
}

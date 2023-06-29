package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.WorkCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkCompanyRepository extends JpaRepository<WorkCompany, Long>, WorkCompanyRepositoryCustom {
}

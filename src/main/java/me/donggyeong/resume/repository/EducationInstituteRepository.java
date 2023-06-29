package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.WorkCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationInstituteRepository extends JpaRepository<EducationInstitute, Long>, EducationInstituteRepositoryCustom {
}

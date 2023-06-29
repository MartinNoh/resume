package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.EducationInstitute;
import me.donggyeong.resume.domain.WorkCompany;

import java.util.List;

public interface EducationInstituteRepositoryCustom {
    List<EducationInstitute> findAllInUseOrderByStartYear();
}

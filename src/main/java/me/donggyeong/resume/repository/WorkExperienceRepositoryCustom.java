package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.WorkCompany;
import me.donggyeong.resume.domain.WorkExperience;

import java.util.List;

public interface WorkExperienceRepositoryCustom {
    List<WorkExperience> findAllInUseOrderByStartDate();
}

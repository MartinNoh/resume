package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.EducationLearning;
import me.donggyeong.resume.domain.WorkExperience;

import java.util.List;

public interface EducationLearningRepositoryCustom {
    List<EducationLearning> findAllInUseOrderByStartDate();
}

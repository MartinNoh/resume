package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.EducationLearning;
import me.donggyeong.resume.domain.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationLearningRepository extends JpaRepository<EducationLearning, Long>, EducationLearningRepositoryCustom {
}

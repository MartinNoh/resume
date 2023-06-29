package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Education;
import me.donggyeong.resume.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepository extends JpaRepository<Education, Long> {
    Education findFirstByOrderByIdDesc();
}

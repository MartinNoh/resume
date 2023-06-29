package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<Work, Long> {
    Work findFirstByOrderByIdDesc();
}

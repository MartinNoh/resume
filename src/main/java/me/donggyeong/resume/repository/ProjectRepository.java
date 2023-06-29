package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Project;
import me.donggyeong.resume.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findFirstByOrderByIdDesc();
}

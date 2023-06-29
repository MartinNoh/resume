package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Project;
import me.donggyeong.resume.domain.Work;
import me.donggyeong.resume.repository.ProjectRepository;
import me.donggyeong.resume.repository.WorkRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public Project findFirstByOrderByIdDesc() {
        return projectRepository.findFirstByOrderByIdDesc();
    }
}

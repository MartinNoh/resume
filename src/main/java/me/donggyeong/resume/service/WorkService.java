package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Work;
import me.donggyeong.resume.repository.WorkRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WorkService {

    private final WorkRepository workRepository;

    public Work findFirstByOrderByIdDesc() {
        return workRepository.findFirstByOrderByIdDesc();
    }
}

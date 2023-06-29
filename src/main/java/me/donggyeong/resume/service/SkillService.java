package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Profile;
import me.donggyeong.resume.domain.Skill;
import me.donggyeong.resume.repository.SkillRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public Skill findFirstByOrderByIdDesc() {
        return skillRepository.findFirstByOrderByIdDesc();
    }
}

package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.SkillCategory;
import me.donggyeong.resume.repository.SkillCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SkillCategoryService {

    private final SkillCategoryRepository skillCategoryRepository;

    public List<SkillCategory> findAllInUseOrderBySequence() {
        return skillCategoryRepository.findAllInUseOrderBySequence();
    }
}

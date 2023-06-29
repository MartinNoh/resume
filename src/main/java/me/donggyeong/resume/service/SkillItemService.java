package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.SkillItem;
import me.donggyeong.resume.repository.SkillItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SkillItemService {

    private final SkillItemRepository skillItemRepository;

    public List<SkillItem> findAllInUseOrderBySequence() {
        return skillItemRepository.findAllInUseOrderBySequence();
    }
}

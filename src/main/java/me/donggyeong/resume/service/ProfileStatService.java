package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.ProfileStat;
import me.donggyeong.resume.repository.ProfileStatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProfileStatService {

    private final ProfileStatRepository profileStatRepository;

    public List<ProfileStat> findAllInUseOrderBySequence() {
        return profileStatRepository.findAllInUseOrderBySequence();
    }
}

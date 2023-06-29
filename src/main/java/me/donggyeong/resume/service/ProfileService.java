package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.Profile;
import me.donggyeong.resume.repository.ProfileRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    public Profile findFirstByOrderByIdDesc() {
        return profileRepository.findFirstByOrderByIdDesc();
    }
}

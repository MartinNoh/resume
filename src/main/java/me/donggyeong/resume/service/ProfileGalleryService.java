package me.donggyeong.resume.service;

import lombok.RequiredArgsConstructor;
import me.donggyeong.resume.domain.ProfileGallery;
import me.donggyeong.resume.domain.ProfileStat;
import me.donggyeong.resume.repository.ProfileGalleryRepository;
import me.donggyeong.resume.repository.ProfileStatRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProfileGalleryService {

    private final ProfileGalleryRepository profileGalleryRepository;

    public List<ProfileGallery> findAllInUseOrderBySequence() {
        return profileGalleryRepository.findAllInUseOrderBySequence();
    }
}

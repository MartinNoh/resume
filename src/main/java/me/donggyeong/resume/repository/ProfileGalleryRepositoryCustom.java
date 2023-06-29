package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProfileGallery;

import java.util.List;

public interface ProfileGalleryRepositoryCustom {
    List<ProfileGallery> findAllInUseOrderBySequence();
}

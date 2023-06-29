package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProfileStat;

import java.util.List;

public interface ProfileStatRepositoryCustom {
    List<ProfileStat> findAllInUseOrderBySequence();
}

package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.ProfileStat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileStatRepository extends JpaRepository<ProfileStat, Long>, ProfileStatRepositoryCustom {
}

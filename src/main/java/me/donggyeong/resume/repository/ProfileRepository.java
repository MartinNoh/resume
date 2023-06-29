package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
    Profile findFirstByOrderByIdDesc();
}

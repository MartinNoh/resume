package me.donggyeong.resume.repository;

import me.donggyeong.resume.domain.Contact;
import me.donggyeong.resume.domain.Work;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    Contact findFirstByOrderByIdDesc();
}

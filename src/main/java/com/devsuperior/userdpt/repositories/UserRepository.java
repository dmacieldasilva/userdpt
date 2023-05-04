package com.devsuperior.userdpt.repositories;

import com.devsuperior.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}




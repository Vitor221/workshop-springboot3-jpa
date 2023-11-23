package com.vitoreduardo.course.repositories;

import com.vitoreduardo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

package org.william.cruddpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.william.cruddpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

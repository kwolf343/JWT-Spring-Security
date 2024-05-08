package com.security.persistence.repositories;

import com.security.persistence.entities.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
    @Query(value = "SELECT * FROM user WHERE email = :email", nativeQuery = true)
    Optional<UserEntity> findByEmail(String email);
}

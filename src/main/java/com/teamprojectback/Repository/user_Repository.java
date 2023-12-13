package com.teamprojectback.Repository;


import com.teamprojectback.Entity.user_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user_Repository extends JpaRepository<user_Entity, String> {
    public boolean existsByEmail(String email);
    public boolean existsByEmailAndPassword(String email, String password);
}

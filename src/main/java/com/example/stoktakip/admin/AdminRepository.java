package com.example.stoktakip.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    @Query("SELECT i FROM Admin i WHERE i.id = ?1")
    Optional<Admin> findAdminById(Long adminId);
}

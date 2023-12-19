package com.example.stoktakip.personel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonelRepository  extends JpaRepository<Personel,Long> {

    @Query("SELECT i FROM Personel i WHERE i.id = ?1")
    Optional<Personel> findPersonelById(Long personelId);

    Personel findAllById(Long personelId);
}

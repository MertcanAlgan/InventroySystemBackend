package com.example.stoktakip.demirbas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DemirbasRepository extends JpaRepository<Demirbas,Long> {
    @Query("SELECT i FROM Demirbas i WHERE i.id=?1")
    Optional<Demirbas> findDemirbasById(Long demirbasId);
    List<Demirbas> findDemirbasByPersonelId(Long personelId);

}

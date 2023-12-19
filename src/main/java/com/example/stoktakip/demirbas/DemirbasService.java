package com.example.stoktakip.demirbas;

import com.example.stoktakip.personel.PersonelRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemirbasService {

    @Autowired
    private DemirbasRepository demirbasRepository;
    @Autowired
    private PersonelRepository personelRepository;
    public DemirbasService(DemirbasRepository demirbasRepository){
        this.demirbasRepository = demirbasRepository;
    }
    public List<Demirbas> getDemirbas(){return demirbasRepository.findAll();}
    public List<Demirbas> getDemirbasByPersonelId(Long personelId){return demirbasRepository.findDemirbasByPersonelId(personelId);}
    public Demirbas addNewDemirbas(Demirbas demirbas){return demirbasRepository.save(demirbas);}
    public void deleteDemirbas(Long demirbasId){
        boolean exists = demirbasRepository.existsById(demirbasId);
        if (!exists){
            throw new IllegalStateException(demirbasId +" Bulunamadı");
        }
        demirbasRepository.deleteById(demirbasId);
    }
    @Transactional
    public void updateDemirbas(Demirbas demirbas){demirbasRepository.save(demirbas);}


}

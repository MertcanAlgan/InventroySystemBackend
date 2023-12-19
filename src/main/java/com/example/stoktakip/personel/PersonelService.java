package com.example.stoktakip.personel;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonelService {
    private final PersonelRepository personelRepository;
    public PersonelService(PersonelRepository personelRepository){
        this.personelRepository = personelRepository;
    }
    public List<Personel> getPersonel(){return personelRepository.findAll();}
    public void addNewPersonel(Personel personel){personelRepository.save(personel);}
    public void deletePersonel(Long personelId){
        boolean exists = personelRepository.existsById(personelId);
        if(!exists){
            throw new IllegalStateException(personelId + " Bulunamadı");
        }
        personelRepository.deleteById(personelId);
    }

    @Transactional
    public void updatePersonel(Personel personel){Personel dbPersonel = personelRepository.findById(personel.getId()).orElseThrow(()->new IllegalStateException((personel.getId()+" bulunmuyor")));
        personelRepository.save(personel);}
}

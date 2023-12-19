package com.example.stoktakip.personel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class PersonelController {
    private final PersonelService personelService;
    @Autowired
    public PersonelController(PersonelService personelService){
        this.personelService = personelService;
    }
    @GetMapping("personel")
    public List<Personel> getPersonel(){return personelService.getPersonel();}
    @PostMapping("personel")
    public void addPersonel(@RequestBody Personel personel){personelService.addNewPersonel(personel);}
    @DeleteMapping("personel/{personelId}")
    public void deletePersonel(@PathVariable("personelId") Long personelId){
        personelService.deletePersonel(personelId);
    }
    @PutMapping("personel")
    public void updatePersonel(@RequestBody Personel personel){personelService.updatePersonel(personel);}
}

package com.example.stoktakip.demirbas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
public class DemirbasController {

    @Autowired
    private DemirbasService demirbasService;
    @Autowired
    public DemirbasController(DemirbasService demirbasService){
        this.demirbasService = demirbasService;
    }
    @GetMapping("demirbas")
    public List<Demirbas> getDemirbas(){return demirbasService.getDemirbas();}
    @GetMapping("demirbas/{personelId}")
    public List<Demirbas> getPersonelById(@PathVariable("personelId") Long personelId) {
       return demirbasService.getDemirbasByPersonelId(personelId);
    }
    @PostMapping("demirbas")
    public Demirbas addDemirbas(@RequestBody Demirbas demirbas){
        return demirbasService.addNewDemirbas(demirbas);}
    @DeleteMapping("demirbas/{demirbasId}")
    public void deleteDemirbas(@PathVariable("demirbasId") Long demirbasId){
        demirbasService.deleteDemirbas(demirbasId);
    }
    @PutMapping("demirbas")
    public void updateDemirbas(@RequestBody Demirbas demirbas){demirbasService.updateDemirbas(demirbas);}
}

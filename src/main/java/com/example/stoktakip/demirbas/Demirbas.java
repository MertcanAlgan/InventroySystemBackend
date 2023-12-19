package com.example.stoktakip.demirbas;

import com.example.stoktakip.personel.Personel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Demirbas implements Serializable {
    @Id
    @SequenceGenerator(
            name = "demirbas_sequence",
            sequenceName = "demirbas_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "demirbas_sequence"
    )

    private Long id;
    private String type;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "personel_id", referencedColumnName = "id")
    private Personel personel;
    private String lokasyon;
    private String mulkiyet;
    private String seriNo;
    private String marka;
    private String model;
    private String cpu;
    private String gpu;
    private String ram;
    private String hafiza;
    private String ekranBoyutu;
    private String ekranCozunurlugu;
    private String tahsisTarihi;
    private String alimTarihi;
    private String alinanFirma;
    private String alinanFirmaIrtibat;


    public Demirbas(Long id, String type, Personel personel, String lokasyon, String mulkiyet, String seriNo, String marka, String model, String cpu, String gpu, String ram, String hafiza, String ekranBoyutu, String ekranCozunurlugu, String tahsisTarihi, String alimTarihi, String alinanFirma, String alinanFirmaIrtibat) {
        this.id = id;
        this.type = type;
        this.personel = personel;
        this.lokasyon = lokasyon;
        this.mulkiyet = mulkiyet;
        this.seriNo = seriNo;
        this.marka = marka;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.ekranCozunurlugu = ekranCozunurlugu;
        this.tahsisTarihi = tahsisTarihi;
        this.alimTarihi = alimTarihi;
        this.alinanFirma = alinanFirma;
        this.alinanFirmaIrtibat = alinanFirmaIrtibat;
    }

    public Demirbas(String type, Personel personel, String lokasyon, String mulkiyet, String seriNo, String marka, String model, String cpu, String gpu, String ram, String hafiza, String ekranBoyutu, String ekranCozunurlugu, String tahsisTarihi, String alimTarihi, String alinanFirma, String alinanFirmaIrtibat) {
        this.type = type;
        this.personel = personel;
        this.lokasyon = lokasyon;
        this.mulkiyet = mulkiyet;
        this.seriNo = seriNo;
        this.marka = marka;
        this.model = model;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.hafiza = hafiza;
        this.ekranBoyutu = ekranBoyutu;
        this.ekranCozunurlugu = ekranCozunurlugu;
        this.tahsisTarihi = tahsisTarihi;
        this.alimTarihi = alimTarihi;
        this.alinanFirma = alinanFirma;
        this.alinanFirmaIrtibat = alinanFirmaIrtibat;
    }

    public Demirbas() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Personel getPersonel() {
        return personel;
    }

    public void setPersonel(Personel personel) {
        this.personel = personel;
    }

    public String getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(String lokasyon) {
        this.lokasyon = lokasyon;
    }

    public String getMulkiyet() {
        return mulkiyet;
    }

    public void setMulkiyet(String mulkiyet) {
        this.mulkiyet = mulkiyet;
    }

    public String getSeriNo() {
        return seriNo;
    }

    public void setSeriNo(String seriNo) {
        this.seriNo = seriNo;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHafiza() {
        return hafiza;
    }

    public void setHafiza(String hafiza) {
        this.hafiza = hafiza;
    }

    public String getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(String ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public String getEkranCozunurlugu() {
        return ekranCozunurlugu;
    }

    public void setEkranCozunurlugu(String ekranCozunurlugu) {
        this.ekranCozunurlugu = ekranCozunurlugu;
    }

    public String getTahsisTarihi() {
        return tahsisTarihi;
    }

    public void setTahsisTarihi(String tahsisTarihi) {
        this.tahsisTarihi = tahsisTarihi;
    }

    public String getAlimTarihi() {
        return alimTarihi;
    }

    public void setAlimTarihi(String alimTarihi) {
        this.alimTarihi = alimTarihi;
    }

    public String getAlinanFirma() {
        return alinanFirma;
    }

    public void setAlinanFirma(String alinanFirma) {
        this.alinanFirma = alinanFirma;
    }

    public String getAlinanFirmaIrtibat() {
        return alinanFirmaIrtibat;
    }

    public void setAlinanFirmaIrtibat(String alinanFirmaIrtibat) {
        this.alinanFirmaIrtibat = alinanFirmaIrtibat;
    }

    @Override
    public String toString() {
        return "Demirbas{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", lokasyon='" + lokasyon + '\'' +
                ", mulkiyet='" + mulkiyet + '\'' +
                ", seriNo='" + seriNo + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hafiza='" + hafiza + '\'' +
                ", ekranBoyutu='" + ekranBoyutu + '\'' +
                ", ekranCozunurlugu='" + ekranCozunurlugu + '\'' +
                ", tahsisTarihi='" + tahsisTarihi + '\'' +
                ", alimTarihi='" + alimTarihi + '\'' +
                ", alinanFirma='" + alinanFirma + '\'' +
                ", alinanFirmaIrtibat='" + alinanFirmaIrtibat + '\'' +
                '}';
    }
}

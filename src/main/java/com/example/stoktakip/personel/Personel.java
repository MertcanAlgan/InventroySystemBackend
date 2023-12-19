epackage com.example.stoktakip.personel;


import com.example.stoktakip.demirbas.Demirbas;
import jakarta.persistence.*;



@Entity
@Table
public class Personel {
    @Id
    @SequenceGenerator(
            name = "personel_sequence",
            sequenceName = "personel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "personel_sequence"
    )
    private Long id;
    private String isim;
    private String soyIsim;
    private String birim;
    private String lokasyon;

    public Personel(Long id, String isim, String soyIsim, String birim, String lokasyon) {
        this.id = id;
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.birim = birim;
        this.lokasyon = lokasyon;
    }

    public Personel(String isim, String soyIsim, String birim, String lokasyon) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.birim = birim;
        this.lokasyon = lokasyon;
    }

    public Personel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public String getLokasyon() {
        return lokasyon;
    }

    public void setLokasyon(String lokasyon) {
        this.lokasyon = lokasyon;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }




    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", birim='" + birim + '\'' +
                ", lokasyon='" + lokasyon + '\'' +
                '}';
    }
}

package kodlama.io.devs.Kodlama.io.devs.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "languages")
@Data //getter setterlar
@AllArgsConstructor // constructor oluşturalim
@NoArgsConstructor // parametresiz de constructor oluşturmak istiyorum
@Entity // sen bir veritabanı varlığısın
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id'yi otomatik arttır
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;





}

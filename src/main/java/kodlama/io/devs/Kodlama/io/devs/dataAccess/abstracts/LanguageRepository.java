package kodlama.io.devs.Kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.Kodlama.io.devs.entities.concretes.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
// concrete kullanmıyoruz şimdilik tek veritabanı üzerinden gidiyoruz ileri seviyeye geçmiyoruz

public interface LanguageRepository extends JpaRepository<Language, Integer> {

    void add(Language language);
    void editName(int id, String name) throws Exception;

}


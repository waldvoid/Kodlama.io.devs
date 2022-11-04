package kodlama.io.devs.Kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.Kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.Kodlama.io.devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;
    boolean result;

    public InMemoryLanguageRepository() {
        languages = new ArrayList<>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"JavaScript"));
        languages.add(new Language(3,"C#"));
        languages.add(new Language(4,"Python"));
        languages.add(new Language(5, "Go"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    public void add(Language language) {
        languages.add(language);
    }

    public void remove(int id) throws Exception {
        result = false;
        for (Iterator<Language> l = languages.iterator(); l.hasNext();) {
            Language language = l.next();
            if (language.getId() == id) {
                l.remove();
                System.out.println("Dil Silindi");
                result = true;
            }
        }
        if (!result) {
            throw new Exception("Bu id ile bir dil mevcut değil tekrar dene");
        }
    }

    public void editName(int id, String newName) throws Exception {
        result = false;
        for (Language l: languages) {
            if (l.getId() == id) {
                l.setName(newName);
                System.out.println("Dil ismi değiştirildi");
                result = true;
            }
            }
        if (!result) {
            throw new Exception("Bu id ile bir dil mevcut değil tekrar dene");
        }

    }
}

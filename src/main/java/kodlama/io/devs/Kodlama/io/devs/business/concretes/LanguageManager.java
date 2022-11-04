package kodlama.io.devs.Kodlama.io.devs.business.concretes;

import kodlama.io.devs.Kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.Kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.Kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }
    public List<Language> add(Language language) throws Exception {
        for (Language l : languageRepository.getAll()) {
            if (language.getName().equals(l.getName())) {
                throw new Exception("Girdiğiniz isimde programalama dili mevcuttur");
            } else if (language.getName().equals("")) {
                throw new Exception("Programlama dili boş geçilemez");
            } else {
                languageRepository.add(language);
            }
        }
        return null;
    }
    public List<Language> remove(int id) throws Exception{
        languageRepository.remove(id);
        return null;
    }
    public List<Language> editName(int id, String newName) throws Exception{
        languageRepository.editName(id, newName);
        return null;
    }
}

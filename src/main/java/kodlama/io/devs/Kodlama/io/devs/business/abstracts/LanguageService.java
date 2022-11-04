package kodlama.io.devs.Kodlama.io.devs.business.abstracts;

import kodlama.io.devs.Kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getAll();
    List<Language> add(Language language) throws Exception;
    List<Language> remove(int id) throws Exception;
    List<Language> editName(int id, String newName) throws Exception;
}

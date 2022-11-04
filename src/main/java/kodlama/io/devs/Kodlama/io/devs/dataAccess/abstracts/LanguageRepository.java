package kodlama.io.devs.Kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.Kodlama.io.devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getAll();
    void remove(int id) throws Exception;
    void add(Language language);
    void editName(int id, String name) throws Exception;

}


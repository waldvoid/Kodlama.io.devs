package kodlama.io.devs.Kodlama.io.devs.webApi;

import kodlama.io.devs.Kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.Kodlama.io.devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;
    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll() {
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Language language) throws Exception {
        languageService.add(language);
    }
    @DeleteMapping("/remove/{id}")
    public void remove(@PathVariable int id) throws Exception {
        languageService.remove(id);
    }

    @PutMapping("/editname/{id}/{newName}")
    public void editName(@PathVariable int id, @PathVariable String newName) throws Exception {
        languageService.editName(id, newName);
    }
}

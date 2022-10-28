package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<Language> getlAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/add")
	public void add(Language language) {
		languageService.add(language);
	}
	
	@GetMapping("/delete")
	public void delete(int id) {
		languageService.delete(id);
	}
	
	@GetMapping("/update")
	public void update(Language language, int id) {
		languageService.update(language, id);
	}
	
	@GetMapping("/getLanguageById")
	public Language getLanguageById(int id) {
		return languageService.getLanguageById(id);
	}
	
	
}

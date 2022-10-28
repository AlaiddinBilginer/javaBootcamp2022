package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguageService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Language;

@Service //Bu sınıf bir business nesnesidir.
public class LanguageMenager implements LanguageService{
	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageMenager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		//iş kuralları
		return languageRepository.getAll();
	}

	@Override
	public void add(Language language) {
		//iş kuralları
		if(language.getName().isEmpty() || language.getName().isBlank()) {
			throw new RuntimeException("Programlama dili bos gecilemez!");
		}
		else {
			languageRepository.add(language);
		}	
	}

	@Override
	public void delete(int id) {
		//iş kuralları
		languageRepository.delete(id);
	}

	@Override
	public void update(Language language, int id) {
		//iş kuralları
		languageRepository.update(language, id);
	}

	@Override
	public Language getLanguageById(int id) {
		//iş kuralları
		return languageRepository.getLanguageById(id);
	}

}

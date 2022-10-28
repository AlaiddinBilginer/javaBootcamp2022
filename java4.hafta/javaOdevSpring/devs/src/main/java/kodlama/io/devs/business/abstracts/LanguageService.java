package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void add(Language language);
	void delete(int id);
	void update(Language language, int id);
	Language getLanguageById(int id);
}

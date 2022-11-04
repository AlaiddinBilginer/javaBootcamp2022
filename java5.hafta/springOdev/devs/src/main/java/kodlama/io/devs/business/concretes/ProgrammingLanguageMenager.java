package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.request.RemoveProgrammingLanguageRequest;
import kodlama.io.devs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguagesResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageMenager implements ProgrammingLanguageService{
	private ProgrammingLanguageRepository languageRepository;
	
	@Autowired
	public ProgrammingLanguageMenager(ProgrammingLanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	
	
	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> languages = languageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> languagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for(ProgrammingLanguage language : languages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponses.add(responseItem);			
		}
		return languagesResponses;
	}

	@Override
	public GetByIdProgrammingLanguagesResponse getById(int id) {
		ProgrammingLanguage language = languageRepository.getReferenceById(id);
		GetByIdProgrammingLanguagesResponse languagesResponse = new GetByIdProgrammingLanguagesResponse();
		
		languagesResponse.setId(id);
		languagesResponse.setName(language.getName());
		
		return languagesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setName(createProgrammingLanguageRequest.getName());
		languageRepository.save(language);
	}

	@Override
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		ProgrammingLanguage language = new ProgrammingLanguage();
		language.setId(updateProgrammingLanguageRequest.getId());
		language.setName(updateProgrammingLanguageRequest.getName());
		languageRepository.save(language);
		
	}

	@Override
	public void remove(RemoveProgrammingLanguageRequest removeProgrammingLanguageRequest) {
		languageRepository.deleteById(removeProgrammingLanguageRequest.getId());
	}

}

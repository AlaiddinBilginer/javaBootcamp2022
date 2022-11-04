package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.devs.business.request.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.request.RemoveProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguageTechnologiesRepsonse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguageTechnologiesResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageTechnologiesRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import kodlama.io.devs.entities.concretes.ProgrammingLanguageTechnology;

@Service
public class ProgrammingLanguageTechnologyMenager implements ProgrammingLanguageTechnologyService{
	private ProgrammingLanguageTechnologiesRepository technologiesRepository;
	private ProgrammingLanguageRepository languageRepository;
	
	public ProgrammingLanguageTechnologyMenager(ProgrammingLanguageTechnologiesRepository technologiesRepository, ProgrammingLanguageRepository languageRepository) {
		this.technologiesRepository = technologiesRepository;
		this.languageRepository = languageRepository;
	}
	
	@Override
	public List<GetAllProgrammingLanguageTechnologiesRepsonse> getAll() {
		List<ProgrammingLanguageTechnology> technologies = technologiesRepository.findAll();
		List<GetAllProgrammingLanguageTechnologiesRepsonse> technologiesRepsonses = new ArrayList<GetAllProgrammingLanguageTechnologiesRepsonse>();
		
		for(ProgrammingLanguageTechnology technology : technologies) {
			GetAllProgrammingLanguageTechnologiesRepsonse responseItem = new GetAllProgrammingLanguageTechnologiesRepsonse();
			responseItem.setId(technology.getId());
			responseItem.setName(technology.getName());
			responseItem.setLanguageName(technology.getProgrammingLanguage().getName());	
			technologiesRepsonses.add(responseItem);
		}
		return technologiesRepsonses;
	}

	@Override
	public GetByIdProgrammingLanguageTechnologiesResponse getById(int id) {
		ProgrammingLanguageTechnology technology = technologiesRepository.getReferenceById(id);
		GetByIdProgrammingLanguageTechnologiesResponse technologiesResponse = new GetByIdProgrammingLanguageTechnologiesResponse();
		
		technologiesResponse.setId(id);
		technologiesResponse.setName(technology.getName());
		
		return technologiesResponse;
	}

	@Override
	public void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
		ProgrammingLanguageTechnology technology = new ProgrammingLanguageTechnology();
		ProgrammingLanguage programmingLanguage = languageRepository.findById(createProgrammingLanguageTechnologyRequest.getProgrammingLanguageId()).get();
		technology.setName(createProgrammingLanguageTechnologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		technologiesRepository.save(technology);
	}

	@Override
	public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		ProgrammingLanguageTechnology technology = new ProgrammingLanguageTechnology();
		ProgrammingLanguage programmingLanguage = languageRepository.findById(updateProgrammingLanguageTechnologyRequest.getProgrammingLanguageId()).get();
		technology.setId(updateProgrammingLanguageTechnologyRequest.getId());
		technology.setName(updateProgrammingLanguageTechnologyRequest.getName());
		technology.setProgrammingLanguage(programmingLanguage);
		technologiesRepository.save(technology);
		
	}

	@Override
	public void remove(RemoveProgrammingLanguageTechnologyRequest removeProgrammingLanguageTechnologyRequest) {
		technologiesRepository.deleteById(removeProgrammingLanguageTechnologyRequest.getId());
		
	}

}

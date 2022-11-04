package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.request.RemoveProgrammingLanguageRequest;
import kodlama.io.devs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguagesResponse;

public interface ProgrammingLanguageService {
	List<GetAllProgrammingLanguagesResponse> getAll();
	GetByIdProgrammingLanguagesResponse getById(int id);
	
	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
	void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);
	void remove(RemoveProgrammingLanguageRequest removeProgrammingLanguageRequest);
	
}

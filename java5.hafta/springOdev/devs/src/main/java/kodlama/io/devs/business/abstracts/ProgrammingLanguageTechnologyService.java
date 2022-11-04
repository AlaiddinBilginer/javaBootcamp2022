package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.request.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.request.RemoveProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguageTechnologiesRepsonse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguageTechnologiesResponse;

public interface ProgrammingLanguageTechnologyService {
	List<GetAllProgrammingLanguageTechnologiesRepsonse> getAll();
	GetByIdProgrammingLanguageTechnologiesResponse getById(int id);
	
	void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest);
	void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest);
	void remove(RemoveProgrammingLanguageTechnologyRequest removeProgrammingLanguageTechnologyRequest);
}

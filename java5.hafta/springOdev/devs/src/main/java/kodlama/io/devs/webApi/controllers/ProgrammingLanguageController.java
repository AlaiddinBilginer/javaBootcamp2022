package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.request.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.request.RemoveProgrammingLanguageRequest;
import kodlama.io.devs.business.request.UpdateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguagesResponse;

@RestController
@RequestMapping("api/languages")
public class ProgrammingLanguageController {
	private ProgrammingLanguageService languageService;
	
	@Autowired
	public ProgrammingLanguageController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguagesResponse> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/getById")
	public GetByIdProgrammingLanguagesResponse getById(int id) {
		return languageService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		languageService.add(createProgrammingLanguageRequest);
	}
	
	@GetMapping("/update")
	public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
		languageService.update(updateProgrammingLanguageRequest);
	}
	
	@GetMapping("/remove")
	public void remove(RemoveProgrammingLanguageRequest removeProgrammingLanguageRequest) {
		languageService.remove(removeProgrammingLanguageRequest);
	}
	
	
}

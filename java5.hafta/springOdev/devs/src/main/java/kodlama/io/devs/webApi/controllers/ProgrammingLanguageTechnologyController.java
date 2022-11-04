package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageTechnologyService;
import kodlama.io.devs.business.request.CreateProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.request.RemoveProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.request.UpdateProgrammingLanguageTechnologyRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguageTechnologiesRepsonse;
import kodlama.io.devs.business.responses.GetByIdProgrammingLanguageTechnologiesResponse;

@RestController
@RequestMapping("api/technologies")
public class ProgrammingLanguageTechnologyController {
private ProgrammingLanguageTechnologyService technologyService;
	
	@Autowired
	public ProgrammingLanguageTechnologyController(ProgrammingLanguageTechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getAll")
	public List<GetAllProgrammingLanguageTechnologiesRepsonse> getAll(){
		return technologyService.getAll();
	}
	
	@GetMapping("/getById")
	public GetByIdProgrammingLanguageTechnologiesResponse getById(int id) {
		return technologyService.getById(id);
	}
	
	@GetMapping("/add")
	public void add(CreateProgrammingLanguageTechnologyRequest createProgrammingLanguageTechnologyRequest) {
		technologyService.add(createProgrammingLanguageTechnologyRequest);
	}
	
	@GetMapping("/update")
	public void update(UpdateProgrammingLanguageTechnologyRequest updateProgrammingLanguageTechnologyRequest) {
		technologyService.update(updateProgrammingLanguageTechnologyRequest);
	}
	
	@GetMapping("/remove")
	public void remove(RemoveProgrammingLanguageTechnologyRequest removeProgrammingLanguageTechnologyRequest) {
		technologyService.remove(removeProgrammingLanguageTechnologyRequest);
	}
}

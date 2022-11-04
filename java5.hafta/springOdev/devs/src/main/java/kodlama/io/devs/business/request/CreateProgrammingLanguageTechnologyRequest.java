package kodlama.io.devs.business.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProgrammingLanguageTechnologyRequest {
	private String name;
	private int programmingLanguageId;
}

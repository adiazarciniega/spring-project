package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public Persona index() {
    	Persona elPacoPersona = new Persona();
    	elPacoPersona.setName("Pacoooo");
    	elPacoPersona.setAge(41);
        return elPacoPersona;
    }

}

class Persona {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}
}
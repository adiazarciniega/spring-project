package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public List<Persona> index() {
    	List<Persona> raza = new ArrayList<Persona>();
    	Persona horacio = new Persona();
    	horacio.setName("Horacio");
    	horacio.setAge(41);
    	Persona luis = new Persona();
    	luis.setName("Louie");
    	luis.setAge(66);
    	raza.add(horacio);
    	raza.add(luis);
        return raza;
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
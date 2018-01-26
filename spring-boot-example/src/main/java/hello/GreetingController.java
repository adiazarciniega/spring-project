
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="listaPersonas", required=false, defaultValue="World") List<Persona> gente, Model model) {
    	Persona horacio = new Persona();
    	horacio.setName("Horacio");
    	horacio.setAge(41);
    	Persona luis = new Persona();
    	luis.setName("Louie");
    	luis.setAge(66);
    	gente.add(horacio);
    	gente.add(luis);
    	model.addAllAttributes(gente);
        //model.addAttribute("name", name);
        //model.addAttribute("elPaco", new String[]{"El","Paco","!!!"});
        return "greeting";
    }

}

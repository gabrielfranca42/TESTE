package FRANCA.GABRIEL.deltarune;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class deltarunerController {

    public String boasVindas(){
        return "essa e minha mensagem";
    }
}

package ATL.ACADEMY.newslatter.controller;

import ATL.ACADEMY.newslatter.models.Prospecto;
import ATL.ACADEMY.newslatter.repository.EmailRepository;
import ATL.ACADEMY.newslatter.validators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsLetterController {
    @Autowired
    private EmailRepository emailRepository;
    @PostMapping("/api/newsletter")
    public String registro(@RequestBody Prospecto prospecto){
        EmailValidator emailValidator = new EmailValidator();
        String email = prospecto.getEmail();
        if(!emailValidator.esValido(email)){
            return  "Email no Valido";
        }
        emailRepository.guardarEmail(email);
        return "Email guardado" + prospecto.getEmail();
    }


    @DeleteMapping("/api/newsletter/unsuscribe")
    public String unsuscribe(@RequestBody Prospecto prospecto){
        EmailValidator emailValidator = new EmailValidator();
        String email = prospecto.getEmail();
        if(!emailValidator.esValido(email)){
            return  "Email no Valido";
        }

        emailRepository.eliminarEmail(email);
        return "Email eliminado" + prospecto.getEmail();
    }

    @GetMapping("/api/newsletter/list")
    public List<Prospecto> suscribeList(){
        List<Prospecto> prospecto =  emailRepository.suscribeList();
        return  prospecto;
    }
}

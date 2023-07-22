package ATL.ACADEMY.newslatter.controller;

import ATL.ACADEMY.newslatter.models.Prospecto;
import ATL.ACADEMY.newslatter.validators.EmailValidator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsLetterController {
    @PostMapping("/api/newsletter")
    public String registro(@RequestBody Prospecto prospecto){
        EmailValidator emailValidator = new EmailValidator();

        if(!emailValidator.esValido(prospecto.getEmail())){
            return  "Email no Valido";
        }
        return "hola como vamods?" + prospecto.getEmail();
    }
}

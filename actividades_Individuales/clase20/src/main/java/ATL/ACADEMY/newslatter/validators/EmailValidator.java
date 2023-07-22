package ATL.ACADEMY.newslatter.validators;

public class EmailValidator {

    public boolean esValido(String email){
        if(!email.contains("@")){
            return false;
        }
        if(!email.contains(".")){
            return false;
        }
        if(email.contains("!")){
            return false;
        }

        if(email.contains(" ")){
            return false;
        }

        if(email.length() > 254){
            return false;
        }
        return true;
    }
}

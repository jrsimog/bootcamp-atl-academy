package ATL.ACADEMY.newslatter.validators;

public class EmailValidator {

    public boolean esValido(String email){
        // Expresión regular para validar un correo electrónico
        // ^[a-zA-Z0-9._%+-]+ : Comienza con uno o más caracteres permitidos (letras, números, ., _, %, +, -)
        // @ : Seguido de un carácter @
        // [a-zA-Z0-9.-]+ : Seguido de uno o más caracteres permitidos para el dominio (letras, números, ., -)
        // \\. : Seguido de un carácter punto literal
        // [a-zA-Z]{2,6} : Seguido de entre 2 y 6 letras (para el TLD,.. es el acrónimo de Top-Level Domain, que se traduce como Dominio de Nivel Superior en español. Se refiere a la última parte de un nombre de dominio en Internet.)
        // $ : Fin de línea
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return email.matches(regex);
    }
}

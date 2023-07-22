package ATL.ACADEMY.newslatter.validators;


import org.junit.Test;

import static org.junit.Assert.*;

public class EmailValitadorTest {
    @Test
    public void elEmailDebeTenerUnArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("asdasdasd");
        assertFalse(resultado);
    }

    @Test
    public void elEmailDebeTenerAlMenosUnPuntoDespuesDelArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("asdasd@asd");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoDebeTenerEspacios(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("asdas dasd@asd.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoDebeEstarVacio(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("");
        assertFalse(resultado);
    }

    @Test
    public void elEmailDebeTenerCaracteresAntesYDespuesDelArrobaYElPunto(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("@.");
        assertFalse(resultado);
    }

    @Test
    public void elEmailPuedeTenerSlashAntesDelArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("test/email@example.com");
        assertTrue(resultado);
    }

    @Test
    public void elEmailNoPuedeTenerSlashDespuesDelArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("testemail@ex/ample.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailPuedeTenerInterrogacionAntesDelArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("test?email@example.com");
        assertTrue(resultado);
    }

    @Test
    public void elEmailNoPuedeTenerInterrogacionDespuesDelArroba(){
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("testemail@ex?ample.com");
        assertFalse(resultado);
    }

    @Test
    public void elEmailNoDebeTenerMasDe254Caracteres() {
        EmailValidator emailValidator = new EmailValidator();
        boolean resultado = emailValidator.esValido("ddddddddddddddddddd@ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
        assertFalse(resultado);
    }


}

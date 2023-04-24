package one.digital.innovation.junit;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2001, 1, 1));
        
        Assertions.assertEquals(22, jessica.getIdade());
    }
    
    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2001, 1, 1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa joaozim = new Pessoa("João", LocalDate.now());
        Assertions.assertFalse(joaozim.ehMaiorDeIdade());

    }
}

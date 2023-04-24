package one.digitalinnovation.junit;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaTest {

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2021, 4, 22));

        Assertions.assertEquals(2, pessoa.getIdade());
    }

}

package one.digital.innovation.junit;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTeste {

    @Test
    void validarLancamentos() {

        int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
        int[] segundoLancamento = { 10, 20, 30, 40, 50 };
        // segundoLancamento = { -1, 5, 2, 3, 10 };
        // segundoLancamento = { -1, 5, 2, 3, 10, 16, 17 };

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEhNulo() {
        Pessoa pessoa = null;
        Assertions.assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDate.now());
        Assertions.assertNotNull(pessoa);
    }

    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        Assertions.assertEquals(valor, outroValor);
    }

}

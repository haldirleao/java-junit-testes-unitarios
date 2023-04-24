package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validarCenarioExcecaoNaTransferencia() {
        Conta contaOrigem = new Conta("123456", 50);
        Conta contaDestino = new Conta("789012", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        // testa se a exceção foi lançada
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> transferenciaEntreContas.tranferir(contaOrigem, contaDestino, -1));

        // testa se a exceção NÃO foi lançada
        Assertions.assertDoesNotThrow(
                () -> transferenciaEntreContas.tranferir(contaOrigem, contaDestino, 1));
    }

}

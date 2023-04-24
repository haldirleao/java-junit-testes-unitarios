package one.digital.innovation.junit;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTeste {

    @BeforeAll
    static void configurarConexao() {
        BancoDeDados.iniciarConexao();
        System.out.println(BancoDeDados.class.getName());
    }

    @BeforeEach
    void inserirDadosTeste() {
        BancoDeDados.inserirDados(new Pessoa("Murilo", LocalDate.of(2005, 03, 20)));
    }
    
    @BeforeEach
    void removerDadosTeste() {
        BancoDeDados.removerDados(new Pessoa("Murilo", LocalDate.of(2005, 03, 20)));
    }

    @Test
    void validarDadosRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosRetorno2() {
        Assertions.assertTrue(true);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }

}

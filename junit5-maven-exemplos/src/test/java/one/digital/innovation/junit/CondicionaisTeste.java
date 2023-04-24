package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.condition.JRE;


public class CondicionaisTeste {

    @Test
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "haldi")
    void validarAlgoSomenteNoUsuarioWillian() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void validarAlgoSomenteNoWindows() {
        Assertions.assertEquals(10, 5 + 5);
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void validarAlgoSomenteNoJava17() {
        Assertions.assertEquals(10, 5 + 5);
    }
}

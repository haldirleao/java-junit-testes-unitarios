package one.digital.innovation.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    
    @Test
    void validarAlgoSomenteNoUsuarioWillian(){
        Assumptions.assumeTrue("haldi".equals(System.getenv("USERNAME")));
        //Assumptions.assumeTrue("root".equals(System.getenv("USERNAME")));
        Assertions.assertEquals(10, 5 + 5);
    }

}

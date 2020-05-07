package br.com.bootcampyaman.modacessos.testmods;

import br.com.bootcampyaman.modacessos.ModificadoresDeAcesso;
import org.junit.jupiter.api.Test;

public class TestandoModPrivate extends ModificadoresDeAcesso {

    @Test
    public void testPrivado(){
        getPrivate();
    }
}

package br.com.bootcampyaman.modacessos.testmods;

import br.com.bootcampyaman.modacessos.ModificadoresDeAcesso;
import org.junit.jupiter.api.Test;

public class TestandoModificadorPublico {

    @Test
    public void testmetodopub() {
        ModificadoresDeAcesso mod = new ModificadoresDeAcesso();
        mod.bomDia();
    }
}

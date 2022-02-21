package ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio1Test {

    @Test
    @ParameterizedTest
    @CsvSource({
        "0,Use un salario valido",

    })

    public void boundaryTestEjercicio(int salario, String expected){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String actual=ejercicio1.porcentajeSalario(salario);
        Assertions.assertEquals(expected,actual,"Test error");
    }
}

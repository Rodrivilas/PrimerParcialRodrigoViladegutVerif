package ejercicio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Ejercicio1Test {

    @Test
    @ParameterizedTest
    @CsvSource({
            "-1,Use un salario valido",
            "0,Use un salario valido",
            "1,No tiene descuento",

            "999,No tiene descuento",
            "1000,No tiene descuento",
            "1001,No tiene descuento",

            "1999,No tiene descuento",
            "2000,No tiene descuento",
            "2001,Tiene 5% de descuento",

            "2999,Tiene 5% de descuento",
            "3000,Tiene 5% de descuento",
            "3001,Tiene 5% de descuento",

            "3999,Tiene 5% de descuento",
            "4000,Tiene 5% de descuento",
            "4001,Tiene 15% de descuento",



    })

    public void boundaryTestEjercicio(int salario, String expected){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String actual=ejercicio1.porcentajeSalario(salario);
        Assertions.assertEquals(expected,actual,"Test error");
    }
}

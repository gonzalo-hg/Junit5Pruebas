package org.ghernan.junit5app.ejemplos.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta(){
        Cuenta cuenta = new Cuenta();
        //cuenta.setPersona("Gonzalo");
        String esperado = "Gonzalo";
        String real = cuenta.getPersona();
        Assertions.assertEquals(esperado,real);
    }
}
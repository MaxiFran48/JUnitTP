package entidades;

import org.example.entidades.CuentaBancaria;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CuentaBancariaTest {
    private CuentaBancaria cuentaBancaria;

    @BeforeEach
    public void inicializarCuentaBancaria() {
        cuentaBancaria = new CuentaBancaria();
    }

    @AfterEach
    public void finalizarCuentaBancaria() {
        cuentaBancaria = null;
    }

    @Test
    public void testRetiroEnCuentaSinSaldo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuentaBancaria.retirarDinero(100.0));
        assertEquals("El dinero retirado debe ser menor al saldo en cuenta", exception.getMessage());
    }

    @Test
    public void testRetiroConMontoMayorAlSaldoActual() {
        cuentaBancaria.ingresarDinero(100.0);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> cuentaBancaria.retirarDinero(200.0));
        assertEquals("El dinero retirado debe ser menor al saldo en cuenta", exception.getMessage());
    }

    @Test
    public void testRetiroValido() {
        cuentaBancaria.ingresarDinero(100.0);
        cuentaBancaria.retirarDinero(50.0);
        assertEquals(50.0, cuentaBancaria.getSaldo());
    }

}

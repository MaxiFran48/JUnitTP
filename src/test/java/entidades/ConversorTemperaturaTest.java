package entidades;

import org.example.entidades.ConversorTemperatura;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    @Test
    public void testCeroCelsiusEsTreintaYDosFahrenheit() {
        // 0°C = 32°F
        double resultado = ConversorTemperatura.celsiusToFahrenheit(0.0);
        assertEquals(32.0, resultado);
    }

    @Test
    public void testCienCelsiusEsDoscientosDoceFahrenheit() {
        // 100°C = 212°F
        double resultado = ConversorTemperatura.celsiusToFahrenheit(100.0);
        assertEquals(212.0, resultado);
    }

    @Test
    public void testMenosCuarentaEsMenosCuarenta() {
        // -40°C = -40°F
        double resultado = ConversorTemperatura.celsiusToFahrenheit(-40.0);
        assertEquals(-40.0, resultado);
    }

    @Test
    public void testTreintaYSieteCelsiusAproximado() {
        double resultado = ConversorTemperatura.celsiusToFahrenheit(37.0);
        // 37°C ≈ 98.6°F
        assertEquals(98.6, resultado);
    }

}


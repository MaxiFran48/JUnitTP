package entidades;

import org.example.entidades.Validador;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    public void testArgumentoNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> Validador.procesar(null));
        assertEquals("El valor no puede ser nulo", exception.getMessage());
    }

}

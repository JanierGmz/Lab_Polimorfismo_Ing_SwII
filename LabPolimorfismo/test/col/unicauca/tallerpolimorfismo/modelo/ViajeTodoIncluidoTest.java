package col.unicauca.tallerpolimorfismo.modelo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ViajeTodoIncluidoTest {

    @Test
    public void testGettersAndSetters() {
        ViajeTodoIncluido viajeTodoIncluido = new ViajeTodoIncluido("Origen", "Destino", 500, new Date(), new Date());

        // Probar getters y setters heredados de Viaje
        assertEquals("Origen", viajeTodoIncluido.getOrigen());
        assertEquals("Destino", viajeTodoIncluido.getDestino());
        assertEquals(500, viajeTodoIncluido.getCosto());
        assertNotNull(viajeTodoIncluido.getFechaSalida());
        assertNotNull(viajeTodoIncluido.getFechaLlegada());
    }

    @Test
    public void testDescripcion() {
        ViajeTodoIncluido viajeTodoIncluido = new ViajeTodoIncluido("Origen", "Destino", 500, new Date(), new Date());
        String descripcion = viajeTodoIncluido.descripcion();
        assertEquals("Disfruta tu viaje todo incluido", descripcion);
    }
}

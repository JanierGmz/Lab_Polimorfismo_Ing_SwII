package col.unicauca.tallerpolimorfismo.modelo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ViajeIndividualTest {

    @Test
    public void testGettersAndSetters() {
        ViajeIndividual viajeIndividual = new ViajeIndividual("Origen", "Destino", 150, new Date(), new Date());

        // Probar getters y setters heredados de Viaje
        assertEquals("Origen", viajeIndividual.getOrigen());
        assertEquals("Destino", viajeIndividual.getDestino());
        assertEquals(150, viajeIndividual.getCosto());
        assertNotNull(viajeIndividual.getFechaSalida());
        assertNotNull(viajeIndividual.getFechaLlegada());
    }

    @Test
    public void testDescripcion() {
        ViajeIndividual viajeIndividual = new ViajeIndividual("Origen", "Destino", 150, new Date(), new Date());
        String descripcion = viajeIndividual.descripcion();
        assertEquals("Disfruta tu viaje individual", descripcion);
    }
}

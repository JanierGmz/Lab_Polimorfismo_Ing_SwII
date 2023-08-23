package col.unicauca.tallerpolimorfismo.modelo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ViajeFamiliarTest {

    @Test
    public void testGettersAndSetters() {
        ViajeFamiliar viajeFamiliar = new ViajeFamiliar(4, "Origen", "Destino", 200, new Date(), new Date());

        // Probar getters y setters heredados de Viaje
        assertEquals("Origen", viajeFamiliar.getOrigen());
        assertEquals("Destino", viajeFamiliar.getDestino());
        assertEquals(200, viajeFamiliar.getCosto());
        assertNotNull(viajeFamiliar.getFechaSalida());
        assertNotNull(viajeFamiliar.getFechaLlegada());

        // Probar getter y setter específico de ViajeFamiliar
        assertEquals(4, viajeFamiliar.getFamilia());
        viajeFamiliar.setFamilia(5);
        assertEquals(5, viajeFamiliar.getFamilia());
    }

    @Test
    public void testDescripcion() {
        ViajeFamiliar viajeFamiliar = new ViajeFamiliar(4, "Origen", "Destino", 200, new Date(), new Date());
        String descripcion = viajeFamiliar.descripcion();
        assertEquals("Viaje para disfrutar con toda tu familia", descripcion);
    }

    @Test
    public void testCualquierMetodo2() {
        ViajeFamiliar viajeFamiliar = new ViajeFamiliar(4, "Origen", "Destino", 200, new Date(), new Date());
        String resultado = viajeFamiliar.cualquierMetodo2();
        assertEquals("Metodo implementado en la clase hija viaje familiar", resultado);
    }
}

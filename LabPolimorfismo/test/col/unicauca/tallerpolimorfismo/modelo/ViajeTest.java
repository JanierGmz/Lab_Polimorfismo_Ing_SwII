package col.unicauca.tallerpolimorfismo.modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ViajeTest {

    @Test
    public void testGettersAndSetters() throws ParseException {
        // Crear una instancia de Viaje para probar los getters y setters
        Viaje viaje = new ViajeIndividual("Origen", "Destino", 4250000,
                new SimpleDateFormat("dd / MM / yyyy").parse("01 / 07 / 2019"),
                new SimpleDateFormat("dd / MM / yyyy").parse("12 / 07 / 2019"));
        String descripcion = viaje.descripcion();

        // Probar los getters
        assertEquals("Origen", viaje.getOrigen());
        assertEquals("Destino", viaje.getDestino());
        assertEquals(4250000, viaje.getCosto());
        assertNotNull(viaje.getFechaSalida());
        assertNotNull(viaje.getFechaLlegada());

        // Probar los setters
        viaje.setOrigen("Nuevo Origen");
        assertEquals("Nuevo Origen", viaje.getOrigen());

        viaje.setDestino("Nuevo Destino");
        assertEquals("Nuevo Destino", viaje.getDestino());

        viaje.setCosto(200);
        assertEquals(200, viaje.getCosto());

        Date nuevaFechaSalida = new Date();
        viaje.setFechaSalida(nuevaFechaSalida);
        assertEquals(nuevaFechaSalida, viaje.getFechaSalida());

        Date nuevaFechaLlegada = new Date();
        viaje.setFechaLlegada(nuevaFechaLlegada);
        assertEquals(nuevaFechaLlegada, viaje.getFechaLlegada());
    }

    @Test
    public void testDescripcion() throws ParseException {
        Viaje viaje = new ViajeIndividual("Origen", "Destino", 4250000,
                new SimpleDateFormat("dd / MM / yyyy").parse("01 / 07 / 2019"),
                new SimpleDateFormat("dd / MM / yyyy").parse("12 / 07 / 2019"));
        String descripcion = viaje.descripcion();
        assertNotNull(descripcion);
        assertFalse(descripcion.isEmpty());
    }

    @Test
    public void testCualquierMetodo() throws ParseException {
        Viaje viaje = new ViajeIndividual("Origen", "Destino", 4250000,
                new SimpleDateFormat("dd / MM / yyyy").parse("01 / 07 / 2019"),
                new SimpleDateFormat("dd / MM / yyyy").parse("12 / 07 / 2019"));
        String descripcion = viaje.descripcion();
        String resultado = viaje.cualquierMetodo();
        assertNotNull(resultado);
        assertEquals("Cualquier metodo implementado en la clase base", resultado);
    }

    @Test
    public void testCualquierMetodo2() throws ParseException {
        Viaje viaje = new ViajeIndividual("Origen", "Destino", 4250000,
                new SimpleDateFormat("dd / MM / yyyy").parse("01 / 07 / 2019"),
                new SimpleDateFormat("dd / MM / yyyy").parse("12 / 07 / 2019"));
        String descripcion = viaje.descripcion();
        String resultado = viaje.cualquierMetodo2();
        assertNotNull(resultado);
        assertEquals("Cualquier metodo2 implementado en la clase base", resultado);
    }
}

package col.unicauca.tallerpolimorfismo.modelo;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Date;

public class ViajeIncentivoTest {

    @Test
    public void testGettersAndSetters() {
        ViajeIncentivo viajeIncentivo = new ViajeIncentivo("EmpresaX", "Origen", "Destino", 300, new Date(), new Date());

        // Probar getters y setters heredados de Viaje
        assertEquals("Origen", viajeIncentivo.getOrigen());
        assertEquals("Destino", viajeIncentivo.getDestino());
        assertEquals(300, viajeIncentivo.getCosto());
        assertNotNull(viajeIncentivo.getFechaSalida());
        assertNotNull(viajeIncentivo.getFechaLlegada());

        // Probar getter y setter específico de ViajeIncentivo
        assertEquals("EmpresaX", viajeIncentivo.getEmpresa());
        viajeIncentivo.setEmpresa("NuevaEmpresa");
        assertEquals("NuevaEmpresa", viajeIncentivo.getEmpresa());
    }

    @Test
    public void testDescripcion() {
        ViajeIncentivo viajeIncentivo = new ViajeIncentivo("EmpresaX", "Origen", "Destino", 300, new Date(), new Date());
        String descripcion = viajeIncentivo.descripcion();
        assertEquals("Viaje incentivo que te envia la empresa EmpresaX", descripcion);
    }

    @Test
    public void testCualquierMetodo2() {
        ViajeIncentivo viajeIncentivo = new ViajeIncentivo("EmpresaX", "Origen", "Destino", 300, new Date(), new Date());
        String resultado = viajeIncentivo.cualquierMetodo2();
        assertEquals("Metodo implementado en la clase hija viaje de incentivo", resultado);
    }
}

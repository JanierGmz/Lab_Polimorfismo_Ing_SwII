package col.unicauca.tallerpolimorfismo.modelo.cliente;

import col.unicauca.tallerpolimorfismo.modelo.Viaje;
import col.unicauca.tallerpolimorfismo.modelo.ViajeFamiliar;
import col.unicauca.tallerpolimorfismo.modelo.ViajeIncentivo;
import col.unicauca.tallerpolimorfismo.modelo.ViajeIndividual;
import col.unicauca.tallerpolimorfismo.modelo.ViajeTodoIncluido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteMain {

    /**
     * Arreglo polimorfico de viajes
     */
    public static List<Viaje> viajes = new ArrayList();

    public static void main(String[] args) {
        leerViajes();
        mostrarViajes();
    }

    /**
     * Lee viajes en el arreglo polimorfico
     */
    public static void leerViajes() {
        try {
            Viaje viaje1 = new ViajeFamiliar(5, "Popayan", "Bogota", 1250000,
                    new SimpleDateFormat("dd / MM / yyyy").parse("01 / 05 / 2019"),
                    new SimpleDateFormat("dd / MM / yyyy").parse("05 / 05 / 2019"));
            viajes.add(viaje1);

            Viaje viaje2 = new ViajeIncentivo("Emtel", "Popayan", "Medellin", 2100000,
                    new SimpleDateFormat("dd / MM / yyyy").parse("03 / 06 / 2019 "),
                    new SimpleDateFormat("dd / MM / yyyy").parse("09 / 06 / 2019"));
            viajes.add(viaje2);

            Viaje viaje3 = new ViajeIndividual("Popayan", "San Andres", 4250000,
                    new SimpleDateFormat("dd / MM / yyyy").parse("01 / 07 / 2019"),
                    new SimpleDateFormat("dd / MM / yyyy").parse("12 / 07 / 2019"));
            viajes.add(viaje3);

            Viaje viaje4 = new ViajeTodoIncluido("Popayan", "Cartagena",
                    7350000, new SimpleDateFormat("dd / MM / yyyy").parse(
                            "01 / 07 / 2019"), new SimpleDateFormat("dd / MM / yyyy").parse(
                            "12 / 07 / 2019"));
            viajes.add(viaje4);

        } catch (ParseException ex) {
            Logger.getLogger(ClienteMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Recorre e imprime datos del arreglo polimofico
     */
    public static void mostrarViajes() {
        /*En este caso vemos que todos los viajes ejecutan el metodo"descripcion
        ()" de forma diferente // ya que al ser este metodo abstracto en la 
        clase padre, les forzamos a las clases hijas a que // implementen ese
        metodo.*/

        for (Viaje viaje : viajes) {
            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripcion: " + viaje.descripcion());
            System.out.println("Cualquier metodo: " + viaje.cualquierMetodo());
            System.out.println("Cualquier metodo2: " + viaje.cualquierMetodo2());
            System.out.println(" ");
        }
    }
}

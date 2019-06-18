package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class WorldsPanAdapter implements Proveedor {
    private Worldspan worldsPan;

    public WorldsPanAdapter(Worldspan worldsPan) {
        this.worldsPan = worldsPan;
    }

    @Override
    public List<Vuelo> buscarVuelo(DateTime fecha, String origen, String destino) {
        return worldsPan.searchFlights(fecha.getDayOfMonth(),fecha.getMonthOfYear(),fecha.getYear(),origen,destino);
    }

    @Override
    public Boleto comprar(Vuelo vuelo, Set<Pasajero> pasajero) {
        return worldsPan.bookFlight(vuelo,pasajero);
    }
}

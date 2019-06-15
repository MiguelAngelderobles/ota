package ar.edu.unahur.obj2.proveedores;

import ar.edu.unahur.obj2.Boleto;
import ar.edu.unahur.obj2.Pasajero;
import ar.edu.unahur.obj2.Vuelo;
import org.joda.time.DateTime;

import java.util.List;
import java.util.Set;

public class AmadeusAdapter implements Proveedor {

    private Amadeus amadeus;

    public void setAmadeus(Amadeus amadeus) {
        this.amadeus = amadeus;
    }

    @Override
    public List<Vuelo> buscarVuelo(DateTime fecha, String origen, String destino) {
        amadeus=new Amadeus();
        return amadeus.executeSearch(fecha,origen,destino);
    }

    @Override
    public Boleto comprar(Vuelo vuelo, Set<Pasajero> pasajero) {
        amadeus=new Amadeus();
        return amadeus.executeBook(vuelo,pasajero);
    }


}

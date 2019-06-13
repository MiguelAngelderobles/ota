package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.Amadeus;
import ar.edu.unahur.obj2.proveedores.Proveedor;
import ar.edu.unahur.obj2.proveedores.Sabre;

import java.util.Random;

public class DistribuidorDeTrafico {

    private Random random = new Random();
    private Proveedor Amadeus;
    private Proveedor Sabre;
    private Proveedor WorldsPan;

    public Proveedor proveedor() {
        switch (random.nextInt(9)) {
            case 0:
            case 1:
            case 2: return Amadeus;
            case 3:
            case 4:
            case 5: return Sabre;
            case 6:
            case 7:
            case 8: return WorldsPan;
            default: return Amadeus;
        }

    }
}

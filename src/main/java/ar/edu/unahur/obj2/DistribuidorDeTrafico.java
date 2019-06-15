package ar.edu.unahur.obj2;

import ar.edu.unahur.obj2.proveedores.*;

import java.nio.file.Watchable;
import java.util.List;
import java.util.Random;

public class DistribuidorDeTrafico {

    private Random random = new Random();

    public Proveedor proveedor() {
        switch (random.nextInt(9)) {
            case 0:
            case 1:
            case 2: return new AmadeusAdapter();
            case 3:
            case 4:
            case 5: return  new SabreAdapter();
            case 6:
            case 7:
            case 8: return  new WorldsPanAdapter();
            default: return  new AmadeusAdapter();
        }

    }
}

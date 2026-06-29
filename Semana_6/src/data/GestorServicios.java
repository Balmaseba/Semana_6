package data;
import model.*;

public class GestorServicios {
    public void mostrarServicios() {
        RutaGastronomica ruta1 = new RutaGastronomica("Sabores de Puerto Montt", 3, 5);
        RutaGastronomica ruta2 = new RutaGastronomica("Cocina Chilota", 3, 4);

        PaseoLacustre paseo1 = new PaseoLacustre("Navegación Lago Llanquihue", 2, "Catamarán");
        PaseoLacustre paseo2 = new PaseoLacustre("Recorrido Bahía de Puerto Varas", 2, "Lancha");

        ExcursionCultural excursion1 = new ExcursionCultural("Ruta Patrimonial Frutillar", 3, "Teatro del Lago");
        ExcursionCultural excursion2 = new ExcursionCultural("Historia de Osorno", 5, "Fuerte Reina Luisa");

        System.out.println(ruta1.toString());
        System.out.println(ruta2.toString());
        System.out.println(paseo1.toString());
        System.out.println(paseo2.toString());
        System.out.println(excursion1.toString());
        System.out.println(excursion2.toString());
    }

}

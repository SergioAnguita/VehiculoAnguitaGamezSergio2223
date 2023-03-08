
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
 
      public static void main(String[] args) {
        VehiculoAnguitaGamezSergio2223 miVehiculoAnguitaGamezSergio2223;
        int stockActual;
        //
        miVehiculoAnguitaGamezSergio2223 = new VehiculoAnguitaGamezSergio2223("Seat",18000,100);
        operativaVehiculosAnguitaGamezSergio2223(miVehiculoAnguitaGamezSergio2223, 50); 
        stockActual = miVehiculoAnguitaGamezSergio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosAnguitaGamezSergio2223(VehiculoAnguitaGamezSergio2223 miVehiculoAnguitaGamezSergio2223, java.lang.Integer cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoAnguitaGamezSergio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoAnguitaGamezSergio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    

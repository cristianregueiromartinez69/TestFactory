/**
 * Clase factoryTransport que fabrica los objetos de los vehiculos
 * @author cristian
 * @version 1.0
 */

public class FactoryTransport {

    /**
     * atributos estaticos final que será el camion o la bicicleta
     */
    public static final int camion=1;
    public static final int bicicleta=2;

    /**
     * metodo de devuelve la interfaz y que sirve para fabricar nuestros objetos transporte
     * @param type aqui seleccionamos si queremos introducir un camion o ubna bicicleta
     * @return  instancia de los objetos transporte, si no elegimos nada, devuelve un null
     */
    public static IComunTransporte getProducto(int type){

        switch(type){

            case camion:
                return new Camion();
            case bicicleta:
                return new Bicicleta();
            default:
                return null;

        }

    }


}

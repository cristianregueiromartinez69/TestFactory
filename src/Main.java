/**
 * Clase main donde ejecutamos nuestro programa
 * @author cristian
 * @version 1.0
 */

public class Main {

    /**
     * variable de tipo interfaz para llamar a nuestra factoria
     */
    static IComunTransporte mistransportes;

    public static void main(String[] args){

        /**
         * con nuestra variable de tipo interfaz, llamamos al metodo de la factoria e introducimos que vehiculo vamos a sacar
         */
        mistransportes=FactoryTransport.getProducto(FactoryTransport.camion);
        System.out.println("Coste del envio del transporte: " + mistransportes.costeTotal(12345) + "€");
        System.out.println("Tipo de embalaje utilizado: " + mistransportes.tipoEmbalaje(3, 60, 20, 6));
        /**
         * Aqui hacemos lo mismo y lo sacamos por consola para asegurarnos que el programa funciona
         */
        mistransportes=FactoryTransport.getProducto(FactoryTransport.bicicleta);
        System.out.println("Coste del envio del transporte: " + mistransportes.costeTotal(34567) + "€");
        System.out.println("Tipo de embalaje utilizado: " + mistransportes.tipoEmbalaje(4, 20, 1, 19));


    }


}

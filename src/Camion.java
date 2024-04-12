import javax.swing.*;

/**
 * Clase camion que implementa la interfaz IComunTransporte
 * @author cristian
 * @version 1.0
 */
public class Camion implements IComunTransporte {

    /**
     * atributos finales y estaticos que son el tipo de embalaje
     */
    private final static int palet=1;
    private final static int envoltorio_carton=2;
    private final static int caja_madera=3;

    /**
     * metodo que calcula el coste del vehiculo en funcion del codigo postal
     * @param cp que sera el codigo postal
     * @return el coste del vehiculo en función del codigo que le metamos
     */
    @Override
    public float costeTotal(int cp) {

        float coste=0;
        if(cp<=10390){

            coste=10.50f;
        }
        else if(cp>10390&&cp<=36201){

            coste=20.50f;
        }
        else{
            coste=5f;
        }

        return coste;
    }

    /**
     * metodo que nos devuelve el tipo de embalaje en funcion del peso del transporte
     * @param x dimension x del camion
     * @param y dimension y del camion
     * @param z dimension z del camion
     * @param peso peso del camion
     * @return nos devolvera el tipo de embalaje en funcion del peso introducido
     */

    @Override
    public int tipoEmbalaje(float x, float y, float z, float peso) {

        int aux_tipo_embalaje=0;

        if(peso<5){

            aux_tipo_embalaje=palet;

        }

        else if(peso>=5&&peso<10){

            aux_tipo_embalaje=envoltorio_carton;
        }

        else if(peso>=10){

            aux_tipo_embalaje=caja_madera;
        }

        return aux_tipo_embalaje;
    }

    /**
     * metodos getter de las static final del tipo de embalaje
     * @return el tipo de embalaje
     */
    public static int getPalet() {
        return palet;
    }

    public static int getCaja_madera() {
        return caja_madera;
    }

    public static int getEnvoltorio_carton() {
        return envoltorio_carton;
    }
}

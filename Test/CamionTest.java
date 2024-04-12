import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CamionTest {

    /**
     * En este test, creamos una variable de tipo interfaz que es igual a
     * el factory.getProducto y seleccionamos que objeto queremos crear
     * Luego hacemos el metodo assertTrue para comprobar si la variable creada es una instancia de Camion con el metodo instanceof
     */
    @Test
    @DisplayName("Comprobar Instancia Correcta de Camion")
    public void comprobarInstanciaCamion(){

        IComunTransporte camion =  FactoryTransport.getProducto(FactoryTransport.camion);
        Assert.assertTrue(camion instanceof Camion);

    }



}

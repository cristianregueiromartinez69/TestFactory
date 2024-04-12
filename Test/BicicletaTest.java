import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
public class BicicletaTest {
    /**
     * En este test, creamos una variable de tipo interfaz que es igual a
     * el factory.getProducto y seleccionamos que objeto queremos crear
     * Luego hacemos el metodo assertTrue para comprobar si la variable creada es una instancia de Bicicleta con el metodo instanceof
     */
    @Test
    @DisplayName("Comprobar Instancia Correcta de Bicicleta")
    public void comprobarInstanciaBicicleta(){

        IComunTransporte bicicleta =  FactoryTransport.getProducto(FactoryTransport.bicicleta);
        Assert.assertTrue(bicicleta instanceof Bicicleta);

    }

}

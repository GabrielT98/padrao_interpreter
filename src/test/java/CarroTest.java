import org.example.Carro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Carro carro = new Carro();
        carro.setDias(10);
        carro.setValorDiaria(80);
        carro.setMarca("BMW");
        carro.setModelo("i40");

        assertEquals(820.0, carro.calcularAluguel());
    }

}
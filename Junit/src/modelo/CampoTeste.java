package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {
    private Campo campo = new Campo(3,3);

    @BeforeEach
    void initCampo(){
        campo = new Campo(,3,3);
    }
    
    @Test
    void testeVizinho(){
        Campo vizinho = new Campo(2,3);
        boolean result = campo.addVizinhos(vizinho);
        assertTrue(result);

    }
}

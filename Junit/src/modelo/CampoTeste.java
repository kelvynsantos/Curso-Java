package modelo;

import excecao.ExplosionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CampoTeste {
    private Campo campo = new Campo(3,3);

    @BeforeEach
    void initCampo(){
        campo = new Campo(3,3);
    }
    
    @Test
    void testeVizinho1(){
        Campo vizinho = new Campo(3,2);
        boolean result = campo.addVizinhos(vizinho);
        assertTrue(result);
    }
    @Test
    void testeVizinho2(){
        Campo vizinho = new Campo(3,4);
        boolean result = campo.addVizinhos(vizinho);
        assertTrue(result);
    }
    @Test
    void testeVizinho3(){
        Campo vizinho = new Campo(2,3);
        boolean result = campo.addVizinhos(vizinho);
        assertTrue(result);
    }
    @Test
    void testVizinho4(){
        Campo vizinho = new Campo(4,3);
        boolean result = campo.addVizinhos(vizinho);
        assertTrue(result);
    }
    @Test
    void testVizinho5(){
        Campo vizinho = new Campo(2,2);
        boolean result = campo.addVizinhos(vizinho);
        assertTrue(result);
    }
    @Test
    void testVizinho6(){
        Campo vizinho = new Campo(1,1);
        boolean result = campo.addVizinhos(vizinho);
        assertFalse(result);
    }
    @Test
    void testeValorDefMarcado(){
        assertFalse(campo.isMarcado());
    }
    @Test
    void testeAltMarc(){
        campo.alternarMarcado();
        assertTrue(campo.isMarcado());
    }
    @Test
    void testeAbrirNaoMinadoNaoMarcado(){
        assertTrue(campo.abrir());
    }
    @Test
    void testeAbrirNaoMinadoMarcado(){
        campo.alternarMarcado();
        assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoMarcado(){
        campo.alternarMarcado();
        campo.minar();
        assertFalse(campo.abrir());
    }
    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();
        assertThrows(ExplosionException.class, () -> {
            campo.abrir();
        });
        assertTrue(campo.abrir());
    }
    @Test
    void testeAbrirComViz(){
        Campo v1 = new Campo(1,1);
        Campo v2 = new Campo(2,2);
        Campo v3 = new Campo(2,4);

        v2.addVizinhos(v1);
        campo.addVizinhos(v2);
        campo.abrir();
        assertTrue(v2.isAberto() && v1.isAberto());
        
    }
}

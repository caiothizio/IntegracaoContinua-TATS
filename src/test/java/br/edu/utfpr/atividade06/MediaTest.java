/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.atividade06;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author caiot
 */
public class MediaTest {
    
    public MediaTest() {
    }

    @Test
    public void testeMediaVetorOrdenadoImpar(){
        double vet[] = {1, 2, 3, 4, 5};
        Media m = new Media();
        
        assertEquals(3.0f, m.media(vet), 0.01);
        assertEquals(1.0f, m.menor(vet), 0.01);
        assertEquals(5.0f, m.maior(vet), 0.01);
        assertEquals(2, m.qtdMaiores(vet));
        assertEquals(2, m.qtdMenores(vet));        
    }
}

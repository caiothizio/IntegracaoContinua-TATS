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
public class MedianaTest {
    
    public MedianaTest() {
    }
    
    @Test
    public void testeMedianaVetorOrdenadoImpar(){
        double[] vet = {1, 2, 3, 4, 5};
        assertEquals(3f, new Mediana().getMediana(vet), 0.01);
    }
    
    @Test
    public void testeMedianaVetorOrdenadoPar(){
        double[] vet = {1, 2, 3, 4, 5, 6};
        assertEquals(3.5f, new Mediana().getMediana(vet), 0.01);
    }
}

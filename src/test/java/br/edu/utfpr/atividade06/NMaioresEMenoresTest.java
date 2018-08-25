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
public class NMaioresEMenoresTest {
    
    public NMaioresEMenoresTest() {
    }

    @Test
    public void NMaioresEMenoresTeste1() {
        NMaioresEMenores nm = new NMaioresEMenores();
        double vet[] = {1, 2, 3, 4, 5};
        
        double vet1[] = nm.getNMaiores(vet, 2);
        double vet2[] = nm.getNMenores(vet, 1);
        
        assertEquals(4.0f, vet1[0], 0.01);
        assertEquals(5.0f, vet1[1], 0.01);
        assertEquals(1.0, vet2[0], 0.01);
        
    }
}

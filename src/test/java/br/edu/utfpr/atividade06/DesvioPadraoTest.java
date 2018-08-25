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
public class DesvioPadraoTest {
    
    public DesvioPadraoTest() {
    }

    @Test
    public void desvioPadraoTesteVetorImpar() {
        DesvioPadrao dp = new DesvioPadrao();
        double vet[] = {1, 2, 3, 4, 5};
        
        assertEquals(1,414214f, dp.calcularDesvioPadrao(vet), 0.01);
    }
}

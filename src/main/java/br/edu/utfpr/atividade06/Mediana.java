/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.atividade06;

/**
 *
 * @author caiot
 */
public class Mediana {
    public double getMediana(double[] vet){
        if(vet.length % 2 == 0){
            return (vet[vet.length/2] + vet[(vet.length/2)-1])/2;
        }else{
            return vet[vet.length/2];
        }
    }
}

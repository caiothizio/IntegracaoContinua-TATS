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
class Media {

    double media(double[] vet) {
        double soma = 0;
        
        for(double d : vet){
            soma += d;
        }
        
        return soma/vet.length;
    }

    double menor(double[] vet) {
        double menor = Double.MAX_VALUE;
        
        for(double d : vet){
            if(d < menor)
                menor = d;
        }
        
        return menor;
    }

    double maior(double[] vet) {
        double maior = Double.MIN_VALUE;
        
        for(double d : vet){
            if(d > maior)
                maior = d;
        }
        
        return maior;
    }

    int qtdMaiores(double[] vet) {
        int qtdMaiores = 0;
        
        for(double d : vet){
            if(d > media(vet))
                qtdMaiores++;
        }
        
        return qtdMaiores;
    }

    Object qtdMenores(double[] vet) {
        int qtdMenores = 0;
        
        for(double d : vet){
            if(d < media(vet))
                qtdMenores++;
        }
        
        return qtdMenores;
    }
    
}

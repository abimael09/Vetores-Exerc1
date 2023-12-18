package Vetores_Exerc1;

import javax.swing.*;

public class Vetores_Exerc1 {

    public static void main(String[] args) {
        
        // Questão_1
        int[] numVet = new int[8]; 
        
        int i, num;
        for(i = 0; i < numVet.length; i++){
            numVet[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um número:"));
            System.out.println("N°_vetor = "+numVet[i]);
        }
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número para Teste"));
        
        int cont = 0;
        for(i = 0; i < numVet.length; i++){
            if(numVet[i] == num){
                cont++; 
            }
        }
        
        if(cont != 0){
            JOptionPane.showMessageDialog(null, +cont+ " posições iguais ao N° de Teste.");
        }else{
            JOptionPane.showMessageDialog(null, "Não existe posição igual ao N° de Teste.");
        }
    }
    
}


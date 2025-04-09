
package com.mycompany.exercicio27;
import javax.swing.JOptionPane;

public class Exercicio27 {

    public static void main(String[] args) {
        int[] vetor = {10, 25, 32, 45, 18, 7, 63, 54, 39, 21};
        
      
        String input = JOptionPane.showInputDialog(
            null,
            "Digite o número que deseja buscar no vetor:",
            "Pesquisa Linear",
            JOptionPane.QUESTION_MESSAGE
        );
        
      
        if(input == null) {
            JOptionPane.showMessageDialog(
                null,
                "Operação cancelada pelo usuário!",
                "Cancelado",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        
        try {
            int valorProcurado = Integer.parseInt(input);
            boolean encontrado = false;
            int posicao = -1;
            int i = 0;
            
           
            while(i < vetor.length && !encontrado) {
                if(vetor[i] == valorProcurado) {
                    encontrado = true;
                    posicao = i;
                    
                    break;
                }
                i++;
            }
            
            
            String mensagem;
            if(encontrado) {
                mensagem = "Valor " + valorProcurado + " encontrado na posição " + posicao + " do vetor.";
            } else {
                mensagem = "Valor " + valorProcurado + " não encontrado no vetor.";
            }
            
           
            StringBuilder vetorStr = new StringBuilder("Vetor completo: [");
            for(int num : vetor) {
                vetorStr.append(num).append(", ");
            }
            vetorStr.setLength(vetorStr.length() - 2);
            vetorStr.append("]");
            
            
            JOptionPane.showMessageDialog(
                null,
                vetorStr.toString() + "\n\n" + mensagem,
                "Resultado da Pesquisa",
                JOptionPane.INFORMATION_MESSAGE
            );
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(
                null,
                "Por favor, digite um número inteiro válido!",
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }
}
   
    

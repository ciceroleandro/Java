package vetor01;

import java.util.Arrays;

public class Vetor01 {

    public static void main(String[] args) {
        // TODO code application logic here
        int n[] = {3,2,8,7,5,4};
        for(int c=0; c<=n.length-1; c++){
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }    
        String mes [] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
        int tot [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        
        for(int i = 0; i<=mes.length-1; i++){
            System.out.println("O mes de " + mes[i] + " tem " + tot[i] + " dias.");
            
        }
        int num [] = {3, 5, 1, 8, 4};        
        Arrays.sort(num); // comando para colocar em ordem
        for (int valor:num){
            System.out.println(valor + " ");
            System.out.print("");
           
        }
        
        int vet [] = {5, 6, 1, 2, 8};
        for(int v:vet){
            System.out.print(v + " ");
        }
        int p = Arrays.binarySearch(vet, 8);
        System.out.println("Encontrei o valor na posição " + p);
        
        int x [] = new int [20];
        Arrays.fill(x, 8); //preenche todas as 20 posicoes com o numero so, o oito
        for (int valor:x){
            System.out.println(valor + " ");
        }
    }
}
    
    

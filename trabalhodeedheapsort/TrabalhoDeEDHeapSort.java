package trabalhodeedheapsort;

import java.util.Scanner;

public class TrabalhoDeEDHeapSort {

    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int num=0;
        HeapSort heap = new HeapSort();
        while (num!=5){
            
        System.out.println("Digite 1 para adicionar um elemento na heap:");
        System.out.println("Digite 2 para ordenar o vetor como uma heap:");
        System.out.println("Digite 3para imprimir o vetor ou a heap:");
        System.out.println("Digite 4 para remover:");
        System.out.println("Digite 5 para sair do sistema:");
        
        num = scan.nextInt();
        
        switch (num){
            case 1:
                 Elemento e = new Elemento();
                System.out.println("informe a prioridade do elemento:");
                int prioridade = scan.nextInt();
                e.setPrioridade(prioridade);
                heap.inserir(e);
            break;
            
            case 2:
                heap.construirHeap(heap.getLista());
                
            break;
            
            case 3:
                heap.imprimir();
            break;

            case 4:
                heap.remover();
            break;
        }
            
            
        }

    }
    
}

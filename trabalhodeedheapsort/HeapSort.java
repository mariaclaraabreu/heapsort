package trabalhodeedheapsort;

public class HeapSort {
   private int tam;
    private Elemento[] lista = new Elemento[10];

    public int getTam() {
        return tam;
    }

    public Elemento[] getLista() {
        return lista;
    }

    public void setLista(Elemento[] lista) {
        this.lista = lista;
    }
    
    

    public void subir(int i) {
        int j = i / 2;
        if (j >= 0) {
            if (lista[i].getPrioridade() > lista[j].getPrioridade()) {
                Elemento aux = lista[i];
                lista[i] = lista[j];
                lista[j] = aux;
                subir(j);
            }
        }
    }
    
    
     public void construirHeap(Elemento [] lista){
        for(int i = 0; i<tam;i++){
            subir(i);
        }
    }
    
    /*public void verificarVet(Elemento [] lista){
        for(int i = 1; i<=lista.length;i++){
            subir(lista.length-i);
        }
    }*/

    public void inserir(Elemento x) {
        if (tam < lista.length) {
            lista[tam] = x;
            tam++;
        } else {
            System.out.println("ERRO! Fila cheia.");
        }
    }

    public Elemento remover() {
        if (tam == 0) {
            System.out.println("UNDERFLOW");
            return null;
        } else {
            Elemento aux = lista[0];
            lista[0] = lista[tam - 1];
            lista[tam - 1] = null;
            tam--;
            this.construirHeap(lista);
            return aux;
        }
    }
    
    public void imprimir() {
        if (tam == 0) {
            System.out.println("ERRO! Fila vazia.");
        } else {
            System.out.println("Prioridade: " + lista[0].getPrioridade());
            for (int i = 1; i < tam; i++) {
                System.out.println("Prioridade: " + lista[i].getPrioridade());
            }
        }
    }
 
}

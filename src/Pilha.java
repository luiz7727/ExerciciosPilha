public class Pilha {

    int[] dadosPilha = new int[3];
    int topo;

    //topo = n-1(ultimo elemento).

    //inicia a pilha
    public void INIT() {
        this.topo = 0;
    }

    //Operacoes pilha

    //PUSH
    public void PUSH(int valor) {
        dadosPilha[topo] = valor;
        topo++;
    }

    //POP
    public int POP() {
        topo--;
        return dadosPilha[topo];
    }

    //top
    public int TOP(){
        return  dadosPilha[topo-1];
    }

    //isEmpty

    public boolean isEmpty(){
        if(topo == 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }


    //isFull
    public boolean isFull(){
        if(topo == 6)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

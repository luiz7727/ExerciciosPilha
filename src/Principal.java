public class Principal {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.INIT();

        pilha.PUSH(9);
        pilha.PUSH(19);
        pilha.PUSH(6);
        pilha.PUSH(2);
        pilha.PUSH(2);
        pilha.PUSH(2);

        for (int i =0; i <=6 ; i++){
            pilha.POP();
        }

    }
}

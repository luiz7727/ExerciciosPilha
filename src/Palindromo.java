import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        Pilha pilha = new Pilha();

        int[] vector = new int[3];



        for (int i = 0; i < vector.length; i++){
            System.out.print("Informe o " + i +" numero: ");
            vector[i] = scan.nextInt();
            pilha.PUSH(vector[i]);
        }

        for (int i = 0; i < vector.length ; i++){

            if(vector[i] == pilha.TOP()){
                System.out.println("Eh um  palindromo");
                break;
            }
            else{
                System.out.println("Esquece mano, nao chega perto de um palindromo");
                break;
            }
        }


    }
}

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Scanner scan = new Scanner(System.in);

        int[] inverso = new int[4];
        int[] naoInverso = new int[4];
        int i;

        for (i =0;i<inverso.length;i++){
            System.out.print("Digite algum numero: ");
            naoInverso[i] = scan.nextInt();
            p.PUSH(naoInverso[i]);
        }

        for (i = 0; i < inverso.length; i++)
        {
            inverso[i] = p.POP();
        }

        System.out.print(" Não inverso: ");
        for (i = 0;i<inverso.length;i++)
        {
            System.out.print(naoInverso[i]);
        }

        System.out.print(" Inverso: ");
        for (i = 0; i < inverso.length; i++)
        {
            System.out.print(inverso[i]);
        }

        System.out.println();

        boolean palindromo = false;
        for (i=0; i < naoInverso.length;i++){
            if (naoInverso[i] == inverso[i]){
                palindromo = true;
            }
            else
            {
                palindromo = false;
            }
        }

        if (palindromo)
        {
            System.out.println("É um palindromo");
        }
        else
        {
            System.out.println("Não é um palindromo");
        }

    }
}

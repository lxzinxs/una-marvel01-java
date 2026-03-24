import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.println("Digite o nome do(a) recruta: ");
        String nome = teclado.nextLine();
        System.out.println("Olá " + nome + "!");

        System.out.println("Digite o seu peso: ");
        double peso = teclado.nextDouble();
        System.out.println("Seu peso é: " + peso + "kg");

        System.out.println("Digite sua altura em cm: ");
        double alturaCm = teclado.nextDouble();

        double imc = peso / Math.pow(alturaCm / 100, 2);
        System.out.println("Seu imc é " + imc);

        if(peso < 50){
            System.out.println("Vocês está abaixo do peso ideal para o alistamento!");
        } else if( peso >= 50 && peso <= 100) {
            System.out.println("Você está dentro do peso ideal para o alistamento.");
        } else {
            System.out.println("Você está acima do peso ideal para o alistamento.");
        }
        teclado.close();
    }
}
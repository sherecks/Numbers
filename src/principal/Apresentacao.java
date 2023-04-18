package principal;

import dados.Naturais;
import dados.Abundantes;
import dados.Fatoriais;
import dados.Fibonacci;
import dados.NumerosPrimos;
import dados.Quadrados;
import dados.Perfeitos;

import java.util.Scanner;

public class Apresentacao {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um valor: ");
            int n = Integer.parseInt(scanner.nextLine());

            //Naturais
            System.out.println("Naturais: ");
            Naturais naturais = new Naturais() {};
            naturais.gerar(n);
            System.out.println(naturais.getSequencia() + "\n");

            //Abundantes
            System.out.println("Abundantes: ");
            Abundantes abundantes = new Abundantes() {};
            abundantes.gerar(n);
            System.out.println(abundantes.getSequencia()  + "\n");

            //Fatoriais
            System.out.println("Fatorial: ");
            Fatoriais fatoriais = new Fatoriais() {};
            fatoriais.gerar(n);
            System.out.println(fatoriais.getSequencia()  + "\n");

            //Fibonacci
            System.out.println("Fibonacci: ");
            Fibonacci fibonacci = new Fibonacci() {};
            fibonacci.gerar(n);
            System.out.println(fibonacci.getSequencia()  + "\n");

            //Primos
            System.out.println("Primos: ");
            NumerosPrimos primos = new NumerosPrimos() {};
            primos.gerar(n);
            System.out.println(primos.getSequencia()  + "\n");

            //Quadrados
            System.out.println("Quadrados: ");
            Quadrados quadrados = new Quadrados();
            quadrados.gerar(n);
            System.out.println(quadrados.getSequencia()  + "\n");

            //Perfeitos
            System.out.println("Perfeitos: ");
            Perfeitos perfeitos = new Perfeitos() {};
            perfeitos.gerar(n);
            System.out.println(perfeitos.getSequencia()  + "\n");


        } catch (NumberFormatException e) {
            e.printStackTrace();
            }
        
    }

}

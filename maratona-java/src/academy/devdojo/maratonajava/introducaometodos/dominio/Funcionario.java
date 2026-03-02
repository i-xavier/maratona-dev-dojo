package academy.devdojo.maratonajava.introducaometodos.dominio;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario ;

    public void imprimirDados ()
    {
        int i = 1;
        System.out.println("Funcionário: " + this.nome +"\nIdade: " + this.idade );

        for (double v : this.salario) {
            System.out.println("Salario "+ i +": " + v);
            i++;
        }

        System.out.println("Média de Salario: " + mediaSalarios(this.salario));
    }

    public double mediaSalarios (double[] salarios)
    {
        double mediaSalarios = 0;

        for (double v : salarios) {
            mediaSalarios += v;
        }

        return mediaSalarios / this.salario.length;
    }

    public void captarDados () {
        Scanner input = new Scanner(System.in);
        this.salario = new double[3];

        System.out.print("Digite seu nome: ");
        this.nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        this.idade = input.nextInt();

        System.out.print("Digite seus três últimos salarios: ");

        for (int i = 0; i < this.salario.length; i++) {
            this.salario[i] = input.nextDouble();
        }

    }
}

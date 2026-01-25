package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main (String[] args) {
        Estudante p1 = new Estudante();

        p1.idade = 11;
        p1.nome = "Carlos";
        p1.sexo = 'M';

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);
    }
}

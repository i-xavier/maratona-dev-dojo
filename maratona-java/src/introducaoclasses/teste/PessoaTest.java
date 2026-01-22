package introducaoclasses.teste;

import introducaoclasses.dominio.Pessoa;

public class PessoaTest {
    public static void main (String[] args) {
        Pessoa p1 = new Pessoa();

        p1.idade = 11;
        p1.nome = "Carlos";
        p1.sexo = 'M';

        System.out.println(p1.nome);
        System.out.println(p1.idade);
        System.out.println(p1.sexo);
    }
}

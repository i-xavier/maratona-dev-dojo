package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kame";
        professor.idade = 145;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " \nIdade: " + professor.idade + " \nSexo: " + professor.sexo);
    }
}

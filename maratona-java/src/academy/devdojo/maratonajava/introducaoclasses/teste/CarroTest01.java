package academy.devdojo.maratonajava.introducaoclasses.teste;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Camaro";
        carro1.marca = "Ford" ;
        carro1.ano = 1995;

        carro2.nome = "Dolphin mini";
        carro2.marca = "BYD";
        carro2.ano = 2025;

        System.out.println(carro1.nome);
        System.out.println(carro1.marca);
        System.out.println(carro1.ano);

        System.out.println(carro2.nome);
        System.out.println(carro2.marca);
        System.out.println(carro2.ano);
    }
}

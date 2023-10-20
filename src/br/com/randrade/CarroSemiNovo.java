package br.com.randrade;

public class CarroSemiNovo extends Factory{
    @Override
    Carro retrieveCar(String requestedGrade) {
        return new SienaCarro(30000,"Cinza");
    }
}

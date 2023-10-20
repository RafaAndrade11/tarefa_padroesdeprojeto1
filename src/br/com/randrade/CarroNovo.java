package br.com.randrade;

public class CarroNovo extends Factory{
    @Override
    Carro retrieveCar(String requestedGrade) {
        return new FerrariCarro(1000000, "Vermelho");
    }
}

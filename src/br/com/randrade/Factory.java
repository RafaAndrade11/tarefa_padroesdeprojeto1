package br.com.randrade;

public abstract class Factory {
    public Carro criar(String requestedGrade) {
        Carro car = retrieveCar(requestedGrade);
        car = prepararCarro(car);
        return car;
    }
    private Carro prepararCarro(Carro car) {
        car.limpar();
        car.checarMotor();
        return car;
    }
    abstract Carro retrieveCar(String requestedGrade);
}

package br.com.randrade;

public class Demo {

    public static void main(String[] args) {
        System.out.println("********** PRIMEIRA VENDA **********");
        Cliente cliente1 = new Cliente("Siena", false);
        Factory factory = getFactory(cliente1);
        Carro carro = factory.criar(cliente1.getCarroRequerido());
        carro.carroComprado();

        System.out.println("********** SEGUNDA VENDA **********");
        Cliente cliente2 = new Cliente("Ferrari", true);
        Factory factory1 = getFactory(cliente2);
        Carro carro1 = factory1.criar(cliente2.getCarroRequerido());
        carro1.carroComprado();

    }

    private static Factory getFactory(Cliente cliente1) {
        if (cliente1.isCarroNovo()) {
            return new CarroNovo();
        } else {
            return new CarroSemiNovo();
        }
    }

}



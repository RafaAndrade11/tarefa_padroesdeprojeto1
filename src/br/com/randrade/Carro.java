package br.com.randrade;

public abstract class Carro {

    private int preco;
    private String cor;

    public Carro(int preco, String cor) {
        this.preco = preco;
        this.cor = cor;
    }
    public void carroComprado(){
        System.out.println("O carro comprado foi: " + getClass().getSimpleName());
    }
    public void limpar(){
        System.out.println("O carro chegou ao pátio e está pronto para venda! O preço é:R$" + preco);
    }
    public void checarMotor() {
        System.out.println("O motor foi checado e está tudo pronto para uso! A cor do carro escolhida foi: " + cor);
    }

}

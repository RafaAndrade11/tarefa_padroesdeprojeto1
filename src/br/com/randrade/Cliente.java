package br.com.randrade;

public class Cliente {

    private String carroRequerido;
    private boolean isCarroNovo;

    public Cliente(String carroRequerido, boolean isCarroNovo) {
        this.carroRequerido = carroRequerido;
        this.isCarroNovo = isCarroNovo;
    }

    public boolean isCarroNovo() {
        return isCarroNovo;
    }

    public String getCarroRequerido() {
        return carroRequerido;

    }
}
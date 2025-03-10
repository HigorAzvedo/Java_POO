package org.example;

public class Modelo {
    private String nomeModelo;
    private Marca marca;

    public Modelo(){}

    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getNomeModelo() {
        return nomeModelo;
    }
    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }
}

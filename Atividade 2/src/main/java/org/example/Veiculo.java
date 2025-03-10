package org.example;

public class Veiculo {
    private int anoDeFabricacao;
    private Modelo modelo;
    private String cor;
    private int KmAtual;
    private String tipoCombustivel;

    public Veiculo(){}

    public Veiculo(int anoDeFabricacao,String cor, int KmAtual, String tipoCombustivel){
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;
        this.KmAtual = KmAtual;
        this.tipoCombustivel = tipoCombustivel;
    }
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getKmAtual() {
        return KmAtual;
    }

    public void setKmAtual(int kmAtual) {
        KmAtual = kmAtual;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustives) {
        this.tipoCombustivel = tipoCombustives;
    }
}

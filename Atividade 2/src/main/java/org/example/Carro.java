package org.example;

public class Carro extends Veiculo{

    private int qtdPortas;
    private boolean temCambioAutomatico;
    private boolean temArCondicionado;

    public Carro (){}
    public Carro (int anoDeFabricacao, String cor, int KmAtual, String tipoCombustivel, int qtdPortas, boolean temCambioAutomatico, boolean temArCondicionado){
        super(anoDeFabricacao,cor,KmAtual,tipoCombustivel);
        this.qtdPortas = qtdPortas;
        this.temCambioAutomatico = temCambioAutomatico;
        this.temArCondicionado = temArCondicionado;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean isTemCambioAutomatico() {
        return temCambioAutomatico;
    }

    public void setTemCambioAutomatico(boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    public boolean isTemArCondicionado() {
        return temArCondicionado;
    }

    public void setTemArCondicionado(boolean temArCondicionado) {
        this.temArCondicionado = temArCondicionado;
    }
}

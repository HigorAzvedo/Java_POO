package org.example;

public class Main {
    public static void main(String[] args) {
        //Instância da Marca
        Marca marcaToyota = new Marca();
        marcaToyota.setNomeMarca("Toyota");

        Marca marcaHonda = new Marca();
        marcaHonda.setNomeMarca("Honda");

        Marca marcaMercedes = new Marca();
        marcaMercedes.setNomeMarca("Mercedes-Benz");

        //Instância do Modelo
        Modelo modeloCorolla = new Modelo();
        modeloCorolla.setNomeModelo("Corolla");
        modeloCorolla.setMarca(marcaToyota);

        Modelo modeloCG = new Modelo();
        modeloCG.setNomeModelo("CG 160");
        modeloCG.setMarca(marcaHonda);

        Modelo modeloSprinter = new Modelo();
        modeloSprinter.setNomeModelo("Sprinter");
        modeloSprinter.setMarca(marcaMercedes);

        // Instância do Carro
        Carro carro = new Carro(2022, "Preto", 15000, "Gasolina", 4, true, false);
        carro.setModelo(modeloCorolla);

        // Instância da Moto
        Moto moto = new Moto();
        moto.setAnoDeFabricacao(2021);
        moto.setCor("Vermelha");
        moto.setKmAtual(5000);
        moto.setTipoCombustivel("Gasolina");
        moto.setCilindradas(160);
        moto.setModelo(modeloCG);

        //Instância da Van
        Van van = new Van();
        van.setAnoDeFabricacao(2023);
        van.setCor("Branca");
        van.setKmAtual(8000);
        van.setTipoCombustivel("Diesel");
        van.setQtdAssentos(15);
        van.setTemCambioAutomatico(false);
        van.setTemArCondicionado(true);
        van.setModelo(modeloSprinter);



        System.out.println("Carro: " + carro.getModelo().getMarca().getNomeMarca() + " " + carro.getModelo().getNomeModelo() +
                ", Ano: " + carro.getAnoDeFabricacao() + ", Cor: " + carro.getCor() + ", KM: " + carro.getKmAtual() + ", Cambio automático: " + (carro.isTemCambioAutomatico()? "Sim" : "Não") + ", Ar condicionado: " + (carro.isTemArCondicionado() ? "Sim" : "Não"));

        System.out.println("Moto: " + moto.getModelo().getMarca().getNomeMarca() + " " + moto.getModelo().getNomeModelo() +
                ", Ano: " + moto.getAnoDeFabricacao() + ", Cor: " + moto.getCor() + ", KM: " + moto.getKmAtual() + ", Cilindradas: " + moto.getCilindradas());

        System.out.println("Van: " + van.getModelo().getMarca().getNomeMarca() + " " + van.getModelo().getNomeModelo() +
                ", Ano: " + van.getAnoDeFabricacao() + ", Cor: " + van.getCor() + ", KM: " + van.getKmAtual() +
                ", Assentos: " + van.getQtdAssentos() + ", Cambio automático: " + (van.isTemCambioAutomatico()? "Sim" : "Não") + ", Ar condicionado: " + (van.isTemArCondicionado() ? "Sim" : "Não"));

    }
}
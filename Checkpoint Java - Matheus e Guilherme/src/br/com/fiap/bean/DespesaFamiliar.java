//Guilherme Ribeiro Matias. RM:573890
//Matheus Nogueira Quintas. RM 572542


package br.com.fiap.bean;

public class DespesaFamiliar {

    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;


    public double calcularTotalDeDespesas() {
        return gastoComLuz + gastoComAgua + gastoComInternet + (numeroDeMoradores * valorMensalidadeDaAcademia);
    }

    public double calcularRendaFamiliarLiquida() {
        return rendaFamiliar - calcularTotalDeDespesas();
    }
}
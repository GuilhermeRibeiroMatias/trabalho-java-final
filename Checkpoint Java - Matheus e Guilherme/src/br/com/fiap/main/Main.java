//Guilherme Ribeiro Matias. RM:573890
//Matheus Nogueira Quintas. RM 572542


package br.com.fiap.main;

import java.util.Scanner;
import br.com.fiap.bean.DespesaFamiliar;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DespesaFamiliar despesafamiliar = new DespesaFamiliar();

        System.out.print("Digite a renda familiar: ");
        despesafamiliar.rendaFamiliar = scanner.nextDouble();

        System.out.print("Digite o número de moradores: ");
        despesafamiliar.numeroDeMoradores = scanner.nextInt();

        System.out.print("Digite o gasto com luz: ");
        despesafamiliar.gastoComLuz = scanner.nextDouble();

        System.out.print("Digite o gasto com água: ");
        despesafamiliar.gastoComAgua = scanner.nextDouble();

        System.out.print("Digite o gasto com internet: ");
        despesafamiliar.gastoComInternet = scanner.nextDouble();

        System.out.print("Digite o valor da mensalidade da academia: ");
        despesafamiliar.valorMensalidadeDaAcademia = scanner.nextDouble();

        System.out.printf("Renda Familiar: %.3f%n", despesafamiliar.rendaFamiliar);
        System.out.printf("Número de Moradores: %d%n", despesafamiliar.numeroDeMoradores);
        System.out.printf("Total de Despesas: %.3f%n", despesafamiliar.calcularTotalDeDespesas());
        System.out.printf("Renda Líquida: %.3f%n", despesafamiliar.calcularRendaFamiliarLiquida());

        scanner.close();
    }
}
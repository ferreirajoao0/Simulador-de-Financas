package SistemaFinanceiro;
import java.util.Scanner;
public class SimuladorFinancas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu Saldo Inicial ? ");
        double saldoInicial = sc.nextDouble();

        System.out.println("Qual será o seu aporte mensal ? ");
        double aporteMensal = sc.nextDouble();

        System.out.println("Seu dinherio será investido no Tesouro Selic");
        double taxasJurosMensal = 1.00 /100;

        System.out.println("Quantos meses você pretende deixar o dinheiro investindo ? ");
        int totalMeses = sc.nextInt();

        System.out.println("Qual será a sua meta financeira ? ");
        double metaFinanceira = sc.nextDouble();

        double saldoAtual = saldoInicial;
        boolean metaAlcancada = false;
        int mesMeta = 0;

        for (int mes = 1; mes <= totalMeses ; mes++) {
            double calculoRendimento = saldoAtual * taxasJurosMensal;
            saldoAtual = saldoAtual + calculoRendimento + aporteMensal;
            System.out.printf("Mês %d: Rendimento = R$ %.2f | Saldo Atual = R$ %.2f%n", mes, calculoRendimento, saldoAtual);

            if(saldoAtual >= metaFinanceira && !metaAlcancada) {
                metaAlcancada = true;
                mesMeta = mes;
                }
            }
        if(metaAlcancada == true) {
            System.out.printf("Meta alcançada no Mês %d!\n" , mesMeta);
        }else{
            double faltou = metaFinanceira - saldoAtual;
            System.out.printf("Infelizmente você não atingiu a meta. Faltaram R$ %.2f\n", faltou);
        }
        sc.close();
    }
}

package Heranca;

public class EmpregadoComissado extends Empregado {

    double totalVendas;
    double comissao;

    public EmpregadoComissado(long matricula, String nome, double totalVendas, double comissao) {
        super(matricula, nome);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        return totalVendas * comissao / 100;
    }

    @Override
    public String toString() {
        return "EmpregadoComissado{" +
                "totalVendas=" + totalVendas +
                ", comissao=" + comissao +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}

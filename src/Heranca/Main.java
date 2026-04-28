package Heranca;

public class                                                                                                                                Main {
    public static void main(String[] args) {

       Empregado [] empregado = new Empregado[4];

       empregado [0] = new EmpregadoComissado(1, "Lorena", 35000,20);
       empregado [1] = new EmpregadoHorista(2, "Silva", 160,550);
       empregado [2] = new EmpregadoComissado(3, "lo", 160,550);
       empregado [3] = new EmpregadoHorista(4, "Espinoza", 80,30);

        //for genérico
        for (Empregado e: empregado){
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
        }

    }
}

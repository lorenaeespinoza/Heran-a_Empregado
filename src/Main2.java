import Heranca.Empregado;
import Heranca.EmpregadoComissado;
import Heranca.EmpregadoHorista;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Empregado> lista = new ArrayList<>();

        lista.add(new EmpregadoComissado(1,"L", 10, 10));
        lista.add(new EmpregadoHorista(2,"O", 20, 20));
        lista.add(0, new EmpregadoHorista(3,"R", 20, 20));

        //for tradicional

        //for (int i = 0; i < lista.size(); i++){
        //  System.out.println(lista.get(i).nome);
       // }

        System.out.println();

        for (Empregado empregado : lista){
            System.out.println(empregado.nome);
            System.out.println(empregado.calcularSalario());
        }

    }
}

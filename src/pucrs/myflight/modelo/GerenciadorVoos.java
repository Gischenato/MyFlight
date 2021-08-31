package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<Voo> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public void adicionar(Voo voo){
        voos.add(voo);
    }

    public ArrayList<Voo> listarTodos(){
        return voos;
    }

    public String toString(){
        String res = "Voos:\n";
        res += " Cia  Origem  Destino Cod  Horario Duracao   Data\n";
        res += "                                    (min)\n";

        for (int i = 0; i < voos.size(); i++) {
            Voo atual = voos.get(i);
            res+= atual.toString() + "\n";
        }

        return res;
    }

    public ArrayList<Voo> buscarPorData(LocalDateTime data){
        ArrayList<Voo> temp = new ArrayList<>();
        for (int i = 0; i < voos.size(); i++) {
            Voo atual = voos.get(i);
            if(data == atual.getDatahora()){ temp.add(atual); }
        }
        return temp.size() == 0 ? null : temp;
    }
}

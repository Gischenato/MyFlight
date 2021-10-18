package pucrs.myflight.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class GerenciadorVoos {
    private ArrayList<VooDireto> voos;

    public GerenciadorVoos(){
        voos = new ArrayList<>();
    }

    public void adicionar(VooDireto voo){
        voos.add(voo);
    }

    public ArrayList<VooDireto> listarTodos(){
        return voos;
    }

    public String toString(){
        String res = "Voos:\n";
        res += " Cia  Origem  Destino Cod  Horario Duracao   Data\n";
        res += "                                    (min)\n";

        for (int i = 0; i < voos.size(); i++) {
            VooDireto atual = voos.get(i);
            res+= atual.toString() + "\n";
        }

        return res;
    }

    public ArrayList<VooDireto> buscarPorData(LocalDateTime data){
        ArrayList<VooDireto> temp = new ArrayList<>();
        for (int i = 0; i < voos.size(); i++) {
            VooDireto atual = voos.get(i);
            if(data == atual.getDataHora()){ temp.add(atual); }
        }
        return temp.size() == 0 ? null : temp;
    }
}

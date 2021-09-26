package pucrs.myflight.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public ArrayList<Aeroporto> listarTodos(){
        return aeroportos;
    }

    public void ordenaDescricao() {
        Collections.sort(aeroportos);
    }

    public String toString(){
        String res = "Aeroportos:\n";

        for(int i = 0; i<aeroportos.size(); i++){
            Aeroporto atual = aeroportos.get(i);
            res += "  " + atual.toString() + "\n";
        }
        return res;
    }

    public Aeroporto buscarPorCodigo(String cod){
        for (int i = 0; i < aeroportos.size(); i++) {
            Aeroporto atual = aeroportos.get(i);
            if(cod == atual.getCodigo()){ return atual; }
        }

        return null;
    }
}

package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeroportos {
    private ArrayList<Aeroporto> aeroportos;

    public GerenciadorAeroportos(){
        aeroportos = new ArrayList<>();
    }

    public void adicionar(Aeroporto aeroporto){
        aeroportos.add(aeroporto);
    }

    public String listarTodos(){
        String res = "Aeroportos:\n";

        for(int i = 0; i<aeroportos.size(); i++){
            Aeroporto atual = aeroportos.get(i);
            res += "  (" + atual.getCodigo() + ") - " + atual.getNome() + "\n";
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

package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorAeronaves {
    private ArrayList<Aeronave> aeronaves;

    public GerenciadorAeronaves(){
        aeronaves = new ArrayList<>();
    }

    public void adicionar(Aeronave aviao){
        aeronaves.add(aviao);
    }

    public String toString(){
        String res = "Aeronaves:\n";

        for(int i = 0; i<aeronaves.size(); i++){
            Aeronave atual = aeronaves.get(i);
            res += "  ("+ atual.getCodigo() + ") - " + atual.getDescricao() +"\n";
        }

        return res;
    }

    public Aeronave buscarPorCodigo(String cod){
        for(int i = 0; i<aeronaves.size(); i++){
            Aeronave atual = aeronaves.get(i);
            if(cod == atual.getCodigo()){ return atual; }
        }

        return null;
    }
}

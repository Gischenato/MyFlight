package pucrs.myflight.modelo;

import java.util.ArrayList;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public String toString(){
        String res = "Rotas: \n";
        res += " Cia  Origem  Destino Cod\n\n";
        for (int i = 0; i < rotas.size(); i++) {
            Rota atual = rotas.get(i);
            res += "  "+ atual.toString() +"\n";
        }

        return res;
    }

    public ArrayList<Rota> buscarPorOrigem(Aeroporto origem){
        ArrayList<Rota> temp = new ArrayList<>();
        for (int i = 0; i < rotas.size(); i++) {
            Rota atual = rotas.get(i);
            if(origem == atual.getOrigem()){ temp.add(atual); }
        }
        return temp.size() == 0 ? null : temp;
    }

    public ArrayList<Rota> buscarPorDestino(Aeroporto destino){
        ArrayList<Rota> temp = new ArrayList<>();
        for (int i = 0; i < rotas.size(); i++) {
            Rota atual = rotas.get(i);
            if(destino == atual.getDestino()){ temp.add(atual); }
        }
        return temp.size() == 0 ? null : temp;
    }
}

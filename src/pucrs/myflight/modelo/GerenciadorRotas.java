package pucrs.myflight.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GerenciadorRotas {
    private ArrayList<Rota> rotas;

    public GerenciadorRotas(){
        rotas = new ArrayList<>();
    }

    public void adicionar(Rota rota){
        rotas.add(rota);
    }

    public ArrayList<Rota> listarTodos(){
        return rotas;
    }

    public int getTotalCadastrados(){
        return rotas.size();
    }

    public void carregaDados(GerenciadorCias empresas,
                             GerenciadorAeroportos aeroportos,
                             GerenciadorAeronaves aeronaves) throws IOException{
        Path dados = Paths.get("src/pucrs/myflight/data/routes.dat");
        Scanner reader = new Scanner(Files.newBufferedReader(dados));
        reader.useDelimiter("[;\n]");
        reader.nextLine();
        int erros = 0;
        while(reader.hasNext()){
            try {
                String cod_Empresa = reader.next();
                String cod_Aeroporto_Origem = reader.next();
                String cod_Aeroporto_Destino = reader.next();
                reader.next();
                reader.next();
                String cod_Aeronave = reader.next();
                cod_Aeronave = cod_Aeronave.substring(0, 3);

                CiaAerea cia = empresas.buscarPorCodigo(cod_Empresa);
                Aeroporto origem = aeroportos.buscarPorCodigo(cod_Aeroporto_Origem);
                Aeroporto destino = aeroportos.buscarPorCodigo(cod_Aeroporto_Destino);
                Aeronave aeronave = aeronaves.buscarPorCodigo(cod_Aeronave);
                Rota rota = new Rota(cia, origem, destino, aeronave);
                adicionar(rota);

            } catch (Exception e) {
                erros++;
            }
        }
        if(erros > 0) System.out.println(erros + " erros ao adicionar rotas"); 
    }

    public void ordenaDescricao(){
        Collections.sort(rotas);
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

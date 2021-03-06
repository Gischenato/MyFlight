package pucrs.myflight.modelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GerenciadorAeronaves {
     private ArrayList<Aeronave> aeronaves;

     public GerenciadorAeronaves(){
          aeronaves = new ArrayList<>();
     }

     public void adicionar(Aeronave aviao){
          aeronaves.add(aviao);
     }

     public int getTotalCadastrados(){
          return aeronaves.size();
     }

     public void carregaDados() throws IOException{
               Path dados = Paths.get("src/pucrs/myflight/data/equipment.dat");
          Scanner reader = new Scanner(Files.newBufferedReader(dados));
          
          reader.useDelimiter("[;\n]");
          reader.nextLine();
          int erros = 0;
          while(reader.hasNext()){
               try{
                    String codigo = reader.next();
                    String descricao = reader.next();
                    int capacidade = Integer.parseInt(reader.next().replace("\r", ""));
                    Aeronave aviao = new Aeronave(codigo, descricao, capacidade);
                    adicionar(aviao);
                    
               }catch(Exception e){
                    System.out.println(e);
                    erros++;
               }
          }
          if(erros > 0) System.out.println(erros + " erros ao adicionar aeronaves");  
     }

     public ArrayList<Aeronave> listarTodos(){
          return aeronaves;
     }

     public void ordenaDescricao() {
          Collections.sort(aeronaves);
     }

     public String toString(){
          String res = "Aeronaves:\n";

          for(int i = 0; i<aeronaves.size(); i++){
               Aeronave atual = aeronaves.get(i);
               res += "  " + atual.toString() + "\n";
          }

          return res;
     }

     public Aeronave buscarPorCodigo(String cod) throws NoSuchElementException{
          var optional = aeronaves.stream()
                                   .filter(p -> p.getCodigo().equals(cod))
                                   .findFirst();
          
          return (optional.isEmpty()) ? null : optional.get();
     }
}

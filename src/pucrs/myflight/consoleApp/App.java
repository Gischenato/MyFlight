package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;
import pucrs.myflight.modelo.GerenciadorCias;
import pucrs.myflight.modelo.GerenciadorRotas;
import pucrs.myflight.modelo.GerenciadorVoos;

public class App {

     public static void main(String[] args) {
          System.out.println("\nMyFlight project...");

          // Criando os gerenciadores
          GerenciadorAeronaves aeronaves = new GerenciadorAeronaves();
          GerenciadorCias empresas = new GerenciadorCias();
          GerenciadorAeroportos aeroportos = new GerenciadorAeroportos();
          GerenciadorRotas rotas = new GerenciadorRotas();
          GerenciadorVoos voos = new GerenciadorVoos();
          try {
               empresas.carregaDados();
               aeronaves.carregaDados();
               aeroportos.carregaDados();
               rotas.carregaDados(empresas, aeroportos, aeronaves);
          } catch (Exception e) {
               System.out.println("Erro de IO ao carregar dados.");
          }

          System.out.println(empresas.getTotalCadastrados() + " Cias cadastradas.");
          System.out.println(aeronaves.getTotalCadastrados() + " Aeronaves cadastradas.");
          System.out.println(aeroportos.getTotalCadastrados() + " Aeroportos cadastradas.");
          System.out.println(rotas.getTotalCadastrados() + " Rotas cadastradas.");
     }
}

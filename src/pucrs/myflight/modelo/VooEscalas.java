package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class VooEscalas extends Voo{
    private ArrayList<Rota> rotas;

    // Construtor
    public VooEscalas(LocalDateTime dh) {
        super(dh);
        this.rotas = new ArrayList<>();
    }

    public void adicionarRota(Rota rota){
        rotas.add(rota);
    }

    @Override
    public Rota getRota() {
        return rotas.get(0);
    }

    public ArrayList<Rota> getRotas() {
        return rotas; 
    }


    @Override
    public Duration getDuration() {
        double tempo = 0;
        for (Rota rota : rotas) {
            Aeroporto origem = rota.getOrigem();
            Aeroporto destino = rota.getDestino();
            double distancia = origem.getLocal().distancia(destino.getLocal());
            tempo += (distancia/805 + 0.5) * 60; 

        }

		Duration duration = Duration.ofMinutes((long) tempo);
		return duration;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String res = "";
        for (Rota rota : rotas) {
            res += "  " + rota.toString();
        }
		res += ":" + (getDataHora().getMinute()== 0 ? "00" : getDataHora().getMinute()); 
		res += "    " + getDuration().toMinutes();

       return "Voo com escala: ---------------------------------------\n" 
            + super.toString() + "\n"
            + res 
            + "-------------------------------------------------------";
    }

 
}

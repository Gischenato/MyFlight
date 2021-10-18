package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VooEscalas extends VooDireto{
    private Rota rotaFinal;
    private Duration duracaoVoo2;
    private LocalDateTime dataHoraFinal;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime dh, LocalDateTime dhFinal) {
       super(rota, dh); // chama o construtor de Voo
       this.rotaFinal = rotaFinal;
       this.dataHoraFinal = dhFinal;
    }

    // Gets, etc
    
    public Rota getRotaFinal() { return rotaFinal; }

    @Override
    public String toString() {
        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String res = "";
        res += "  " + rotaFinal.toString() + "   " + dataHoraFinal.getHour();
		res += ":" + (dataHoraFinal.getMinute()== 0 ? "00" : dataHoraFinal.getMinute()); 
		res += "    " + duracaoVoo2.toMinutes();
		res += "   " + dataHoraFinal.format(formatado) + "\n";
        

       return "Voo com escala: ---------------------------------------\n" 
            + super.toString() + "\n"
            + res 
            + "-------------------------------------------------------";
    }
}

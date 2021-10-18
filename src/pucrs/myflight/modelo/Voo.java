package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;


public abstract class Voo {
    
    public enum Status{ CONFIRMADO, ATRASADO, CANCELADO };

    private LocalDateTime datahora;

    public abstract Rota getRota();

    public abstract LocalDateTime getDataHora();

    public abstract Duration getDuration();
}

package br.com.etechoracio.model;

import br.com.etechoracio.enums.PrevisaoTempo.DirecaoVento;
import br.com.etechoracio.enums.PrevisaoTempo.FaseLua;

import java.time.LocalDate;

public class PrevisaoTempo {
    public String local;
    public LocalDate dia;
    public String descricao;
    public int temperatura;
    public double chuva;
    public int vento;
    public DirecaoVento direcao_vento;
    public int velocidade_vento;
    public int umidade;
    public FaseLua lua;
}

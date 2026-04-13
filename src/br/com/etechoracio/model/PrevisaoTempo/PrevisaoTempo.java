package br.com.etechoracio.model.PrevisaoTempo;

import br.com.etechoracio.enums.PrevisaoTempo.CondicaoClimaEnum;
import br.com.etechoracio.enums.PrevisaoTempo.FaseLuaEnum;

import java.time.LocalDate;

public class PrevisaoTempo {
    public LocalDate data;
    public String local;
    public String descricao;
    public CondicaoClimaEnum condicaoClima;
    public Temperatura temperatura;
    public double probabilidadeChuva;
    public double umidadeAr;
    public Vento velocidadeVento;
    public FaseLuaEnum lua;
}

package br.com.etechoracio.model;

import br.com.etechoracio.enums.Receita.CustoEnum;
import br.com.etechoracio.enums.Receita.DificuldadeEnum;

import java.time.LocalTime;

public class Receita {
    public String nome;
    public Estrela estrela;
    public LocalTime tempo;
    public DificuldadeEnum dificuldade;
    public CustoEnum custo;
    public int quantidade_porcao;
    public String descricao;
}

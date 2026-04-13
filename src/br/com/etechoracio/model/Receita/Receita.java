package br.com.etechoracio.model.Receita;

import br.com.etechoracio.enums.Receita.CustoEnum;
import br.com.etechoracio.enums.Receita.NivelDificuldadeEnum;

public class Receita {
    public String nome;
    public Autor autor;
    public int tempoPreparo;
    public NivelDificuldadeEnum dificuldade;
    public CustoEnum custo;
    public int porcoes;
    public String descricao;
}

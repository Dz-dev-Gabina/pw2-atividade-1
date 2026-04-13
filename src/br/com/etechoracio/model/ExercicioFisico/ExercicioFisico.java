package br.com.etechoracio.model.ExercicioFisico;

import br.com.etechoracio.enums.ExFisico.NivelDificuldadeEnum;

public class ExercicioFisico {
    public String nome;
    public GrupoMuscular grupoMuscular;
    public String imagem;
    public String descricao;
    public int numeroSeries;
    public int numeroRepeticoes;
    public double cargaSugerida;
    public NivelDificuldadeEnum nivelDificuldade;
}

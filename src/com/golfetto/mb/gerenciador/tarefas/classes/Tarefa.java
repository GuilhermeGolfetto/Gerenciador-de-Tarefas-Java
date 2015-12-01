package com.golfetto.mb.gerenciador.tarefas.classes;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value="Tarefa")
public class Tarefa {
    
    @XStreamAlias(value="Nome")
    private String nome;
    
    @XStreamAlias(value="Descricao")
    private String descricao;
    
    @XStreamAlias(value="Prazo")
    private String prazo;
    
    @XStreamAlias(value="Prioridade")
    private String prioridade;
    
    @XStreamAlias(value="Concluida")
    private String concluida;
    
    public Tarefa(){
    }

    public Tarefa(String nome, String descricao, String prazo, String prioridade, String concluida) {
        this.nome = nome;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.concluida = concluida;
    }
    public Tarefa(Tarefa t){
        this.nome = t.getNome();
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public String getConcluida() {
        return concluida;
    }

    public void setConcluida(String concluida) {
        this.concluida = concluida;
    }

    @Override
    public String toString() {
        return "Tarefa{" + ", nome=" + nome + ", descricao=" + descricao + ", prazo=" + prazo + ", prioridade=" + prioridade + ", concluida=" + concluida + '}';
    }
    
}

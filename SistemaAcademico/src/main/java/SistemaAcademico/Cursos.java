/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SistemaAcademico;

import java.util.List;

/**
 *
 * @author aluno
 */
public abstract class Cursos {
   private int codigo;
   private String nome;
   private String chTotal;     
   private String duracao;
   private String tipoDeDuracao;
   private String Modalidade;
   private String status;
   
   public String getNome(){
       return this.nome;
   } 
   public int getCodigo(){
       return this.codigo;
   }
  public int get(){
       return this.codigo;
   }

    public String getChTotal() {
        return chTotal;
    }

    public void setChTotal(String chTotal) {
        this.chTotal = chTotal;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTipoDeDuracao() {
        return tipoDeDuracao;
    }

    public void setTipoDeDuracao(String tipoDeDuracao) {
        this.tipoDeDuracao = tipoDeDuracao;
    }

    public String getModalidade() {
        return Modalidade;
    }

    public void setModalidade(String Modalidade) {
        this.Modalidade = Modalidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
    public List <String>obterDisciplinas(){
       return null;
        
    }
     public List <String>obterAlunosAtivos(){
       return null;
        
    }
     public abstract void matricula();
         
}

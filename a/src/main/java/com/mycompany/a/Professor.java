/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Professor {
    
    private String nome;
    private String entidadeInst;
    private String email;
    private int telefone;
    private String titulacao;
    private String area;
    private Date dataIngresso;
    private String formacao;
    
    public class professor{
    
    }
    public String getNome(){
        return nome;
    }
    public void getNome(String _nome){
        nome = _nome;
    }
    public String getEntidadeInst(){
        return entidadeInst;
    }
    public void setEntidadeInst(String _entidadeInst){
        entidadeInst = _entidadeInst;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int _telefone){
        telefone = _telefone;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String _email){
        email = _email;
    }
    public String getTitulacao(){
        return titulacao;
    }
    public void setTitulacao(String _titulacao){
        titulacao = _titulacao;
    }
    public String getArea(){
        return area;
    }
    public void setArea(String _area){
        area = _area;
    }
    public Date getDataIngresso(){
        return dataIngresso;
    }
    public void setDataIngresso(Date _dataIngresso){
        dataIngresso = _dataIngresso;
    }
    public String getFormacao(){
        return formacao;
    }
    public void setFormacao(String _formacao){
        formacao = _formacao;
    }
}

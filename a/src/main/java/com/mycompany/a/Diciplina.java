/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a;

/**
 *
 * @author aluno
 */
public class Diciplina {
    
    private String codigoDisciplina;
    private String nomeDisciplina;
    private String cargaHoraria;
    private String ementa;
    private String objetivoAprendizado;
    private String outraInf;
    
    public Diciplina(){
    
    }
    public String getCodigoDisciplina(){
        return codigoDisciplina;
    }
    public void setCodigoDisciplina(String _codigoDisciplina){
        codigoDisciplina = _codigoDisciplina;
    }
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }
    public void setNomeDisciplina(String _nomeDisciplina){
        nomeDisciplina = _nomeDisciplina;
    }
    public String getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(String _cargaHoraria){
        cargaHoraria = _cargaHoraria;
    }
    public String getEmenta(){
        return ementa;
    }
    public void setEmenta(String _ementa){
        ementa = _ementa;
    }
    public String getObjetivoAprendizado(){
        return objetivoAprendizado;
    }
    public void setObjetivoAprendizado(String _objetivoAprendizado){
        objetivoAprendizado = _objetivoAprendizado;
    }
    public String getOutraInf(){
        return outraInf;
    }
    public void setOutraInf(String _outraInf){
        outraInf = _outraInf;
    }
}

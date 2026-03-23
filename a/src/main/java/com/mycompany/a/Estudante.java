/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a;

import java.util.Date;
/**
 *
 * @author aluno
 */
public class Estudante {

    public class estudante {
        
        private String semanaIngresso;
        private String anoIngresso;
        private String nivel;
        private String nome;
        private String telefone;
        private String situacaoAcademica;
        private String code;
        private Date dataNascimento;
        private String cpf;
        private char genero;
        private String matricula;
        private String email;
        
        public estudante(){
            nome = "nobody";
        }
        public String getCpf(){
            return cpf;
        }
        public void setCpf(String _cpf){
            cpf = _cpf;
        }
        public String getNome(){
        return nome;
        }
        public void setNome(String _nome){
            nome = _nome;
        }
        public String getNivel(){
            return nivel;
        }
        public void setNivel(String _nivel){
            nivel = _nivel;
        }
        public String getTelefone(){
            return telefone;
        }
        public void setTelefone(String _telefone){
            telefone = _telefone;
        }
        public String getCode(){
            return code;
        }
        public void setCode(String _code){
            code = _code;
        }
        public Date getDataNascimento(){
            return dataNascimento;
        }
        public void setDataNascimento(Date _dataNascimento){
            dataNascimento = _dataNascimento;
        }
        public char getGenero(){
            return genero;
        }
        public void setGenero(char _genero){
            genero = _genero;
        }
        public String getMatricula(){
            return matricula;
        }
        public void setMatricula(String _matricula){
            matricula = _matricula;
        }
        public String getEmail(){
            return email;
        }
        public void setEmail(String _email){
            email = _email;
        }
        public String getSituacaoAcademica(){
            return situacaoAcademica;
        }
        public void setSituacaoAcademica(String _situacaoAcademica){
            situacaoAcademica = _situacaoAcademica;
        }
        public String getAnoIngresso(){
            return anoIngresso;
        }
        public void setAnoIngresso(String _anoIngresso){
            anoIngresso = _anoIngresso;
        }
        public String getSemanaIngresso(){
            return semanaIngresso;
        }
        public void setSemanaIngresso(String _semanaIngresso){
            semanaIngresso = _semanaIngresso;
        }
    }
}

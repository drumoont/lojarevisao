/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loja;

import java.io.File;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Pessoa {

    /**
     * @return the none
     */
    public String getNone() {
        return none;
    }

    /**
     * @param none the none to set
     */
    public void setNone(String none) {
        this.none = none;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the datanascimento
     */
    public Date getDatanascimento() {
        return datanascimento;
    }

    /**
     * @param datanascimento the datanascimento to set
     */
    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    /**
     * @return the fotos
     */
    public File getFotos() {
        return fotos;
    }

    /**
     * @param fotos the fotos to set
     */
    public void setFotos(File fotos) {
        this.fotos = fotos;
    }

    /**
     * @return the endereco
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the celular
     */
    public Telefone getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(Telefone celular) {
        this.celular = celular;
    }

    /**
     * @return the fixo
     */
    public Telefone getFixo() {
        return fixo;
    }

    /**
     * @param fixo the fixo to set
     */
    public void setFixo(Telefone fixo) {
        this.fixo = fixo;
    }
    /**
     * CONSTRUTOR PADÃO PARA OBJETOS DA CLASSE PESSOA
     */
    public Pessoa() {
    }
   private String none;
   private int cpf;
   private int rg;
   private String email;
   private Date  datanascimento;
   private File foto;
   private Endereco endereco;
   private Telefone celular;
   private Telefone fixo; 
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentcar.BEANS;

/**
 *
 * @author LEONE
 */
public class Carro {
    
    private int id;
    private String modelo;
    private String marca;
    private String ano;
    private String disponivel;
    private String ar;
    private int porta;
    private String direcao;
    private double valor;
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getAno(){
        return ano;
    }
    
    public void setAno(String ano){
        this.ano = ano;
    }
    
    public String getDisponivel(){
        return disponivel;
    }
    
    public void setDisponivel(String disponivel){
        this.disponivel = disponivel;
    }
    
    public String getAr(){
        return ar;
    }
    
    public void setAr(String ar){
        this.ar = ar;
    }
    
    public int getPorta(){
        return porta;
    }
    
    public void setPorta(int porta){
        this.porta = porta;
    }
    
    public String getDirecao(){
        return direcao;
    }
    
    public void setDirecao(String direcao){
        this.direcao = direcao;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
 
    public Carro(int id, String modelo, String marca, String ano, String disponivel, String ar, int porta, String direcao, double valor) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.disponivel = disponivel;
        this.ar = ar;
        this.porta = porta;
        this.direcao = direcao;
        this.valor = valor;
    }
}

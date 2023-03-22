/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receitafederal;

/**
 *
 * @author migue
 */
public class Contribuinte {
    private String nome;
    private String cpf;
    private String endereco;
    private double salario;
    private double irpf;
    
    public Contribuinte( String n, String c, String e, double s ){
        
        nome = n;
        cpf = c;
        endereco = e;
        salario = s;
        irpf = 0;
    }

    public String getNome (){
       return nome;
    }
    
    public void setNome(String nome){
     this.nome = nome;
    }
    
    public String getCpf (){
     return cpf;
     
    }
    
    public void setCpf (String cpf){
     this.cpf= cpf; 
    }
    
    public String getEndereco(){
     return endereco;
    }
    
    public void setEndereco(String endereco){
    
     this.endereco = endereco;
    }
    
    public double getSalario(){
     return salario;
    }
    
    public double getIrpf(){
     return irpf;
    }
    
    
    
    public void calcularIrpf(){
      if( salario < 800 ){
          
          irpf = 0;
        }
      else{}
      if(salario > 1500 ){
          irpf= salario *0.15;
        }
      else{
          irpf = salario *0.1;
        }
    }
    
    public double calcularSalarioliq(){
       return salario - irpf;
    }
}

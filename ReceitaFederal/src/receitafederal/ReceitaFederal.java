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
public class ReceitaFederal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuinte c1 = new Contribuinte("Miguel","9090", "rua A", 800 );
        c1.calcularIrpf();
        
        System.out.println("Nome.....: "+ c1.getNome());
        System.out.println("Cpf.......:"+ c1.getCpf());
        System.out.println("Endereço..:"+ c1.getEndereco());
        System.out.println("Salario...:"+ c1.getSalario());
        System.out.println("Irpf......:"+ c1.getIrpf());
        System.out.println("Salario liquido :"+c1.calcularSalarioliq());
        
     }
    
}

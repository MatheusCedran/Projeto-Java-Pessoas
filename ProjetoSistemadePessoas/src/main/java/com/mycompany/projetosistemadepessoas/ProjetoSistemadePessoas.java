package com.mycompany.projetosistemadepessoas;
public class ProjetoSistemadePessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Estudante p2 = new Estudante();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Gustavo");
        p2.setNome("Flavia");
        p3.setNome("Ricardo");
        p4.setNome("Giovana");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(34);
        p2.setIdade(23);
        p3.setIdade(45);
        p4.setIdade(28);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}

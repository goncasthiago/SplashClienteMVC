package br.com.goncasthiago.semana02aula05clientemvc.controller;


import br.com.goncasthiago.semana02aula05clientemvc.model.Cliente;

/**
 * Created by gonca on 28/08/2016.
 */

public class ClienteController {

    private Cliente cliente;

    public ClienteController() {

        this.cliente = new Cliente();

    }

    public void salvarCliente(Cliente objCliente) {


        this.cliente = objCliente;
    }

    public void limparCliente() {


        this.cliente.setProfissao("");
        this.cliente.setTelefone("");
        this.cliente.setEmpresa("");
        this.cliente.setTelefone("");
        this.cliente.setEmail("");
        this.cliente.setCidade("");
        this.cliente.setNome("");
        this.cliente.setUf("");


    }

    @Override
    public String toString() {
        //Apresentando os dados digitados

        String dadosClientes = "";

        //Método para atribuir os dados digitados ao objeto cliente.


        dadosClientes += "Nome: " + this.cliente.getNome() + "\n";
        dadosClientes += "Cidade: " + this.cliente.getCidade() + "\n";
        dadosClientes += "UF: " + this.cliente.getUf() + "\n";
        dadosClientes += "Empresa: " + this.cliente.getEmpresa() + "\n";
        dadosClientes += "E-mail: " + this.cliente.getEmail() + "\n";
        dadosClientes += "Profissão: " + this.cliente.getProfissao() + "\n";
        dadosClientes += "Telefone: " + this.cliente.getTelefone();

        return dadosClientes;
    }
}

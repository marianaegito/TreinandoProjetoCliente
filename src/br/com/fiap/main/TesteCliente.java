package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteCliente {

    // Métodos Statcs
    // String
    static String text(String j){

        // Para showInputDialog - si
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(( JOptionPane.showInputDialog(j)));
    }

    static double real(String j){
        while (true) {
            try {
                String valor = JOptionPane.showInputDialog(j);
                valor = valor.replace(",", ".");
                return Double.parseDouble(valor);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido!");
            }
        }
    }

    // psvm
    public static void main(String[] args) {
        // Instanciar objetos
        Cliente objCliente = new Cliente();
        Endereco objEndereco = new Endereco();
        Produto objProduto = new Produto();

        // Entradas
        objCliente.setNome(text("Cadastro do Cliente\n nome"));
        objCliente.setCpf(text("CPF"));
        objCliente.setIdade(inteiro("Altura"));
        objCliente.setAltura(real("Altura"));

        objEndereco.setBairro(text("Digite o seu bairro: "));
        objEndereco.setCep(text("Digite o seu CEP: "));
        objEndereco.setCidade(text("Digite a sua Cidade: "));
        objEndereco.setComplemento(text("Digite o complemento do seu endereço: "));
        objEndereco.setLogradouro(text("Digite o Logradouro: "));
        objEndereco.setEstado(text("Digite o seu Estado: "));
        objEndereco.setNumero(inteiro("Digite o número da sua casa: "));

        objProduto.setCodigo(inteiro("Digite o código do produto: "));
        objProduto.setMarca(text("Digite a Marca do produto: "));
        objProduto.setTipo(text("Digite o tipo do produto: "));
        objProduto.setPreco(real("Digite o preço do produto: "));

        System.out.println(
                objCliente + "\n\n" + objProduto
        );

    }
}

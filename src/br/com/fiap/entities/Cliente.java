package br.com.fiap.entities;

public class Cliente {
    // Visibilidade, tipo de dados e atributos

    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    // Botão direito - Generete... Getter and Setter
    // Setters e getters
    // Aperta Ctrl e seleciona todos:

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Botão direito - Generete... toString()
    // toString

    @Override
    public String toString() {
        return "Cliente{" +
                "\n\nnome='" + nome + '\'' +
                ",\n\ncpf='" + cpf + '\'' +
                ",\n\nidade=" + idade +
                ",\n\naltura=" + altura +
                '}';
    }
}

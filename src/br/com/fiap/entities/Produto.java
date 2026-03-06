package br.com.fiap.entities;

public class Produto {

    // Visibilidade, tipo de dados e atributos
    private int codigo;
    private String tipo;
    private String marca;
    private double preco;

    // Botão direito - Generete... Getter and Setter
    // Setters e getters
    // Aperta Ctrl e seleciona todos:

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Botão direito - Generete... toString()
    // toString

    @Override
    public String toString() {
        return "Produto{" +
                "\n\ncodigo=" + codigo +
                ",\n\ntipo='" + tipo + '\'' +
                ",\n\nmarca='" + marca + '\'' +
                ",\n\npreco=" + preco +
                '}';
    }
}

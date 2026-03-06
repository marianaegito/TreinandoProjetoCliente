package br.com.fiap.entities;

public class Endereco {

    // Visibilidade, tipo de dados e atributos

    private String logradouro;
    private int numero;
    private String complemento;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;

    // Botão direito - Generete... Getter and Setter
    // Setters e getters
    // Aperta Ctrl e seleciona todos:

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Botão direito - Generete... toString()
    // toString

    @Override
    public String toString() {
        return "Endereco{" +
                "\n\nlogradouro='" + logradouro + '\'' +
                ",\n\nnumero=" + numero +
                ",\n\ncomplemento='" + complemento + '\'' +
                ",\n\ncep='" + cep + '\'' +
                ",\n\nbairro='" + bairro + '\'' +
                ",\n\ncidade='" + cidade + '\'' +
                ",\n\nestado='" + estado + '\'' +
                '}';
    }
}

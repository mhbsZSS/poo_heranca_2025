package app;

import java.time.LocalDate;

public class PessoaJuridica {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, 
     String endereco, 
     LocalDate dataCriacao, 
     String nomeFantasia, 
     String cnpj) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public  String exibirInformacoes() {
        return " --- Informações de Pessoa Juridica --- \n" +
        "Nome: " + this.getNome() + "\n" +
        "Endereço: " + this.getEndereco() + "\n" +
        "Nome Fantasia: " + this.getNomeFantasia() + "\n" +
        "CNPJ: " + this.getCnpj() + "\n" +
        "------------------------------------------------";
    }
}
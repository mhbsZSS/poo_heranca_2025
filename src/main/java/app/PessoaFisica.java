package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Pessoa {
    private LocalDate dataNascimento;
    private String cpf;

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String nome, 
    String endereco, 
    LocalDate dataCriacao, 
    LocalDate dataNascimento, 
    String cpf) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setDataCriacao(LocalDate.now());
        this.setDataNascimento(dataNascimento);
        this.setCpf(cpf);
    }

     public  String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        return " --- Informações de Pessoa Física --- \n" +
        "Nome: " + this.getNome() + "\n" +
        "Data de Nascimento: " + this.getDataNascimento().toString() + "\n" + 
        "Endereço: " + this.getEndereco() + "\n" +
        "CPF: " + this.getCpf() + "\n" +
        "------------------------------------------------";
    }
}
package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Tarefa[] tarefas = new Tarefa[5];
        // Compromisso[] compromissos = new Compromisso[5];

        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "Novo Teste", false);

        // compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        // System.out.println(tarefas[0].getDescricao());
        // System.out.println(compromissos[2].getDataFinal());

        PessoaFisica pf = new PessoaFisica(
            "Marco",
            "Rua Sem nome, 0",
            LocalDate.of(1980, Month.MARCH, 29),
            LocalDate.of(1980, Month.MARCH, 29),
            "12343234555");

        PessoaJuridica pj = new PessoaJuridica(
            "FATEC",
            "Av. Shunji Nishimura",
            LocalDate.of(1980, Month.MARCH, 29),
            "FATEC Pompéia",
            "12312314000123");
        System.out.println(pf.exibirInformacoes());
        System.out.println(pj.exibirInformacoes());
    }
}
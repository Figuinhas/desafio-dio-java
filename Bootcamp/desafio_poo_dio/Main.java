package desafio_poo_dio;

import java.time.LocalDate;

import desafio_poo_dio.dominio.Curso;
import desafio_poo_dio.dominio.Mentoria;
import desafio_poo_dio.dominio.Conteudo;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descriçao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

    }
}

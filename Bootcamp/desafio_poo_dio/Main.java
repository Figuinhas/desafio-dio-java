package desafio_poo_dio;

import java.time.LocalDate;

import desafio_poo_dio.dominio.Curso;
import desafio_poo_dio.dominio.Dev;
import desafio_poo_dio.dominio.Mentoria;
import desafio_poo_dio.dominio.Bootcamp;

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

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        
        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Guilherme " + devGuilherme.getConteudosIncritos());
        devGuilherme.progredir();
        System.out.println("Conteudos Concluidos Guilherme " + devGuilherme.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Guilherme " + devGuilherme.getConteudosIncritos());
        System.out.println("XP: " + devGuilherme.calcularTotalXp());

        System.out.println("//////////////////////");

        Dev devFigas = new Dev();
        devFigas.setNome("Figas");
        devFigas.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Figas" + devFigas.getConteudosIncritos());
        devFigas.progredir();
        devFigas.progredir();
        devFigas.progredir();
        System.out.println("Conteudos Concluidos Figas " + devFigas.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Figas" + devFigas.getConteudosIncritos());
        System.out.println("XP: " + devFigas.calcularTotalXp());

        

    }
}

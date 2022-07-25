import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java POO completo");
        curso1.setDescricao("Programação orientada a objetos utilizando Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript do básico ao avançado");
        curso2.setDescricao("Aprenda Javascript moderno para front-end");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Bootcamp Usando Orientação a Objetos em Java");
        mentoria.setDescricao("Cursos, desafio de código e desafios de projeto nas tecnologias Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Indicado para quem quer iniciar a carreira como back-end developerr");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnny = new Dev();
        devAnny.setNome("Anny");
        devAnny.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Anny:" + devAnny.getConteudosInscritos());
        devAnny.progredir();
        devAnny.progredir();
        devAnny.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Anny:" + devAnny.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Anny:" + devAnny.getConteudosConcluidos());
        System.out.println("XP:" + devAnny.calcularTotalXp());

        System.out.println("-------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Gustavo:" + devGustavo.getConteudosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Gustavo:" + devGustavo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Gustavo:" + devGustavo.getConteudosConcluidos());
        System.out.println("XP:" + devGustavo.calcularTotalXp());

    }

}

import dio.gft.Bootcamp;
import dio.gft.Curso;
import dio.gft.Dev;
import dio.gft.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java Basic");
        curso1.setDescricao("Descrição curso Java Basic");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java API");
        curso2.setDescricao("Descrição curso Java API");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Lambda Expression com Cami-La");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.now().plusDays(5));



        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("DIO GFT");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudo().add(curso1);
        bootcamp.getConteudo().add(curso2);
        bootcamp.getConteudo().add(mentoria);

        Dev victor = new Dev();
        victor.setNome("Victor");
        victor.inscreverBootcamp(bootcamp);
        System.out.println("Victor possui os conteúdos " + victor.getConteudosInscritos() + " para fazer");
        System.out.println("Victor possui os conteúdos " + victor.getConteudosConcluidos() + " concluidos");

        Dev sofia = new Dev();
        sofia.setNome("Sofia");
        sofia.inscreverBootcamp(bootcamp);
        System.out.println("Sofia possui os conteúdos " + sofia.getConteudosInscritos() + " para fazer");
        System.out.println("Sofia possui os conteúdos " + sofia.getConteudosConcluidos() + " concluidos");

        victor.Progredir();
        System.out.println("Victor possui os conteúdos " + victor.getConteudosInscritos() + " para fazer");
        System.out.println("Victor possui os conteúdos " + victor.getConteudosConcluidos() + " concluidos");



    }
}

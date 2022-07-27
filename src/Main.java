import br.com.DIO.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso JAVA");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JAVASCRIPT");
        curso2.setDescricao("Descrição curso JAVASCRIPT");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição BootCamp JAVA developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Eduardo" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Eduardo" + devEduardo.getConteudosInscritos());
        System.out.println("Contéudos Concluidos Eduardo" + devEduardo.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXP());

        System.out.println("-------------------------");

        Dev devSasaki = new Dev();
        devSasaki.setNome("Sasaki");
        devSasaki.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Sasaki" + devSasaki.getConteudosInscritos());
        devSasaki.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Sasaki" + devSasaki.getConteudosInscritos());
        System.out.println("Contéudos Concluidos Sasaki" + devSasaki.getConteudosConcluidos());
        System.out.println("XP:" + devEduardo.calcularTotalXP());
    }
}
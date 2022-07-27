import br.com.DIO.desafio.dominio.Curso;
import br.com.DIO.desafio.dominio.Mentoria;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Descrição Mentoria JAVA");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso1");
        curso1.setCargaHoraria(4);

        System.out.println(curso1);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso1");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria");
        mentoria.setData(LocalDate.from(LocalDate.now()));

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Santander");
        bootcamp.setDescricao("Estando Java com Santander e a Dio");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("------------");
        Dev dev = new Dev();
        dev.setNome("Tamyris");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev.getConteudoInscritos());
        dev.progredir();
        dev.progredir();
        System.out.println("Conteudos concluidos" + dev.getConteudoConcluidos());
        System.out.println("Total XP " +  dev.calcularTotalXp());

        System.out.println("------------");

        Dev dev2 = new Dev();
        dev2.setNome("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + dev2.getConteudoInscritos());
        dev2.progredir();
        System.out.println("Conteudos Concluidos" + dev2.getConteudoConcluidos());
        System.out.println("Total XP " +  dev2.calcularTotalXp());
    }
}
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o Curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Descri��o Curso JS");
		curso2.setCargaHoraria(4);	
		
		Mentoria mentoria  = new Mentoria();
		mentoria.setTitulo("Mentoria do Java");
		mentoria.setDescricao("Descri��o Mentoria Data");
		mentoria.setData(LocalDate.now());
			
		
/*		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Fabio Rezende");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Dev1: " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Dev1: " + dev1.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Dev1: " + dev1.getConteudosConcluidos());
		System.out.println("XP: " + dev1.calcularTotalXp());
		
		System.out.println("-------------------------------------");
		
		Dev dev2 = new Dev();
		dev2.setNome("Wanderson Alves");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Dev2: " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Dev2: " + dev2.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Dev1: " + dev2.getConteudosConcluidos());
		System.out.println("XP: " + dev2.calcularTotalXp());		
		
				

	}
}

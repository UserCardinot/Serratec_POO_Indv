package br.com.projeto_indv.io;

import br.com.projeto_indv.individuos.Cursos;
import br.com.projeto_indv.individuos.Faculdade;
import br.com.projeto_indv.individuos.Professor;
import br.com.projeto_indv.materias.Experimental;
import br.com.projeto_indv.materias.Pratica;
import br.com.projeto_indv.materias.Teorica;
import br.com.projeto_indv.utils.Util;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;

public class Relatorio {
	public static void relatorioMaterias(char op) {

		String nome = "relatorio_materias";
		Scanner sc = new Scanner(System.in);

		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(LeituraEscrita.PATH_BASICO + nome + LeituraEscrita.EXTENSAO, true));

			if(op == 't'){

				Util.setupLogger().log(Level.INFO, "\tMenu\n[E]Experimental\t[T]Teorica\t[P]Pratica\n");
				char op2 = sc.next().charAt(0);
				
				if (op2 == 'E') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for (Map.Entry<Integer, Experimental> experi : Experimental.getMapaExperimental().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + experi.getValue().getNomeCurso() + "\nTurno do curso: " + experi.getValue().getTurno() + "\nMateria: " + experi.getValue().getNomeMateria() + "\nCarga Horaria: " + experi.getValue().getCargaHoraria() + "\nProfessor: " + experi.getValue().getFkIdProfessor() + "\nSala de Aula: " + experi.getValue().getSalaDeAula() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");

				} else if (op2 == 'T') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Teorica> teorica : Teorica.getMapaTeorica().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + teorica.getValue().getNomeCurso() + "\nTurno do curso: " + teorica.getValue().getTurno() + "\nMateria: " + teorica.getValue().getNomeMateria() + "\nCarga Horaria: " + teorica.getValue().getCargaHoraria() + "\nProfessor: " + teorica.getValue().getFkIdProfessor() + "\nLivro: " + teorica.getValue().getLivro() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");
				}

				else if (op2 == 'P') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Pratica> pratica : Pratica.getMapaPratica().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + pratica.getValue().getNomeCurso() + "\nTurno do curso: " + pratica.getValue().getTurno() + "\nMateria: " + pratica.getValue().getNomeMateria() + "\nCarga Horaria: " + pratica.getValue().getCargaHoraria() + "\nProfessor: " + pratica.getValue().getFkIdProfessor() + "\nMaterial Extra: " + pratica.getValue().getMaterialExtra() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");
				}

			} else if (op == 'i') {

				Util.setupLogger().log(Level.INFO, "\tMenu\n[E]Experimental\t[T]Teorica\t[P]Pratica\n");
				char op2 = sc.next().charAt(0);

				if (op2 == 'E') {	
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					buffWrite.append(data.format(formato));
	
					for (Map.Entry<Integer, Experimental> experi : Experimental.getMapaExperimental().entrySet()) {
						buffWrite.append("\nNome do Curso: " + experi.getValue().getNomeCurso() + "\nTurno do curso: " + experi.getValue().getTurno() + "\nMateria: " + experi.getValue().getNomeMateria() + "\nCarga Horaria: " + experi.getValue().getCargaHoraria() + "\nProfessor: " + experi.getValue().getFkIdProfessor() + "\nSala de Aula: " + experi.getValue().getSalaDeAula() + "\n\n");
					}
	
					buffWrite.append("\n__________FIM__________\n\n");
					buffWrite.close();
					System.out.println("Relatorio gerado com sucesso!");
	
				} else if (op2 == 'T') {
					buffWrite.append("__________INICIO__________\n\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Teorica> teorica : Teorica.getMapaTeorica().entrySet()) {
						buffWrite.append("\nNome do Curso: " + teorica.getValue().getNomeCurso() + "\nTurno do curso: " + teorica.getValue().getTurno() + "\nMateria: " + teorica.getValue().getNomeMateria() + "\nCarga Horaria: " + teorica.getValue().getCargaHoraria() + "\nProfessor: " + teorica.getValue().getFkIdProfessor() + "\nLivro: " + teorica.getValue().getLivro() + "\n\n");
					}
					buffWrite.append("\n__________FIM__________\n\n");
					buffWrite.close();
					System.out.println("Relatorio gerado com sucesso!");
					
				}
				else if (op2 == 'P') {
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Pratica> pratica : Pratica.getMapaPratica().entrySet()) {
						buffWrite.append("\nNome do Curso: " + pratica.getValue().getNomeCurso() + "\nTurno do curso: " + pratica.getValue().getTurno() + "\nMateria: " + pratica.getValue().getNomeMateria() + "\nCarga Horaria: " + pratica.getValue().getCargaHoraria() + "\nProfessor: " + pratica.getValue().getFkIdProfessor() + "\nMaterial Extra: " + pratica.getValue().getMaterialExtra() + "\n\n");
					}
					buffWrite.append("\n__________FIM__________\n\n");
					buffWrite.close();
					System.out.println("Relatorio gerado com sucesso!");

				}
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void relatorioFaculdade(char op) {
		String nome = "relatorio_faculdade";
		Scanner sc = new Scanner(System.in);

		try {
			BufferedWriter buffWrite = new BufferedWriter(new FileWriter(LeituraEscrita.PATH_BASICO + nome + LeituraEscrita.EXTENSAO, true));

			if(op == 't'){

				Util.setupLogger().log(Level.INFO, "\tMenu\n[F]Faculdade\t[C]Cursos\t[P]Professor\n");
				char op2 = sc.next().charAt(0);
				
				if (op2 == 'F') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for (Map.Entry<String, Faculdade> facul : Faculdade.getMapaFaculdade().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome da Faculdade: " + facul.getValue().getNome() + "\nCampus: " + facul.getValue().getCampus() + "\nCidade: " + facul.getValue().getCidade() + "\nEstado: " + facul.getValue().getEstado() + "\nPais: " + facul.getValue().getPais() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");

				} else if (op2 == 'C') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Cursos> curso : Cursos.getMapaCursos().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + curso.getValue().getNomeCurso() + "\nTurno do curso: " + curso.getValue().getTurno() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");
				}

				else if (op2 == 'P') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<String, Professor> prof : Professor.getMapaProf().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Professor: " + prof.getValue().getNome() + "\nCPF do Professor: " + prof.getValue().getCpf() + "\nEmail: " + prof.getValue().getEmail() + "\nRegistro Academico: " + prof.getValue().getRegistroAcademico() + "\nMaterias: " + prof.getValue().getMaterias() + "\n\n");
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n\n");
				}

			} else if (op == 'i') {

				Util.setupLogger().log(Level.INFO, "\tMenu\n[F]Faculdade\t[C]Cursos\t[P]Professor\n");
				char op2 = sc.next().charAt(0);

				if (op2 == 'F') {	
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					buffWrite.append(data.format(formato));
	
					for (Map.Entry<String, Faculdade> facul : Faculdade.getMapaFaculdade().entrySet()) {
						buffWrite.append("\nNome da Faculdade: " + facul.getValue().getNome() + "\nCampus: " + facul.getValue().getCampus() + "\nCidade: " + facul.getValue().getCidade() + "\nEstado: " + facul.getValue().getEstado() + "\nPais: " + facul.getValue().getPais() + "\n\n");
					}
	
					buffWrite.append("\n__________FIM__________\n\n");
					buffWrite.close();
					System.out.println("Relatorio gerado com sucesso!");
	
				} else if (op2 == 'C') {
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Cursos> curso : Cursos.getMapaCursos().entrySet()) {
						buffWrite.append("\nNome do Curso: " + curso.getValue().getNomeCurso() + "\nTurno do curso: " + curso.getValue().getTurno() + "\n\n");
					}
					buffWrite.append("\n__________FIM__________\n\n");
					buffWrite.close();
					System.out.println("Relatorio gerado com sucesso!");

				}
				else if (op2 == 'P') {
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<String, Professor> prof : Professor.getMapaProf().entrySet()) {
						buffWrite.append("\nNome do Professor: " + prof.getValue().getNome() + "\nCPF do Professor: " + prof.getValue().getCpf() + "\nEmail: " + prof.getValue().getEmail() + "\nRegistro Academico: " + prof.getValue().getRegistroAcademico() + "\nMaterias: " + prof.getValue().getMaterias() + "\n\n");
					}
					buffWrite.append("\n__________FIM__________\n\n");
					buffWrite.close();
					System.out.println("Relatorio gerado com sucesso!");

				}
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
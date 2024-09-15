package br.com.projeto_indv.io;

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
    
	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);

		BufferedWriter buffWrite = new BufferedWriter(
				new FileWriter(LeituraEscrita.PATH_BASICO + path + LeituraEscrita.EXTENSAO, true));
		String linha = "";

		Util.setupLogger().log(Level.INFO, "Escreva algo:");
		linha = sc.nextLine();
		sc.close();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}

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
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + experi.getValue().getNomeCurso() + "\nTurno do curso: " + experi.getValue().getTurno() + "\nMateria: " + experi.getValue().getNomeMateria() + "\nCarga Horaria: " + experi.getValue().getCargaHoraria() + "\nProfessor: " + experi.getValue().getFkIdProfessor() + "\nSala de Aula: " + experi.getValue().getSalaDeAula());
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n");

				} else if (op2 == 'T') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Teorica> teorica : Teorica.getMapaTeorica().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + teorica.getValue().getNomeCurso() + "\nTurno do curso: " + teorica.getValue().getTurno() + "\nMateria: " + teorica.getValue().getNomeMateria() + "\nCarga Horaria: " + teorica.getValue().getCargaHoraria() + "\nProfessor: " + teorica.getValue().getFkIdProfessor() + "\nLivro: " + teorica.getValue().getLivro());
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n");
				}

				else if (op2 == 'P') {
					Util.setupLogger().log(Level.INFO, "__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Pratica> pratica : Pratica.getMapaPratica().entrySet()) {
						Util.setupLogger().log(Level.INFO, "\nNome do Curso: " + pratica.getValue().getNomeCurso() + "\nTurno do curso: " + pratica.getValue().getTurno() + "\nMateria: " + pratica.getValue().getNomeMateria() + "\nCarga Horaria: " + pratica.getValue().getCargaHoraria() + "\nProfessor: " + pratica.getValue().getFkIdProfessor() + "\nMaterial Extra: " + pratica.getValue().getMaterialExtra());
					}
					Util.setupLogger().log(Level.INFO, "\n__________FIM__________\n");
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
						buffWrite.append("\nNome do Curso: " + experi.getValue().getNomeCurso() + "\nTurno do curso: " + experi.getValue().getTurno() + "\nMateria: " + experi.getValue().getNomeMateria() + "\nCarga Horaria: " + experi.getValue().getCargaHoraria() + "\nProfessor: " + experi.getValue().getFkIdProfessor() + "\nSala de Aula: " + experi.getValue().getSalaDeAula());
					}
	
					buffWrite.append("\n__________FIM__________\n");
					buffWrite.close();
	
				} else if (op2 == 'T') {
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Teorica> teorica : Teorica.getMapaTeorica().entrySet()) {
						buffWrite.append("\nNome do Curso: " + teorica.getValue().getNomeCurso() + "\nTurno do curso: " + teorica.getValue().getTurno() + "\nMateria: " + teorica.getValue().getNomeMateria() + "\nCarga Horaria: " + teorica.getValue().getCargaHoraria() + "\nProfessor: " + teorica.getValue().getFkIdProfessor() + "\nLivro: " + teorica.getValue().getLivro());
					}
					buffWrite.append("\n__________FIM__________\n");
					buffWrite.close();
				}
				else if (op2 == 'P') {
					buffWrite.append("__________INICIO__________\n");
					LocalDateTime data = LocalDateTime.now();
					DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
					Util.setupLogger().log(Level.INFO, data.format(formato));
					for(Map.Entry<Integer, Pratica> pratica : Pratica.getMapaPratica().entrySet()) {
						buffWrite.append("\nNome do Curso: " + pratica.getValue().getNomeCurso() + "\nTurno do curso: " + pratica.getValue().getTurno() + "\nMateria: " + pratica.getValue().getNomeMateria() + "\nCarga Horaria: " + pratica.getValue().getCargaHoraria() + "\nProfessor: " + pratica.getValue().getFkIdProfessor() + "\nMaterial Extra: " + pratica.getValue().getMaterialExtra());
					}
					buffWrite.append("\n__________FIM__________\n");
					buffWrite.close();
				}
			}		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
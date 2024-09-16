package br.com.projeto_indv.io;

import br.com.projeto_indv.enums.TipoMaterias;
import br.com.projeto_indv.individuos.Cursos;
import br.com.projeto_indv.individuos.Faculdade;
import br.com.projeto_indv.individuos.Professor;
import br.com.projeto_indv.materias.Experimental;
import br.com.projeto_indv.materias.Materia;
import br.com.projeto_indv.materias.Pratica;
import br.com.projeto_indv.materias.Teorica;
import br.com.projeto_indv.utils.Util;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;

public class LeituraEscrita {
    static final String PATH_BASICO = "./temp/";
	static final String EXTENSAO = ".txt";

	public static void leitor(String path) {
		BufferedReader buffRead;
		try {
			buffRead = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
			String linha = "";

			while (true) { 
				linha = buffRead.readLine();

				if(linha != null) {
					String[] dados = linha.split(";");

					if (dados[0].equalsIgnoreCase("Faculdade")){
						Faculdade facul = new Faculdade(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], dados[5], dados[6]);
						Faculdade.getMapaFaculdade().put(dados[1], facul);
					}
					else if (dados[0].equalsIgnoreCase("Cursos")) {
						Cursos curso = new Cursos(Integer.parseInt(dados[1]), dados[2], dados[3]);
						Cursos.getMapaCursos().put(Integer.parseInt(dados[1]), curso);
					}
					else if (dados[0].equalsIgnoreCase("Professor")) {
						Professor prof = new Professor(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]));
						Professor.getMapaProf().put(dados[1], prof);	
					}
					else if (dados[0].equalsIgnoreCase("Materias")) {
						Materia materias = new Materia(Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]));
						Materia.getMapaMateria().put(Integer.parseInt(dados[1]), materias);
					}
					else if(dados[0].equalsIgnoreCase(TipoMaterias.EXPERIMENTAL.getTipo())) {
						Experimental experi = new Experimental(TipoMaterias.EXPERIMENTAL, Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]), dados[7]);
						Experimental.getMapaExperimental().put(Integer.parseInt(dados[1]), experi);
					}
					else if(dados[0].equalsIgnoreCase(TipoMaterias.TEORICA.getTipo())) {
						Teorica teorica = new Teorica(TipoMaterias.TEORICA, Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]), dados[7]);
						Teorica.getMapaTeorica().put(Integer.parseInt(dados[1]), teorica);
					}
					else if(dados[0].equalsIgnoreCase(TipoMaterias.PRATICA.getTipo())) {
						Pratica pratica = new Pratica(TipoMaterias.PRATICA, Integer.parseInt(dados[1]), dados[2], dados[3], dados[4], Integer.parseInt(dados[5]), Integer.parseInt(dados[6]), dados[7]);
						Pratica.getMapaPratica().put(Integer.parseInt(dados[1]), pratica);
					}
				} else {
					break;
				}
			}
			buffRead.close();
		} catch (FileNotFoundException e) {
			String result = "Arquivo não encontrado no caminho " + PATH_BASICO + path + EXTENSAO;
			Util.setupLogger().log(Level.INFO, result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

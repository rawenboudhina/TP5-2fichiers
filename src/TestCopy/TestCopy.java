package TestCopy;

import java.io.*;
import java.util.StringTokenizer;

public class TestCopy {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("C:\\fichiers\\in.txt");
		File outputFile = new File("C:\\fichiers\\out.txt");
		/*
		 * try { FileReader reader = new FileReader(inputFile); FileWriter writer = new
		 * FileWriter(outputFile); int caractere; while ((caractere = reader.read()) !=
		 * -1) { writer.write(caractere);
		 * 
		 * } System.out.println("Copie terminée avec succès."); reader.close();
		 * writer.close();//close obligatoire dans l'ecriture } catch (IOException e) {
		 * e.printStackTrace(); }
		 */
		/*
		 * try {
		 * 
		 * BufferedReader bf = new BufferedReader(new
		 * FileReader("C:\\fichiers\\in.txt"));
		 * 
		 * String chaine;
		 * 
		 * BufferedReader login = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * BufferedReader password = new BufferedReader(new
		 * InputStreamReader(System.in));
		 * 
		 * boolean authentificationReussie = false;
		 * 
		 * try {
		 * 
		 * String name = login.readLine();
		 * 
		 * String pwd = login.readLine();
		 * 
		 * login.close();
		 * 
		 * while ((chaine = bf.readLine()) != null) {
		 * 
		 * String[] parts = chaine.split(" ");
		 * 
		 * String loginFichier = parts[0];
		 * 
		 * String motDePasseFichier = parts[1];
		 * 
		 * if (name.equals(loginFichier) && pwd.equals(motDePasseFichier)) {
		 * 
		 * authentificationReussie = true;
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * } } catch (IOException e) { e.printStackTrace();
		 * 
		 * }
		 * 
		 * if (authentificationReussie) {
		 * 
		 * System.out.println("Authentification réussie");
		 * 
		 * } else {
		 * 
		 * System.out.println("Erreur d'Authentification");
		 * 
		 * }
		 * 
		 * } catch (FileNotFoundException e) {
		 * 
		 * e.printStackTrace();
		 * 
		 * }
		 * 
		 * }
		 */
	/*	try {

			BufferedReader bf = new BufferedReader(new FileReader("C:\\fichiers\\in.txt"));

			String caractere;

			int lignes = 0;

			int nbCarc = 0;

			int nbMots = 0;

			try {

				while ((caractere = bf.readLine()) != null) {

					lignes++;

					nbCarc += caractere.length();

					StringTokenizer tokenizer = new StringTokenizer(caractere);

					nbMots += tokenizer.countTokens();

				}

				bf.close();

				System.out.println("Nombre de lignes " + lignes);

				System.out.println("Nombre de mots " + nbMots);

				System.out.println("Nombre de carac" + nbCarc);

			} catch (IOException e) {
				e.printStackTrace();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}

	}*/
		String CheminSource = "C:\\fichiers\\in.txt";
		String cheminDestination ="C:\\fichiers\\Users_cryptes.txt";
		cryptage( CheminSource, cheminDestination) ;

}
	public static void  cryptage(String CheminSource, String cheminDestination) {	
		try

		{
			FileReader fr = new FileReader(CheminSource);
			FileWriter fw = new FileWriter(cheminDestination);
			int caractere;

			while ((caractere = fr.read()) != -1) {
				caractere++; 
				fw.write(caractere);
			}

			fr.close();
			fw.close();
			System.out.println("Cryptage réussiie ");
		}catch(IOException e)
		{
			System.out.println("Erreur dans cryptage : " + e.getMessage());
		}
	}
}

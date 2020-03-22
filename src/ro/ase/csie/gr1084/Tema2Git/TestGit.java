package ro.ase.csie.gr1084.Tema2Git;

import java.util.ArrayList;
import java.util.List;

public class TestGit {

	public static void main(String[] args) {

		String testMessage = "Hello Git !" + " Denumirea proiectului de licență este: "
				+ "Aplicatie software pentru rezolvarea problemelor de business";
		System.out.print(testMessage);
		
		Stoc s1 = new Stoc(1, 100, 9);
		Stoc s2 = new Stoc(2, 101, 4);

		float sumaTotalaStoc = 0;
		List<Stoc> listaStocuri=new ArrayList<>();
		listaStocuri.add(s1);
		listaStocuri.add(s2);
		
		for(Stoc stoc : listaStocuri) {
		sumaTotalaStoc = stoc.calculeazaTotalCantitateStocabila(sumaTotalaStoc);
		}
		
		System.out.println("\nCantitatea totala din stoc este: ");
		System.out.print(sumaTotalaStoc);
		
	}
}

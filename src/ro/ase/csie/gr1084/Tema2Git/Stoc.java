package ro.ase.csie.gr1084.Tema2Git;

public class Stoc implements CantitateStocabila {
	int nrIntrareInStoc;
	int codProdus;
	float cantitate;

	public Stoc(int nrIntrareInStoc, int codProdus, float cantitate) {
		super();
		this.nrIntrareInStoc = nrIntrareInStoc;
		this.codProdus = codProdus;
		this.cantitate = cantitate;
	}

	@Override
	public float calculeazaTotalCantitateStocabila(float suma) {
		float sumaTotala = 0;
		sumaTotala = suma + this.cantitate;
		return sumaTotala;
	}
}

package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		nesteledig = 20;
	}

	public Blogg(int lengde) {
		nesteledig = lengde;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean finnes(Innlegg innlegg) {
		throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		throw new UnsupportedOperationException(TODO.method());

	}
	
	public boolean leggTil(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
	}
	
	// Lager verdier selv for å erstatte de jeg ikke får til i oppgaven
	// Den klarer heller ikke å hente variablene fra innlegg når tabell ikke kaller på dem
	
	public String toString() {
		return "Unfinished"; // antall rader + "\n" + "TEKST" + "\n" + id rad 1 + "\n" + bruker rad 1 + "\n" + dato rad 1 + "\n" + likes rad 1 + "\n" + tekst rad 1 + "\n" + "BILDE" + "\n" + id rad 2 + "\n" + bruker rad 2 + "\n" + dato rad 2 + "\n" + likes rad 2 + "\n" + tekst rad 2 + "\n" + url rad 2 + "\n";
	}
}
package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {

	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;

	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	public String getBruker() {
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;

	}

	public String getDato() {
		return dato;

	}

	public void setDato(String dato) {
		this.dato = dato;

	}

	public int getId() {
		return id;

	}

	public void setId(int id) {
		this.id = id;

	}

	public int getLikes() {
		return likes;

	}

	public void doLike() {
		likes = likes + 1;
	}

	// Klarer ikke å finne ut hva jeg skal sammenligne mot innlegg når Innlegg ikke funker
	// Dette går igjen i senere oppgaver
	// Må spør på datalab

	public boolean erLik(Innlegg innlegg) {
		return Innlegg == innlegg;
	}

	@Override
	public String toString() {

		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";

	}
}

package buecher;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Brune_Buch")
public class Buch implements Serializable {
	@Id @GeneratedValue
	private long buchId;
	private String titel;
	@Column(length=30)
	private String autor;
	@Column(length=15)
	private String isbn;
	private String verlag;

	public Buch(String titel, String autor, String isbn, String verlag) {
		super();
		this.titel = titel;
		this.autor = autor;
		this.isbn = isbn;
		this.verlag = verlag;
	}

	public Buch() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getBuchId() {
		return buchId;
	}

	public void setBuchId(long buchId) {
		this.buchId = buchId;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getVerlag() {
		return verlag;
	}

	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

}

package rs;

public class Student {
	private String ime, prezime;
	private float prosek;
	
	public Student(String ime, String prezime, float prosek) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.prosek = prosek;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public float getProsek() {
		return prosek;
	}
	public void setProsek(float prosek) {
		this.prosek = prosek;
	}	
}


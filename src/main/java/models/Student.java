package models;

public class Student {
	private String nom;
	private String prenom;
	private int age;
	private double note;
	private String formation;
	
	public Student (String nom, String prenom, int age, double note, String formation){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.note = note;
		this.formation = formation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public String getFormation() {
		return formation;
	}

	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	
}

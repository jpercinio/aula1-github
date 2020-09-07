package entities;

public class Aluno {
	public String nome;
	public double notaTrim1, notaTrim2, notaTrim3;
	
	public double finalGrade() {
		return notaTrim1 + notaTrim2 + notaTrim3;
	}
}

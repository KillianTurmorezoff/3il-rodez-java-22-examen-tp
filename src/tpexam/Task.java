package tpexam;

public class Task {
	private int id;
	private String titre;
	private String description;
	private int DateEcheance;
	private int priorite;
	
	public Task(int id, String titre, String description, int dateEcheance, int priorite) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		DateEcheance = dateEcheance;
		this.priorite = priorite;
	}


}

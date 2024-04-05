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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDateEcheance() {
		return DateEcheance;
	}

	public void setDateEcheance(int dateEcheance) {
		DateEcheance = dateEcheance;
	}

	public int getPriorite() {
		return priorite;
	}

	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}


}

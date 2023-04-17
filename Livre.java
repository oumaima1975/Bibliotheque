package projet_long;
public class Livre {
	
    private String titre;
    private String auteur;
    private boolean estEmprunte;
    private boolean estReserve;
    public Livre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.estEmprunte = false;
        this.estReserve=false;
    }

    public String getTitre() {
        return this.titre;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public boolean estEmprunte() {
        return this.estEmprunte;
    }
    
    public boolean estReserve() {
        return this.estReserve;
    }

    public void setEstEmprunte(boolean estEmprunte) {
        this.estEmprunte = estEmprunte;
    }
    
    public void setEstReserve(boolean estReserve) {
        this.estReserve = estReserve;
    }
}
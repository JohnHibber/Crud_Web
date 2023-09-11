
package Modelo;

public class Persona {
    int id;
    String nom;
    String ape;
    String cor;

    public Persona() {
    }

    public Persona(String nom, String ape, String cor) {
        this.nom = nom;
        this.ape = ape;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}

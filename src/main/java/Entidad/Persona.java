
package Entidad;


public class Persona {
  int id;
  String nom;  
  String cargo;  
  String fechain;  

    public Persona() {
    }

    public Persona(int id, String nom, String cargo, String fechain) {
        this.id = id;
        this.nom = nom;
        this.cargo = cargo;
        this.fechain = fechain;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFechain() {
        return fechain;
    }

    public void setFechain(String fechain) {
        this.fechain = fechain;
    }
  
  
}

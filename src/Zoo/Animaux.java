package Zoo;

public class Animaux {
    public String getCri() {
        return cri;
    }

    public String getType() {
        return type;
    }

    public String getNom() {
        return nom;
    }

    private String nom;
    private String type;
    private String cri;


    public Animaux(String nom, String type, String cri) {
        this.nom = nom;
        this.type = type;
        this.cri = cri;
    }

    public void manger() {
        System.out.println(this.nom + " mange");
    }

    public void boire() {
        System.out.println(this.nom + " boit");
    }

    public void dormir() {
        System.out.println(this.nom + " dort");
    }

}

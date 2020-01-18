package model;

public class Roba {
    private int id;
    private String opis;
    private String naziv;
    private double tezina;
    public static final POLJE_NAZIV="naziv";
    public static final POLJE_OPIS="opis";
    public static final POLJE_TEZINA="tezina";

    public Roba() {
    }

    public Roba( String opis, String naziv, double tezina) {
        this.opis = opis;
        this.naziv = naziv;
        this.tezina = tezina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    public String toString() {
        return "Roba{" +
                "id=" + id +
                ", opis='" + opis + '\'' +
                ", naziv='" + naziv + '\'' +
                ", tezina=" + tezina +
                '}';
    }
}

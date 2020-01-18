package model;

import com.j256.ormlite.field.DatabaseField;

public class Roba {

    public static final String POLJE_NAZIV="naziv";
    public static final String POLJE_OPIS="opis";
    public static final String POLJE_TEZINA="tezina";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NAZIV,canBeNull = false, unique=false)
    private String naziv;
    @DatabaseField(columnName = POLJE_OPIS,canBeNull = false, unique=false)
    private String opis;
    @DatabaseField(columnName = POLJE_TEZINA,canBeNull = false)
    private double tezina;
    @DatabaseField(foreign = true, foreignAutoRefresh = true, canBeNull = false)
    private Avion avion;


    public Roba() {
    }

    public Roba( String opis, String naziv, double tezina, Avion avion) {
        this.opis = opis;
        this.naziv = naziv;
        this.tezina = tezina;
        this.avion=avion;
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

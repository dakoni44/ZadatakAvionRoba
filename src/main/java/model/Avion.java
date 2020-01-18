package model;


import com.j256.ormlite.field.DatabaseField;

public class Avion {
    private int id;
    private String oznaka;
    private int rasponKrila;
    public static final String POLJE_OZNAKA="oznaka";
    public static final String POLJE_RASPON_KRILA="raspon_krila";

    @DatabaseField(generatedId = true)
    private int id;

    @DatabaseField(columnName = POLJE_NAZIV,canBeNull = false, unique=false)
    private String naziv;
    @DatabaseField(columnName = POLJE_OPIS)
    private String opis;
    @DatabaseField(columnName = POLJE_CENA,canBeNull = false)
    private double cena;



    public Avion() {
    }

    public Avion( String oznaka, int rasponKrila) {
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "id=" + id +
                ", oznaka='" + oznaka + '\'' +
                ", rasponKrila=" + rasponKrila +
                '}';
    }
}

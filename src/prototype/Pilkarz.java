package prototype;

/**
 * Created by Karolina_2 on 2015-04-15.
 */
public abstract class Pilkarz implements Cloneable{

    private String nazwisko;
    private String nazwaKlubu;
    private String typKontraktu;
    private String pozycja;
    private String status;

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwaKlubu() {
        return nazwaKlubu;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract Pilkarz zatrudnij();

    public void setNazwaKlubu(String nazwaKlubu) {
        this.nazwaKlubu = nazwaKlubu;
    }

    public String getTypKontraktu() {
        return typKontraktu;
    }

    public void setTypKontraktu(String typKontraktu) {
        this.typKontraktu = typKontraktu;
    }

    public String getPozycja() {
        return pozycja;
    }

    public void setPozycja(String pozycja) {
        this.pozycja = pozycja;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

import java.io.Serializable;

/**
 * Created by Karolina_2 on 2015-04-10.
 */
public class Prezes implements Cloneable, Serializable{

    private String imie;
    private String nazwisko;

    Prezes(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    Prezes(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

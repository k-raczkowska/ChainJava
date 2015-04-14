package prototype;

/**
 * Created by Karolina_2 on 2015-04-15.
 */
public class Pomocnik extends Pilkarz implements Cloneable{

    Pomocnik(String nazwaKlubu, String typ, String status){
        this.setStatus(status);
        this.setNazwaKlubu(nazwaKlubu);
        this.setTypKontraktu(typ);
        this.setPozycja("Pomocnik");
    }

    @Override
    public Pomocnik zatrudnij() {
        try {
            return (Pomocnik)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

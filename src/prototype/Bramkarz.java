package prototype;

/**
 * Created by Karolina_2 on 2015-04-15.
 */
public class Bramkarz extends Pilkarz implements Cloneable{

    Bramkarz(String nazwaKlubu, String typ, String status){
        this.setStatus(status);
        this.setNazwaKlubu(nazwaKlubu);
        this.setTypKontraktu(typ);
        this.setPozycja("Bramkarz");
    }


    public Bramkarz zatrudnij(){
        try {
            return (Bramkarz)this.clone();
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

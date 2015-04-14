import java.io.Serializable;

/**
 * Created by Karolina_2 on 2015-04-10.
 */
public class Klub implements Cloneable, Serializable{

    private String nazwa;
    private int rokZalozenia;
    private Prezes prezes;

    Klub(String nazwa, int rokZalozenia, Prezes prezes){
        this.nazwa = nazwa;
        this.rokZalozenia = rokZalozenia;
        this.prezes = prezes;
    }

    public Klub(String x, Prezes prezes) {
        this.nazwa = x;
        this.prezes = prezes;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setPrezes(Prezes prezes) {
        this.prezes = prezes;
    }

    public Prezes getPrezes() {
        return prezes;
    }

    public void setRokZalozenia(int rokZalozenia) {
        this.rokZalozenia = rokZalozenia;
    }

    public int getRokZalozenia() {
        return rokZalozenia;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Klub clone2(){
        Klub klub = new Klub("", 0, null);
        klub.setNazwa(this.getNazwa());
        klub.setRokZalozenia(this.rokZalozenia);
        try {
            klub.setPrezes((Prezes)this.getPrezes().clone());
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return klub;
    }
}

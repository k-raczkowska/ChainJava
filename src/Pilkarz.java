import java.io.*;

/**
 * Created by Karolina_2 on 2015-04-10.
 */
public class Pilkarz implements Cloneable, Serializable{

    private String imie;
    private String nazwisko;
    private int wzrost;
    private Klub klub;

    public Pilkarz(Klub klub) {
        this.klub = klub;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setKlub(Klub klub) {
        this.klub = klub;
    }

    public Klub getKlub() {
        return klub;
    }

    Pilkarz(String imie, String nazwisko, int wzrost, Klub klub){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wzrost = wzrost;
        this.klub = klub;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pilkarz pilkarz = new Pilkarz("","",0,null);
        pilkarz.setImie(this.getImie());
        pilkarz.setNazwisko(this.getNazwisko());
        pilkarz.setWzrost(this.getWzrost());
        pilkarz.setKlub(this.getKlub().clone2());
        return pilkarz;
    }

    public Pilkarz deepClone(){
        Pilkarz pilkarz = null;
        try{
            //ByteArrayOutputStream baos = new ByteArrayOutputStream();
            FileOutputStream baos = new FileOutputStream("test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            //ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            FileInputStream bais = new FileInputStream("test.txt");
            ObjectInputStream ois = new ObjectInputStream(bais);
            pilkarz = (Pilkarz) ois.readObject();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return pilkarz;
    }
}

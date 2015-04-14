import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karolina_2 on 2015-04-10.
 */
public class Kolekcja {

    List<Pilkarz> lista;
    List<Klub> kluby;
    List<Prezes> prezesi;

    Kolekcja(int x){
        lista = new ArrayList<>();
        kluby = new ArrayList<>();
        prezesi = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            prezesi.add(new Prezes(i + "wski"));
        }
        for(int i = 0; i < 5; i++){
            kluby.add(new Klub(i+"", prezesi.get(i)));
        }
        for(int i = 0; i < x; i++){
            lista.add(new Pilkarz(kluby.get(i%5)));
        }
    }
    Kolekcja(){}

    public Kolekcja kopiujPilkarzy(){
        List<Pilkarz> pilkarze = new ArrayList<>();
        Pilkarz pilkarzx;
        for(Pilkarz pilkarz : lista){
            try {
                pilkarzx = (Pilkarz)pilkarz.clone();
                pilkarze.add(pilkarzx);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        Kolekcja kolekcja = new Kolekcja();
        kolekcja.lista = pilkarze;
        return kolekcja;
    }

    public Kolekcja kopiujPilkarzy2(){
        List<Pilkarz> pilkarze = new ArrayList<>();
        Pilkarz pilkarzx;
        for(Pilkarz pilkarz : lista){
            pilkarzx = pilkarz.deepClone();
            pilkarze.add(pilkarzx);
        }
        Kolekcja kolekcja = new Kolekcja();
        kolekcja.lista = pilkarze;
        return kolekcja;
    }

    public Kolekcja kopiujKluby(){
        List<Klub> klubyList = new ArrayList<>();
        Klub klubx;
        for(Klub klub : kluby){
            try {
                klubx = (Klub) klub.clone();
                klubyList.add(klubx);
            }catch(CloneNotSupportedException e){
                e.printStackTrace();
            }
        }
        Kolekcja kolekcja = new Kolekcja();
        kolekcja.kluby = klubyList;
        return kolekcja;
    }
}

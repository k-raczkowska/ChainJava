package prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Karolina_2 on 2015-04-15.
 */
public class Test {

    public static void main(String... args) {
        List<Pilkarz> pilkarze = new ArrayList<>();
        Pomocnik pomocnik = new Pomocnik("AC Milan", "Zatrudnienie", "Dostepny");
        Bramkarz bramkarz = new Bramkarz("AC Milan", "Zatrudnienie", "Dostepny");
        Pomocnik pomocnik1 = pomocnik.zatrudnij();
        pomocnik1.setNazwisko("Bonucci");
        pilkarze.add(pomocnik1);
        Pomocnik pomocnik2 = pomocnik.zatrudnij();
        pomocnik2.setNazwisko("Lavezzi");
        pilkarze.add(pomocnik2);
        Pomocnik pomocnik3 = pomocnik.zatrudnij();
        pomocnik3.setNazwisko("Falcao");
        pilkarze.add(pomocnik3);

        Bramkarz bramkarz1 = bramkarz.zatrudnij();
        bramkarz1.setNazwisko("Courtois");
        pilkarze.add(bramkarz1);
        Bramkarz bramkarz2 = bramkarz.zatrudnij();
        bramkarz2.setNazwisko("Benaglio");
        pilkarze.add(bramkarz2);


        for(Pilkarz pilkarz : pilkarze){
            System.out.println(pilkarz.getNazwisko() + " " + pilkarz.getNazwaKlubu() + " " + pilkarz.getPozycja() + " " + pilkarz.getStatus() + " " + pilkarz.getTypKontraktu());
        }
    }
}

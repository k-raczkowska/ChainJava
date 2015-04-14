/**
 * Created by Karolina_2 on 2015-04-10.
 */
public class Main{

    public static void main(String[] args){
        Prezes prezes = new Prezes("Adam", "Hoffmann");
        Klub klub = new Klub("Manchester United", 1878, prezes);
        Pilkarz pilkarz = new Pilkarz("Adnan", "Januzaj", 179, klub);
        Pilkarz pilkarz1;
        Pilkarz pilkarz2;
        Klub klub1;
        try {
            /*
                KLONOWANIE PLYTKIE
             */
            klub1 = (Klub)klub.clone();
            System.out.println(klub == klub1);//fizycznie sa to dwa rozne obiekty, ale:
            prezes.setNazwisko("Smith");
            System.out.println(klub.getPrezes().getNazwisko());
            System.out.println(klub1.getPrezes().getNazwisko());
            /*jak widac, zmiana wartosci jednego z pol typow obiektowych powoduje zmiane wartosci tego pola w obu obiektach
            spowodowane jest to tym, jak dziala metoda clone():
            przepisuje ona wartosci pol typow prostych oraz przypisania tych samych referencji w przypadku pol typow obiektowych
            */

            /*
                KLONOWANIE GLEBOKIE
             */
            pilkarz1 = (Pilkarz)pilkarz.clone();//wykorzystanie przeciazonej metody clone(), kopiujacej do nowego obiektu
                                                //wartosci pol typow prostych i skopiowane pola typow obiektowych (nowe obiekty, nie ref)
            pilkarz2 = pilkarz.deepClone();//wykorzystanie serializacji i deserializacji
            System.out.println(pilkarz.getKlub().getPrezes() == pilkarz1.getKlub().getPrezes());
            System.out.println(pilkarz.getKlub().getPrezes() == pilkarz2.getKlub().getPrezes());
            System.out.println();
            /*Kolekcja kolekcja = new Kolekcja(10);
            System.out.println("Kolekcja skladajaca sie z 10 elementow:");
            long start = System.currentTimeMillis();
            Kolekcja nowaKolekcja = kolekcja.kopiujPilkarzy();
            long stop = System.currentTimeMillis();
            System.out.print(stop - start + ", ");
            *//*for(int i = 0; i < kolekcja.lista.size(); i++){
                for(int j = 0; j < nowaKolekcja.lista.size(); j++){
                    if(i == j){
                        System.out.println(kolekcja.lista.get(i).getKlub().getPrezes() == nowaKolekcja.lista.get(j).getKlub().getPrezes());
                    }
                }
            }
            System.out.println();*//*
            long start2 = System.currentTimeMillis();
            Kolekcja nowaKolekcja2 = kolekcja.kopiujPilkarzy2();
            long stop2 = System.currentTimeMillis();
            System.out.print(stop2 - start2 + ", ");
            *//*for(int i = 0; i < kolekcja.lista.size(); i++){
                for(int j = 0; j < nowaKolekcja2.lista.size(); j++){
                    if(i == j){
                        System.out.println(kolekcja.lista.get(i).getKlub().getPrezes() == nowaKolekcja2.lista.get(j).getKlub().getPrezes());
                    }
                }
            }
            System.out.println();*//*
            long start3 = System.currentTimeMillis();
            Kolekcja nowaKolekcja3 = kolekcja.kopiujKluby();
            long stop3 = System.currentTimeMillis();
            System.out.println(stop3 - start3);
            *//*for(int i = 0; i < kolekcja.kluby.size(); i++){
                for(int j = 0; j < nowaKolekcja3.kluby.size(); j++){
                    if(i == j){
                        System.out.println(kolekcja.kluby.get(i).getPrezes() == nowaKolekcja3.kluby.get(j).getPrezes());
                    }
                }
            }*/
            System.out.println("Kolekcja skladajaca sie z 10 elementow:");
            Kolekcja kolekcja1 = new Kolekcja(10);
            long start = System.currentTimeMillis();
            Kolekcja kolekcja1DeepCopy1 = kolekcja1.kopiujPilkarzy();
            long stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - nadpisana metoda clone(): " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja1DeepCopy2 = kolekcja1.kopiujPilkarzy2();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - serializacja: " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja1ShallowCopy = kolekcja1.kopiujKluby();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie płytkie - metoda clone(): " + (stop - start) + "\n");

            System.out.println("Kolekcja skladajaca sie ze 100 elementow:");
            Kolekcja kolekcja2 = new Kolekcja(100);
            start = System.currentTimeMillis();
            Kolekcja kolekcja2DeepCopy1 = kolekcja2.kopiujPilkarzy();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - nadpisana metoda clone(): " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja2DeepCopy2 = kolekcja2.kopiujPilkarzy2();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - serializacja: " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja2ShallowCopy = kolekcja2.kopiujKluby();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie płytkie - metoda clone(): " + (stop - start) + "\n");

            System.out.println("Kolekcja skladajaca sie z 1 000 elementow:");
            Kolekcja kolekcja3 = new Kolekcja(1000);
            start = System.currentTimeMillis();
            Kolekcja kolekcja3DeepCopy1 = kolekcja3.kopiujPilkarzy();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - nadpisana metoda clone(): " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja3DeepCopy2 = kolekcja3.kopiujPilkarzy2();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - serializacja: " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja3ShallowCopy = kolekcja3.kopiujKluby();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie płytkie - metoda clone(): " + (stop - start) + "\n");

            System.out.println("Kolekcja skladajaca sie z 10 000 elementow:");
            Kolekcja kolekcja4 = new Kolekcja(10000);
            start = System.currentTimeMillis();
            Kolekcja kolekcja4DeepCopy1 = kolekcja4.kopiujPilkarzy();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - nadpisana metoda clone(): " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja4DeepCopy2 = kolekcja4.kopiujPilkarzy2();
            stop = System.currentTimeMillis();
            System.out.println("Kopiowanie głębokie - serializacja: " + (stop - start));
            start = System.currentTimeMillis();
            Kolekcja kolekcja4ShallowCopy = kolekcja4.kopiujKluby();
            stop = System.currentTimeMillis();
            System.out.print("Kopiowanie płytkie - metoda clone(): " + (stop - start));
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Karolina_2 on 2015-04-11.
 */
public class TestClass {

    private static final Kolekcja kolekcja1 = new Kolekcja(10000);

    @Test
    public void deepCopyClone(){
        Kolekcja kolekcja = kolekcja1.kopiujPilkarzy();
        for(int i = 0; i < kolekcja.lista.size(); i++) {
            for(int j = 0; j < kolekcja1.lista.size(); j++) {
                if(i == j) {
                    assertTrue("To samo"
                            + System.identityHashCode(kolekcja.lista.get(i))
                            + ":" + System.identityHashCode(kolekcja1.lista.get(j))
                            , kolekcja.lista.get(i).getKlub() != kolekcja1.lista.get(j).getKlub());
                }
            }
        }
    }

    @Test
    public void deepCopySerialization(){
        Kolekcja kolekcja = kolekcja1.kopiujPilkarzy2();
        for(int i = 0; i < kolekcja.lista.size(); i++) {
            for(int j = 0; j < kolekcja1.lista.size(); j++) {
                if(i == j) {
                    assertTrue("To samo"
                            + System.identityHashCode(kolekcja.lista.get(i))
                            + ":" + System.identityHashCode(kolekcja1.lista.get(j))
                            , kolekcja.lista.get(i).getKlub() != kolekcja1.lista.get(j).getKlub());
                }
            }
        }
    }

    @Test
    public void shallowCopyClone(){
        Kolekcja kolekcja = kolekcja1.kopiujKluby();
        for(int i = 0; i < kolekcja.kluby.size(); i++) {
            for(int j = 0; j < kolekcja1.kluby.size(); j++) {
                if(i == j) {
                    assertTrue("To samo"
                            + System.identityHashCode(kolekcja.kluby.get(i))
                            + ":" + System.identityHashCode(kolekcja1.kluby.get(j))
                            , kolekcja.kluby.get(i).getPrezes() == kolekcja1.kluby.get(j).getPrezes());
                }
            }
        }
    }
}

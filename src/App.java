import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        urun u1 = new urun("elbise", 75);
        u1.degerlendir("Çok güzel bir ürün. bayıldım", 10);
        u1.degerlendir("Kargolama çok kötü", 3);
        u1.puanHesapla();
        // u1.incele();
        urun u2 = new urun("elbise", 75);
        u2.degerlendir("kötü", 1);
        u2.degerlendir("çok kötü", 1);
        u2.puanHesapla();

        urun u3 = new urun("pantolon", 45);
        u3.degerlendir("Çok güzel bir ürün", 10);
        u3.degerlendir("çok iyi", 8);
        u3.puanHesapla();

        urun[] urunler = { u1, u2, u3 };
        Arrays.sort(urunler);

        for (urun y : urunler) {
            System.out.println(y);
        }

        System.out.println();
        System.out.println(u1.equals(u2));

    }
}

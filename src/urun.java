import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class urun implements Comparable<urun> {

    private String isim;
    private float fiyat;
    private double puan;
    private int kullanıcıSayısı;
    public List<String> metin = new ArrayList<String>();
    private double ort;

    public urun(String isim, float fiyat) {
        setFiyat(fiyat);
        setIsim(isim);
    }

    public double getOrt() {
        return this.ort;
    }

    public void setOrt(double ort) {
        this.ort = ort;
    }

    public List<String> getMetin() {
        return this.metin;
    }

    public void setMetin(List<String> metin) {
        this.metin = metin;
    }

    public int getKullanıcıSayısı() {
        return this.kullanıcıSayısı;
    }

    public void setKullanıcıSayısı(int kullanıcıSayısı) {
        this.kullanıcıSayısı = kullanıcıSayısı;
    }

    public String getIsim() {
        return this.isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public float getFiyat() {
        return this.fiyat;
    }

    public void setFiyat(float fiyat) {
        this.fiyat = fiyat;
    }

    public double getPuan() {
        return this.puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    public void degerlendir(String metin, int a) {
        setPuan(getPuan() + a);
        setKullanıcıSayısı(getKullanıcıSayısı() + 1);

        this.metin.add(metin);

    }

    public double puanHesapla() {

        setOrt(getPuan() / getKullanıcıSayısı());
        return getOrt();
    }

    public void incele() {

        System.out.println("Ürün değerlendirmeleri: ");
        System.out.println();
        for (String string : metin) {
            System.out.println(string);
            System.out.println();
        }

        System.out.println("Ürünün ortalama puanı: " + this.puanHesapla());
    }

    @Override
    public int compareTo(urun o) {
        if (this.getOrt() > o.getOrt())
            return -1;
        else if (this.getOrt() < o.getOrt())
            return 1;
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof urun))
            return false;
        urun that = (urun) obj;
        return that.isim == getIsim() && that.fiyat == getFiyat();
    }

    @Override
    public String toString() {
        return "Ürün adı : " + getIsim() + " fiyatı : " + getFiyat() + " ortalama Puanı : " + getOrt();
    }

}
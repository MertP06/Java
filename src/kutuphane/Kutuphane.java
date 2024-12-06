package kutuphane;

public class Kutuphane {
    private Kitap[] kitaplar;
    private int kitapSayisi;

    // Constructor
    public Kutuphane(int kapasite) {
        this.kitaplar = new Kitap[kapasite];
        this.kitapSayisi = 0;
    }

    // addBook method
    public void addBook(Kitap kitap) {
        if (kitapSayisi < kitaplar.length) {
            kitaplar[kitapSayisi] = kitap;
            kitapSayisi++;
            System.out.println("Kitap eklendi: " + kitap.getTitle());
        } else {
            System.out.println("Kütüphane dolu! Kitap eklenemedi.");
        }
    }

    // displayBooks method
    public void displayBooks() {
        System.out.println("Kütüphanedeki Kitaplar:");
        for (int i = 0; i < kitapSayisi; i++) {
            Kitap kitap = kitaplar[i];
            System.out.println("Başlık: " + kitap.getTitle() + ", Yazar: " + kitap.getAuthor() + ", Durum: " + kitap.getStatus());
        }
    }

    // findAvailableBooks method
    public void findAvailableBooks() {
        System.out.println("Mevcut Kitaplar:");
        for (int i = 0; i < kitapSayisi; i++) {
            Kitap kitap = kitaplar[i];
            if (kitap.getStatus() == KitapDurumu.MEVCUT) {
                System.out.println("Başlık: " + kitap.getTitle() + ", Yazar: " + kitap.getAuthor());
            }
        }
    }
}


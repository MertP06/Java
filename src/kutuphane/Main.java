package kutuphane;

public class Main {
	
	public static void main(String[] args) {
		        // Kutuphane nesnesi oluştur (kapasiteyi 5 olarak belirliyoruz)
		        Kutuphane kutuphane = new Kutuphane(5);

		        // Yeni kitaplar oluştur ve durumu belirleyerek ekle
		        Kitap kitap1 = new Kitap("Sefiller", "Victor Hugo", KitapDurumu.MEVCUT);
		        Kitap kitap2 = new Kitap("Suç ve Ceza", "Fyodor Dostoyevski", KitapDurumu.ODUNC_VERILMIS);
		        Kitap kitap3 = new Kitap("1984", "George Orwell", KitapDurumu.REZERVE);
		        Kitap kitap4 = new Kitap("Hayvan Çiftliği", "George Orwell", KitapDurumu.MEVCUT);
		        Kitap kitap5 = new Kitap("Bülbülü Öldürmek", "Harper Lee", KitapDurumu.MEVCUT);

		        // Kitapları kütüphaneye ekle
		        kutuphane.addBook(kitap1);
		        kutuphane.addBook(kitap2);
		        kutuphane.addBook(kitap3);
		        kutuphane.addBook(kitap4);
		        kutuphane.addBook(kitap5);
		        System.out.println("\n");
		        // Tüm kitapları listele
		        kutuphane.displayBooks();
		        System.out.println("\n");
		        // Mevcut olan kitapları listele
		        kutuphane.findAvailableBooks();
		    }
}

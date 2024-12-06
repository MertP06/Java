package kutuphane;

public class Kitap {
	
    private String title; // Kitabın Adı
    private String author; // Kitabın Yazarı
    private KitapDurumu status;

    // Constructor
    public Kitap(String title, String author, KitapDurumu status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for status
    public KitapDurumu getStatus() {
        return status;
    }

    public void setStatus(KitapDurumu status) {
        this.status = status;
    }
}


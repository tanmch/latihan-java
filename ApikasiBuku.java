//public class ApikasiBuku {
//    public static void main(String[] args) {
//        String judul;
//        String penulis;
//        int tahunTerbit;
//    }
//    public Buku (String judul, String penulis, int tahunTerbit) {
//        this.judul = "Dunia Paralel";
//        this.penulis = "Alex Santoso";
//        this.tahunTerbit = 2024;
//    }
//    public void displayInfo() {
//        System.out.println("Judul: " + judul)
//        System.out.println("Penulis: " + penulis)
//        System.out.println("Tahun: " + tahunTerbit)
//    }
//}


public class ApikasiBuku {
    public static void main(String[] args) {
        Buku bukuFiksi = new Buku("Dasar-dasar Java", "Dewi LEstari", 2023)

        bukuFiksi.displayInfo();
    }
}


class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
}

public String penulis() {
    return penulis;
}

public int tahunTerbit() {
    return tahunTerbit;
}

public void setJudul(String newJudul) {
    this.judul = newJudul;
}

public int getTahunTerbit() {
    return tahunTerbit;
}

public void setTahunTerbit(int newTahunTerbit) {
    this.tahunTerbit = newtahunTerbit;
}
bukuFiksi.setTahunTerbit(2025);

extends Buku {
    private String genre;
}

public String getGenre() {
    return genre;
}

public void setGenre(String newGenre) {
    this.genre = newGenre;
}
n
public void displayInfo() {


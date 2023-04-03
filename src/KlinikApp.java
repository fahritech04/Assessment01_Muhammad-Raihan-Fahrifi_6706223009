import java.util.*;

class Pasien {
  private String nomor;
  private String nama;
  private String namaDokter;
  private String jenisDokter;

  public Pasien(String nomor, String nama, String namaDokter, String jenisDokter) {
    this.nomor = nomor;
    this.nama = nama;
    this.namaDokter = namaDokter;
    this.jenisDokter = jenisDokter;
  }

  public String getNomor() {
    return nomor;
  }

  public String getNama() {
    return nama;
  }

  public String getNamaDokter() {
    return namaDokter;
  }

  public String getJenisDokter() {
    return jenisDokter;
  }
}

class Dokter {
  private Queue<Pasien> antrian = new LinkedList<>();
  private String jenisDokter;
  private String kodeDokter;

  public Dokter(String jenisDokter, String kodeDokter) {
    this.jenisDokter = jenisDokter;
    this.kodeDokter = kodeDokter;
  }

  public void ambilNomor(String nomor, String nama, String namaDokter, String jenisDokter) {
    Pasien pasien = new Pasien(nomor, nama, namaDokter, jenisDokter);
    antrian.add(pasien);
    System.out.println("Anda adalah pasien " + jenisDokter);
    System.out.println("Anda menunggu " + (antrian.size() - 1) + " orang lagi");
  }

  public void panggilanKlinik() {
    if (!antrian.isEmpty()) {
      Pasien pasien = antrian.remove();
      System.out.println("Nomor " + pasien.getNomor() + " dengan nama " + pasien.getNama() + " untuk dokter "
          + pasien.getNamaDokter() + ", pasien " + pasien.getJenisDokter() + " silahkan ke ruang periksa");
    }
  }

  public String getJenisDokter() {
    return jenisDokter;
  }

  public String getKodeDokter() {
    return kodeDokter;
  }
}

public class KlinikApp {
  public static void main(String[] args) {
    Dokter dokterUmum = new Dokter("Dokter Umum", "A");
    Dokter dokterSpesialis = new Dokter("Dokter Spesialis", "B");

    dokterUmum.ambilNomor("A001", "Rita", "dr. Budi", "Dokter Umum");
    dokterUmum.ambilNomor("A002", "Kiki", "dr. Siti", "Dokter Umum");
    dokterSpesialis.ambilNomor("B001", "Ika", "dr. Mimi", "Dokter THT");

    dokterUmum.panggilanKlinik();
    dokterSpesialis.panggilanKlinik();
    dokterSpesialis.ambilNomor("B002", "Fikri", "dr. Kiki", "Dokter Penyakit Dalam");
  }
}

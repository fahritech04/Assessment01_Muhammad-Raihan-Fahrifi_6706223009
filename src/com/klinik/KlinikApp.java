package com.klinik;

import java.io.InputStream;
import java.util.*;

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

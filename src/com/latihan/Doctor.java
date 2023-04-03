package com.latihan;

import java.util.*;

import com.klinik.Dokter;

public class Doctor {
 private Queue<Patient> antrian = new LinkedList<>();
 private String jenisDokter;
 private String kodeDokter;

 public Doctor(String jenisDokter, String kodeDokter) {
  this.jenisDokter = jenisDokter;
  this.kodeDokter = kodeDokter;
 }

 public void ambilNomor(String nomor, String nama, String namaDokter, String jenisDokter) {
  Patient pasien = new Patient(nomor, nama, namaDokter, jenisDokter);
  antrian.add(pasien);
 }

}

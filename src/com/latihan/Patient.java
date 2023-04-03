package com.latihan;

public class Patient {
 private String nomor;
 private String nama;
 private String namaDokter;
 private String jenisDokter;

 public Patient(String nomor, String nama, String namaDokter, String jenisDokter) {
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

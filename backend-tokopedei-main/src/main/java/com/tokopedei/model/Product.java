package com.tokopedei.model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nama")
    private String namaProduct;

    @Column(name = "hargajual")
    private String hargajual;

    @Column(name = "hargabeli")
    private String hargabeli;

    @Column(name = "rate")
    private String rate;

    @Column(name = "qty")
    private String qty;

    @Column(name = "thumbnailURL")
    private String thumbnailURL;

    @Column(name = "diskon")
    private String diskon;

    @Column(name = "keterangan")
    private String keterangan;

    @Column(name = "lokasi")
    private String lokasi;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "rincian")
    private String rincian;



    public Product(){

    }

    public Product(String namaProduct, String hargajual, String hargabeli, String rate, String thumbnailURL, String diskon, String keterangan, String lokasi, String jenis, String rincian){
        super();
        this.namaProduct = namaProduct;
        this.hargajual = hargajual;
        this.hargabeli = hargabeli;
        this.rate = rate;
        this.thumbnailURL = thumbnailURL;
        this.diskon = diskon;
        this.keterangan = keterangan;
        this.lokasi = lokasi;
        this.jenis = jenis;
        this.diskon = rincian;
    }
    //setter getter


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaProduct() {
        return namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public String getHargajual() {
        return hargajual;
    }

    public void setHargajual(String hargajual) {
        this.hargajual = hargajual;
    }

    public String getHargabeli() {
        return hargabeli;
    }

    public void setHargabeli(String hargabeli) {
        this.hargabeli = hargabeli;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getThumbnailURL() {
        return thumbnailURL;
    }

    public void setThumbnailURL(String thumbnailURL) {
        this.thumbnailURL = thumbnailURL;
    }

    public String getDiskon() {
        return diskon;
    }

    public void setDiskon(String diskon) {
        this.diskon = diskon;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getRincian() {
        return rincian;
    }

    public void setRincian(String rincian) {
        this.rincian = rincian;
    }
}

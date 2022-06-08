package com.example.projekt_fcz2022;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Spieler {

    @Id
    private int id;
    private int number;
    private String name;
    private String url;
    private String nationality;
    private int height;
    private Date date;
    private int tacheles;
    private String club;

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTacheles(int tacheles) {
        this.tacheles = tacheles;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getNationality() {
        return nationality;
    }

    public int getHeight() {
        return height;
    }

    public Date getDate() {
        return date;
    }

    public int getTacheles() {
        return tacheles;
    }

    public String getClub() {
        return club;
    }



}


package com.portfolio.BackEnd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity(name = "person")
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    private String last_name;
    private String position;
    private String title;
    private String location;
    private String address;
    private String phone;
    private String email;
    private String birth_date;
    private String nationality;
    private String about1;
    private String about2;
    private String url_photo;

    public Person() {
    }

    public Person(Long person_id, String name, String last_name, String position, String title, String location, String address, String phone, String email, String birth_date, String nationality, String about1, String about2, String url_photo) {
        this.id = person_id;
        this.name = name;
        this.last_name = last_name;
        this.position = position;
        this.title = title;
        this.location = location;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birth_date = birth_date;
        this.nationality = nationality;
        this.about1 = about1;
        this.about2 = about2;
        this.url_photo = url_photo;
    }
    
    
    
}

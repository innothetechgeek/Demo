package com.heroku.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String animalname;
    
    private String adoptername;
    private String personsurname;
    private String phonenumber;
    
    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
   
    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }
     public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
     public String getPersonname() {
        return adoptername;
    }

    public void setAdoptername(String adoptername) {
        this.adoptername = adoptername;
    }
    
     public String getPersonsurname() {
        return adoptername;
    }

    public void setPersonsurname(String personsurname) {
        this.personsurname = personsurname;
    }
    
    public Record copy(Record record){
            this.id = record.getId();
            this.animalname = record.getAnimalname();
            this.adoptername = record.getPersonname(); 
            this.personsurname = record.getPersonsurname();
            this.phonenumber = record.getPhonenumber();

            return this;
        }

    
}
    
    

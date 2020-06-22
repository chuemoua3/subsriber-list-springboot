package com.win.subscriber.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

// designate our class as an entity that the jpa should recognize
@Entity
public class Subscriber {
    // sets the 'id' as the primary key
    @Id
    // allows the id to be generated by the database
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName, lastName, userName;

    // designates this attribute to be stored in the database
    @Column
    // allows the date to be generated by the system
    @CreationTimestamp
    private Date signedUp;

    // create constructors
    public Subscriber(){
        // non-argument constructor needed for JPA
    }

    public Subscriber(String firstName, String lastName, String userName, Date signedUp){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.signedUp = signedUp;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUp() {
        return signedUp;
    }

    public void setSignedUp(Date signedUp) {
        this.signedUp = signedUp;
    }

    @Override
    public String toString() {
        return "Subscriber [firstName=" + firstName + ", id=" + id + ", lastName=" + lastName + ", signedUp=" + signedUp
                + ", userName=" + userName + "]";
    }

    
}
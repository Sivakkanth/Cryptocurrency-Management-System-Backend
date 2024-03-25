package com.backend.backend.Model;
import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;

    @Column(name = "country")
    private String country;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "Main_Account_Balance")
    private Double MABalance;

    @Column(name = "Coin_Account_Balance")
    private Double CABalance;

    @Column(name = "Account_Number")
    private String ANumber;

    public User() {
    }

    public User(Long id, String userName, String password, String country, String firstName, Double MABalance, Double CABalance, String ANumber) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.country = country;
        this.firstName = firstName;
        this.MABalance = MABalance;
        this.CABalance = CABalance;
        this.ANumber = ANumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getMABalance() {
        return MABalance;
    }

    public void setMABalance(Double MABalance) {
        this.MABalance = MABalance;
    }

    public Double getCABalance() {
        return CABalance;
    }

    public void setCABalance(Double CABalance) {
        this.CABalance = CABalance;
    }

    public String getANumber() {
        return ANumber;
    }

    public void setANumber(String ANumber) {
        this.ANumber = ANumber;
    }
}
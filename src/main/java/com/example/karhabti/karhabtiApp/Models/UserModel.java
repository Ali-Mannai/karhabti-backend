package com.example.karhabti.karhabtiApp.Models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int UserID ;

    public String FirstName;
    public String LastName;
    public String Email ;
    public String Password ;
    public String PhoneNumber ;
    public String Role ;
    public String DateRegistered ;
}

package com.shouq.project;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="User")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long userID;
  @Column
  private String username;
  @Column
  private int age;
  @Column
  private String Email;
  @Column
  private String Password;
  @Column
  private String ProfilePic;
  @Column
  private String Bio;
  @Column
  private Gender gender;
  @Column
  private LocalDate DOB;
  @Column
  private String Location;

  public User(Long userID, String username, int age, String email, String password, String profilePic, String bio,
    Gender gender, LocalDate dOB, String location) {
    this.userID = userID;
    this.username = username;
    this.age = age;
    Email = email;
    Password = password;
    ProfilePic = profilePic;
    Bio = bio;
    this.gender = gender;
    DOB = dOB;
    Location = location;
  }

  public User() {
  }
}
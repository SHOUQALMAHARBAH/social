package com.shouq.project;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
   // One-to-Many with Comment
   @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
   private Set<Comment> comments = new HashSet<>();
  public User() {
  }

     // One-to-Many with Share
     @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
     private Set<Share> shares = new HashSet<>();

  // One-to-Many with Like
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<Likes> likes = new HashSet<>();

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Post> posts = new HashSet<>();

//    // One-to-One with Login  errrooooooooooorrrrrrrrrrr
//  @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//  private Login login;

//    @ManyToMany(mappedBy = "followers")
// private Set<User> following = new HashSet<>();

     // Many-to-Many with User (Followers/Following)
    // @ManyToMany
    // @JoinTable(
    //     name = "user_followers_following",
    //     joinColumns = @JoinColumn(name = "follower_id"),
    //     inverseJoinColumns = @JoinColumn(name = "following_id")
    // )
    // private Set<User> followers = new HashSet<>();


}
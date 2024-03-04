package com.shouq.project;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Likes")
public class Likes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long LikeID;

   // Many-to-One with User
     @ManyToOne(cascade = CascadeType.ALL)
     private User user;
          // One-to-One with Post
     @OneToOne(cascade = CascadeType.ALL)
     private Post post;
 
     // Many-to-One with Comment
     @ManyToOne(cascade = CascadeType.ALL)
     private Comment comment;



}
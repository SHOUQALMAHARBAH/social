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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Post")
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long PostID;
  @Column
private String content;
@Column
private LocalDate timestampe;
  @Column
private Integer likecount;
@Column
private Integer commentcount;
@Column
private Integer sharecount;
// Many-to-One with User
@ManyToOne
@JoinColumn(name = "user_id")
private User user;

 // One-to-Many with Comment
 @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
 private Set<Comment> comments = new HashSet<>();

     // One-to-Many with Like
     @OneToMany(mappedBy = "post")
     private Set<Likes> likes = new HashSet<>();
 
     // One-to-Many with Share
     @OneToMany(mappedBy = "post")
     private Set<Share> shares = new HashSet<>();
 
     // Many-to-Many with Topics
     @ManyToMany
     @JoinTable(
         name = "post_topics",
         joinColumns = @JoinColumn(name = "post_id"),
         inverseJoinColumns = @JoinColumn(name = "topic_id")
     )
     private Set<Topics> topics = new HashSet<>();
}

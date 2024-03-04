package com.shouq.project;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "Comment")
public class Comment {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long CommentID;


  // Many-to-One with User
  @ManyToOne
  private User user;

  // Many-to-One with Post
  @ManyToOne
  private Post post;

  @OneToMany(mappedBy = "comment")
    private Set<Likes> likes = new HashSet<>();

    @OneToMany(mappedBy = "parentComment")
    private Set<Comment> replies = new HashSet<>();

    // Many-to-One for the parent comment in case of replies 
    @ManyToOne
    private Comment parentComment;
}

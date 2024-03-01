package com.shouq.project;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonManagedReference
  private User userID;

  @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
  @JsonManagedReference
  private Post postID;
}

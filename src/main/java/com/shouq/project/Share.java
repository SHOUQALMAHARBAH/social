package com.shouq.project;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Share")
public class Share {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long ShareID;
    // Many-to-One with User
   @ManyToOne(cascade = CascadeType.ALL)
   private User user;
      // Many-to-One with Post
      @ManyToOne(cascade = CascadeType.ALL)
      private Post post;
}
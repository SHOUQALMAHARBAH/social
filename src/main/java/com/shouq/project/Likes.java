package com.shouq.project;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
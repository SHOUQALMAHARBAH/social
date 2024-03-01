package com.shouq.project;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}

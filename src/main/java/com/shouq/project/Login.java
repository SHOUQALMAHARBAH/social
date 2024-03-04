package com.shouq.project;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Login")
public class Login {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long LoginID;
  @Column
private char password;
//errrooooooooooorrrrrrrrrrr
// @OneToOne(mappedBy = "login")
//     private User user;


}

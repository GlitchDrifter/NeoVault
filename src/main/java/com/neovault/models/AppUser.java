package com.neovault.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import java.util.Date;
import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "users")
public class AppUser {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String firstName;
  private String LastName;

  @Column(unique = true, nullable = false)
  private String email;

  private String phone;
  private String address;
  private String password;
  private String role;
  private Date createdAt;
}

package pai.lab7.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "studenci")
@Table(name="studenci")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @JsonView
    private String name;
    @JsonView
    private String surName;
    @JsonView
    private String averagoe;
}

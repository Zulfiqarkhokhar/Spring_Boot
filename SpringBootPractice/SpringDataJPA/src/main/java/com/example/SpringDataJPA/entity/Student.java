package com.example.SpringDataJPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tbl_student",
uniqueConstraints = @UniqueConstraint(
        name = "emailid_unique",
        columnNames = "email_address"
))
public class Student {
    @Id
    @SequenceGenerator(
            name = "sequence_generator",
            sequenceName = "sequence_generator",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_generator"
    )
    private Long studentId;
    private String firstName;
    private String lastName;

    @Column(name = "email_address",
    nullable = false)
    private String emailId;

    @Embedded
    private Gaurdian gaurdian;
}

package com.cesur.general.general.models;

import java.time.LocalDateTime;

import com.cesur.general.general.models.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "historicals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Historical {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "createAt")
    private LocalDateTime createdAt;

    @Column(name = "endAt", nullable = true)
    private LocalDateTime deletedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userCreated;

    @OneToOne
    @JoinColumn(name = "incidence_id")
    private Incidence incidence;
}

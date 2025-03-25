package com.org.orm.entity;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "therapists")
public class Therapist {
    @Id
    private Long therapistId;

    private String name;
    private String contactNumber;
    private String specialization;
    private String availabilitySchedule;

    @OneToMany(mappedBy = "therapist", cascade = CascadeType.ALL)
    private List<TherapySession> therapySessions;

}

package com.example.demo.domain.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "work_list_id")
    WorkList workList;

    public Event(String event) {
        this.name = event;
    }
}

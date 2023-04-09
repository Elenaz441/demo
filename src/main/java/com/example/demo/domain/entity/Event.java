package com.example.demo.domain.entity;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @ManyToOne()
    @JoinColumn(name = "work_list_id")
    WorkList workList;

    public static Event createEventFrom(String name, WorkList workList) {
        return Event.builder()
                .name(name)
                .workList(workList)
                .build();
    }
}

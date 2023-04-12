package com.example.demo.domain.entity;

import com.example.demo.domain.dto.request.CreateWorkListRequest;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "work_list")
public class WorkList {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 10)
    Long id;

    String name;

    @OneToMany(mappedBy = "workList", cascade = CascadeType.ALL)
    List<Event> events;

    public static WorkList createWorkListFrom(CreateWorkListRequest request) {
        List<Event> events = request.getEvents()
                .stream()
                .map(Event::new)
                .collect(Collectors.toList());
        return WorkList.builder()
                .name(request.getName())
                .events(events)
                .build();
    }

}

package com.example.demo.domain.entity;

import com.example.demo.domain.dto.request.CreateWorkListRequest;
import lombok.*;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

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
    List<Event> events = new LinkedList<>();

    public static WorkList createWorkListFrom(CreateWorkListRequest request) {
        return WorkList.builder()
                .name(request.getName())
                .events(new LinkedList<>())
                .build();
    }

}

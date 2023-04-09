package com.example.demo.domain.entity;

import com.example.demo.domain.dto.request.CreateWorkListRequest;
import lombok.*;

import javax.persistence.*;

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

    public static WorkList createWorkListFrom(CreateWorkListRequest request) {
        return WorkList.builder()
                .name(request.getName())
                .build();
    }

}

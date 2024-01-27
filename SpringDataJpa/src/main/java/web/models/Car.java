package web.models;

import lombok.*;
import web.services.AccountService;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@ToString(exclude = "owner")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String brand;
    private String model;
    private String color;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Account owner;
}

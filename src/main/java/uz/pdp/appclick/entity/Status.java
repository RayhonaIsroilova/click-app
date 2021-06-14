package uz.pdp.appclick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.appclick.entity.enums.Types;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @ManyToOne
    private Project projectId;
    @ManyToOne
    private Space spaceId;
    @ManyToOne
    private Category categoryId;

    @Enumerated(value = EnumType.STRING)
    private Types types;

    private String color;
}

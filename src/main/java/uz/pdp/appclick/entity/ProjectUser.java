package uz.pdp.appclick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.appclick.entity.enums.Permission;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    @ManyToOne
    private Project projectId;
    @ManyToOne
    private User userId;
    @Enumerated(value = EnumType.STRING)
    private Permission permission;
}

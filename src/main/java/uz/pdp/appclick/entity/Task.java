package uz.pdp.appclick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String description;

    @ManyToOne
    private Status statusId;

    @ManyToOne
    private Category categoryId;

    @ManyToOne
    private Priority priorityId;

    @ManyToOne
    private Task parentTaskId;

    private Date startedDate;
    private Timestamp startTimeHas;
    private Date dueDate;
    private Timestamp dueTimeHas;
    private Long estimateTime;
    private Date activedDate;

}

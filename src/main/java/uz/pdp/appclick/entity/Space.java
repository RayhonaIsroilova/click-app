package uz.pdp.appclick.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Space {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String color;
    private String initialLetter;
    private String accessType;
    @ManyToOne
    private Workspace workspaceId;

    @ManyToOne
    private User ownerId;

    @ManyToOne
    private Icon iconId;

    @ManyToOne
    private Attachment avatarId;
}

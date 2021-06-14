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
public class WorkspaceUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Workspace workspaceId;

    @ManyToOne
    private User ownerId;

    @ManyToOne
    private WorkspaceRole workspaceRoleId;

    private Timestamp dateInvited;
    private Timestamp dateJoined;

}

package us.thedorm.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class dorm_facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
//    private int type_id;
    private int status;
//    private long room_id;
    private long bed_id;
    private int floor;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private room rooms;
    @ManyToOne
    @JoinColumn(name = "type_id")
    private facility_type facilityType;
}

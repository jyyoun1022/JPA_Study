package spring.data_jpa.study.room.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Account {

    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false, unique = true)
    private String username;
    private String password;

    @OneToMany
    private Set<Study> students = new HashSet<>();














//    @Temporal(TemporalType.TIMESTAMP)
//    private Date created  = new Date();
//
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column= @Column(name = "home_street"))
//    })
//    private Address homeAddress;

//    private String yes;
//
//    @Transient
//    private String no;
}

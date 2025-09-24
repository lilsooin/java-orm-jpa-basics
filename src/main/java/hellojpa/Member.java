package hellojpa;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
// @SequenceGenerator(
//        name = "MEMBER_SEQ_GENERATOR",
//        sequenceName = "MEMBER_SEQ", // 매핑할 데이터베이스 시퀀스 이름
//        initialValue = 1, allocationSize = 50)
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    // (strategy = GenerationType.SEQUENCE,
    // generator = "MEMBER_SEQ_GENERATOR")
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

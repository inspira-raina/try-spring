package org.ait.project.template.modules.client.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Setter
@Getter
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comp_name")
    private String compName;

    @Column(name = "comp_address")
    private String compAddress;

    @Column(name = "comp_phone")
    private String compPhone;

    @Column(name = "pic_name")
    private String picName;

    @Column(name = "pic_phone")
    private String picPhone;

    @Column(name = "created_at")
    private ZonedDateTime createdAt;

    @Column(name = "updated_at")
    private ZonedDateTime updatedAt;

}

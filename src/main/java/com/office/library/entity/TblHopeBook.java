package com.office.library.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TblHopeBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer hb_no;
    private Integer u_m_no;
    private String hb_name;
    private String hb_author;
    private String hb_publisher;
    private String hb_reg_date;
    private String hb_mod_date;
    private Integer hb_result;
    private String hb_result_last_date;

}

package com.demo.example.Student_Library_Management_System.RequestDTO;

import lombok.Data;
import java.util.Date;
@Data
public class CardRequestDTO {
    private Date createDate;
    private Date updateDate;
    private String cardStatus;
}

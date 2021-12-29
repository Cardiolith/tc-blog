package top.cardio.learntool.infrastructure.gatewayimpl.database.dataobject;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class BaseDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreatedDate
    private Date dateCreated;
    @LastModifiedDate
    private Date lastUpdated;
    @CreatedBy
    private String createBy;
    @LastModifiedBy
    private String updateBy;
}

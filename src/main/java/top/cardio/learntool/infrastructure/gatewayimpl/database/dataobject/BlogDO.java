package top.cardio.learntool.infrastructure.gatewayimpl.database.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "blog")
@Data
public class BlogDO extends BaseDO {
    private String title;
    private String filePath;
}

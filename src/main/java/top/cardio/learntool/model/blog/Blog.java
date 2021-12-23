package top.cardio.learntool.model.blog;

import lombok.Data;
import top.cardio.learntool.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "blog")
public class Blog extends BaseEntity {
    private String title;
    @Column(name = "file_path")
    private String filePath;
}
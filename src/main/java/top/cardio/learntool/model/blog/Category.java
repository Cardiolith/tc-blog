package top.cardio.learntool.model.blog;

import lombok.Data;
import top.cardio.learntool.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "category")
public class Category extends BaseEntity {
    private String category;
}

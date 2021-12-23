package top.cardio.learntool.model.blog;

import lombok.Data;
import top.cardio.learntool.model.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "keyword")
public class Keyword extends BaseEntity {
    private String keyword;
}

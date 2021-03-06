package top.cardio.learntool.domain.blogs;

import com.alibaba.cola.domain.EntityObject;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

@Data
public class Blog extends EntityObject {

    private static Logger logger = LoggerFactory.getLogger(Blog.class);

    private String title;
    private String filePath;

    Collection<Keyword> keywords;
    Collection<Category> categories;
}

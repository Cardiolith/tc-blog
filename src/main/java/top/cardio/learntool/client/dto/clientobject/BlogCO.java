package top.cardio.learntool.client.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import lombok.Data;

import java.util.Collection;

@Data
public class BlogCO extends ClientObject {
    private String title;
    private String filePath;

    Collection<String> keywords;
    Collection<String> categories;
}

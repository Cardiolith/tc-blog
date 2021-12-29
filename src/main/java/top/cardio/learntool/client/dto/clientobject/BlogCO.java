package top.cardio.learntool.client.dto.clientobject;

import com.alibaba.cola.dto.ClientObject;
import lombok.Data;

@Data
public class BlogCO extends ClientObject {
    private String title;
    private String filePath;
}

package top.cardio.learntool.client.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import top.cardio.learntool.client.dto.clientobject.BlogCO;

@Data
public class BlogAddCmd extends CommonCommand {

    @NotNull
    private BlogCO blogCO;
}

package top.cardio.learntool.client.api;

import com.alibaba.cola.dto.Response;
import top.cardio.learntool.client.dto.BlogAddCmd;

public interface BlogServiceI {
    public Response addBlog(BlogAddCmd cmd);
}

package top.cardio.learntool.client.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import top.cardio.learntool.client.dto.BlogAddCmd;
import top.cardio.learntool.client.dto.BlogQry;
import top.cardio.learntool.client.dto.clientobject.BlogCO;

public interface BlogServiceI {
    public Response addBlog(BlogAddCmd cmd);

    public MultiResponse<BlogCO> listBlog(BlogQry blogQry);
}

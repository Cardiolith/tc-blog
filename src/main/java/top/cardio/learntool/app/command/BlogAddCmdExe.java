package top.cardio.learntool.app.command;

import com.alibaba.cola.dto.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.cardio.learntool.client.dto.BlogAddCmd;
import top.cardio.learntool.domain.blogs.Blog;
import top.cardio.learntool.domain.gateway.BlogGateway;

@Component
public class BlogAddCmdExe {

    @Autowired
    private BlogGateway blogGateway;

    public Response execute(BlogAddCmd blogAddCmd) {
        Blog blog = new Blog();
        BeanUtils.copyProperties(blogAddCmd.getBlogCO(), blog);
        blogGateway.save(blog);
        return Response.buildSuccess();
    }
}

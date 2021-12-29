package top.cardio.learntool.app.service;

import com.alibaba.cola.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cardio.learntool.app.command.BlogAddCmdExe;
import top.cardio.learntool.client.api.BlogServiceI;
import top.cardio.learntool.client.dto.BlogAddCmd;

@Service
public class BlogServiceImpl implements BlogServiceI {

    @Autowired
    private BlogAddCmdExe blogAddCmdExe;

    @Override
    public Response addBlog(BlogAddCmd cmd) {
        return blogAddCmdExe.execute(cmd);
    }
}

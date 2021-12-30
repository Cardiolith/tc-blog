package top.cardio.learntool.app.service;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.cardio.learntool.app.command.BlogAddCmdExe;
import top.cardio.learntool.app.command.BlogQryExe;
import top.cardio.learntool.client.api.BlogServiceI;
import top.cardio.learntool.client.dto.BlogAddCmd;
import top.cardio.learntool.client.dto.BlogQry;
import top.cardio.learntool.client.dto.clientobject.BlogCO;

@Service
public class BlogServiceImpl implements BlogServiceI {

    @Autowired
    private BlogAddCmdExe blogAddCmdExe;

    @Autowired
    private BlogQryExe blogQryExe;

    @Override
    public Response addBlog(BlogAddCmd cmd) {
        return blogAddCmdExe.execute(cmd);
    }

    @Override
    public MultiResponse<BlogCO> listBlog(BlogQry blogQry) {
        return blogQryExe.execute(blogQry);
    }
}

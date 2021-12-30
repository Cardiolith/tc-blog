package top.cardio.learntool.controller;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.cardio.learntool.client.api.BlogServiceI;
import top.cardio.learntool.client.dto.BlogAddCmd;
import top.cardio.learntool.client.dto.BlogQry;
import top.cardio.learntool.client.dto.clientobject.BlogCO;

@RestController
public class BlogController {

    @Autowired
    private BlogServiceI blogService;

    @PostMapping(value = "/blog/add")
    public Response addBlog(@RequestBody BlogAddCmd blogAddCmd){
        return blogService.addBlog(blogAddCmd);
    }

    @GetMapping(value = "/blog/list")
    public MultiResponse<BlogCO> listBlog(BlogQry blogQry) {
        return blogService.listBlog(blogQry);
    }
}

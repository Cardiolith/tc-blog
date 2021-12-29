package top.cardio.learntool.controller;

import com.alibaba.cola.dto.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.cardio.learntool.client.api.BlogServiceI;
import top.cardio.learntool.client.dto.BlogAddCmd;

@RestController
public class BlogController {

    @Autowired
    private BlogServiceI blogService;

    @PostMapping(value = "/blog/add")
    public Response addBlog(@RequestBody BlogAddCmd blogAddCmd){
        return blogService.addBlog(blogAddCmd);
    }
}

package top.cardio.learntool.app.command;

import com.alibaba.cola.dto.MultiResponse;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.cardio.learntool.client.dto.BlogQry;
import top.cardio.learntool.client.dto.clientobject.BlogCO;
import top.cardio.learntool.domain.blogs.Blog;
import top.cardio.learntool.infrastructure.gatewayimpl.database.BlogRepository;
import top.cardio.learntool.infrastructure.gatewayimpl.database.dataobject.BlogDO;

import java.util.List;

@Component
public class BlogQryExe {

    @Autowired
    private BlogRepository blogRepository;

    public MultiResponse<BlogCO> execute(BlogQry blogQry) {
        List<BlogDO> blogDOList = blogRepository.findAll();
        List<BlogCO> blogCOList = Lists.newLinkedList();
        blogDOList.stream().forEach(blogDO -> {
            BlogCO blogCO = BlogCO.builder()
                    .title(blogDO.getTitle())
                    .filePath(blogDO.getFilePath())
                    .build();
            blogCOList.add(blogCO);
        });
        return MultiResponse.ofWithoutTotal(blogCOList);
    }
}

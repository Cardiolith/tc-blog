package top.cardio.learntool.infrastructure.gatewayimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.cardio.learntool.domain.blogs.Blog;
import top.cardio.learntool.domain.gateway.BlogGateway;
import top.cardio.learntool.infrastructure.convertor.BlogConvertor;
import top.cardio.learntool.infrastructure.gatewayimpl.database.BlogRepository;
import top.cardio.learntool.infrastructure.gatewayimpl.database.dataobject.BlogDO;

import javax.annotation.Resource;

@Component
public class BlogGatewayImpl implements BlogGateway {

    private static Logger logger = LoggerFactory.getLogger(BlogGatewayImpl.class);

    @Resource
    private BlogRepository blogRepository;

    @Override
    public void save(Blog blog) {
        BlogDO blogDO = BlogConvertor.toDataObject(blog);
        blogRepository.save(blogDO);
        logger.debug("AutoGenerateID: " + blogDO.getId());
    }
}

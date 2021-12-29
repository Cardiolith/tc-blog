package top.cardio.learntool.infrastructure.convertor;

import top.cardio.learntool.domain.blogs.Blog;
import top.cardio.learntool.infrastructure.gatewayimpl.database.dataobject.BlogDO;

public class BlogConvertor {

    public static BlogDO toDataObject(Blog blog) {
        BlogDO blogDO = new BlogDO();
        blogDO.setTitle(blog.getTitle());
        blogDO.setFilePath(blog.getFilePath());
        return blogDO;
    }
}

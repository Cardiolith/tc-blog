package top.cardio.learntool.infrastructure.gatewayimpl.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.cardio.learntool.infrastructure.gatewayimpl.database.dataobject.BlogDO;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<BlogDO, Long> {

    public BlogDO save(BlogDO blogDO);

    public List<BlogDO> findAll();
}

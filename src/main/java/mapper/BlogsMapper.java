package mapper;

import daomain.Blogs;

public interface BlogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blogs record);

    int insertSelective(Blogs record);

    Blogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blogs record);

    int updateByPrimaryKey(Blogs record);


}

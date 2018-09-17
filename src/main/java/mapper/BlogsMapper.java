package mapper;

import java.util.List;

import daomain.Blogs;

public interface BlogsMapper {
    int deleteByPrimaryKey(Integer id_b);

    int insert(Blogs record);

    int insertSelective(Blogs record);

    List<Blogs> selectByIdU(String id_u);

    int updateByPrimaryKeySelective(Blogs record);

    int updateByPrimaryKey(Blogs record);


}

package service;

import java.util.List;

import mapper.BlogsMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daomain.Blogs;

@Service
public class BlogsService {
	@Autowired
	private BlogsMapper blogsMapper;

	public void delBlogs(Integer id) {
		blogsMapper.deleteByPrimaryKey(id);
	}

	public List<Blogs> getBlogs(String id_u) {
		return blogsMapper.selectByIdU(id_u);
	}

	public void modBlogs(Blogs blogs) {
		blogsMapper.updateByPrimaryKeySelective(blogs);
	}

	public void addBlogs(Blogs blogs) {
		blogsMapper.insert(blogs);
	}
}

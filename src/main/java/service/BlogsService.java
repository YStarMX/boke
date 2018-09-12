package service;

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

	public Blogs getBlogs(Integer id) {
		return blogsMapper.selectByPrimaryKey(id);
	}

	public void modBlogs(Blogs blogs) {
		blogsMapper.updateByPrimaryKeySelective(blogs);
	}

	public void addBlogs(Blogs blogs) {
		blogsMapper.insert(blogs);
	}
}

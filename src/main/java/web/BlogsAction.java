package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.BlogsService;
import service.UserService;
import service.LabelService;
import daomain.Blogs;
import daomain.User;
import daomain.Label;

@Controller
public class BlogsAction {
	@Autowired
	private BlogsService blogsService;
	@Autowired
	private UserService userService;
	@Autowired
	private LabelService labelService;

	@RequestMapping(value = "/addBlogs.htm")
	public String addBlogs(Model model, Blogs blogs) {
		blogsService.addBlogs(blogs);
		User user = new User();
		user.setId_u(blogs.getId_u());
		model.addAttribute("user", userService.qryUser(user));
		List<Label> labelList = labelService.allLabels();
		model.addAttribute("labelList", labelList);
		return "BokeHome";
	}
}

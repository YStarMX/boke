package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.LabelService;
import service.UserService;
import daomain.Label;
import daomain.User;

@Controller
public class UserAction {
	@Autowired
	private UserService userService;
	@Autowired
	private LabelService labelService;

	@RequestMapping(value = "/index")
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value = "/toAddUser.htm")
	public String toAddUser() {
		return "addUser";
	}

	@RequestMapping(value = "/selectName.htm")
	public String selectName(Model model, User user) {
		User tmpUser = new User();
		tmpUser.setName(user.getName());
		if (userService.selectUser(tmpUser) > 0) {
			model.addAttribute("error", "用户名已被注册");
			return "addUser";
		} else {
			userService.insert(user);
			model.addAttribute("msg", "用户名注册成功");
			return "index";
		}
	}

	@RequestMapping(value = "/UserLogin.htm")
	public String UserLogin(Model model, User user) {
		if (userService.selectUser(user) > 0) {
			List<Label> labelList = labelService.allLabels();
			model.addAttribute("labelList", labelList);
			model.addAttribute("user", userService.qryUser(user));
			return "BokeHome";
		} else {
			model.addAttribute("msg", "用户名或密码错误");
			return "index";
		}
	}
}

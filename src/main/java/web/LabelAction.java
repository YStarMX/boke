package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.LabelService;
import daomain.Label;

@Controller
public class LabelAction {
	@Autowired
	private LabelService labelService;

	@RequestMapping(value = "/addLabel.json")
	@ResponseBody
	public String addLabel(Model model ,Label label) {
		if (labelService.selectLabel(label) > 0){
			model.addAttribute("msg", "标签名已存在");
			return "success";
		}else{
			labelService.addLabel(label);
			return "success";
		}
	}
}

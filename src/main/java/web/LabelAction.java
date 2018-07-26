package web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.LabelService;
import daomain.Label;

@Controller
public class LabelAction {
	@Autowired
	private LabelService labelService;

	@RequestMapping(value = "/selectTagName.htm")
	public String selectTagName(Model model ,Label label) {
		if (labelService.selectLabel(label) > 0){
			List<Label> labelList = labelService.allLabels();
			model.addAttribute("labelList", labelList);
			model.addAttribute("msg", "标签名已存在");
			return "BokeHome";
		}else{
			labelService.addLabel(label);
			List<Label> labelList = labelService.allLabels();
			model.addAttribute("labelList", labelList);
			model.addAttribute("msg", "标签添加成功");
			return "BokeHome";
		}
	}
}

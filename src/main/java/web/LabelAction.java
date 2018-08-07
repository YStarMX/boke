package web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	public String addLabel(Label label) {
		if (labelService.selectLabel(label) > 0) {
			return "-1";
		} else {
			labelService.addLabel(label);
			int id = labelService.getId(label.getTagname());
			return "" + id;
		}
	}
}

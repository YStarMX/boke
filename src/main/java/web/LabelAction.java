package web;

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

}

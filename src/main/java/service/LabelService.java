package service;

import java.util.List;

import mapper.LabelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daomain.Label;

@Service
public class LabelService {
	@Autowired
	private LabelMapper labelMapper;

	public void delLabel(Integer id) {
		labelMapper.deleteByPrimaryKey(id);
	}

	public Label getLabel(Integer id) {
		return labelMapper.selectByPrimaryKey(id);
	}

	public void modLabel(Label label) {
		labelMapper.updateByPrimaryKeySelective(label);
	}

	public void addLabel(Label label) {
		labelMapper.insert(label);
	}

	public List<Label> allLabels() {
		return labelMapper.getAllLabel();
	}

	public int selectLabel(Label label) {
		return labelMapper.selectByParams(label);
	}
	
	public int getId(String tagname) {
		return labelMapper.selectByTagName(tagname);
	}
}

package service;

import mapper.MiddleMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import daomain.Middle;

@Service
public class MiddleService {
	@Autowired
	private MiddleMapper middleMapper;

	public void delMiddle(Integer id) {
		middleMapper.deleteByPrimaryKey(id);
	}

	public Middle getMiddle(Integer id) {
		return middleMapper.selectByPrimaryKey(id);
	}

	public void modMiddle(Middle middle) {
		middleMapper.updateByPrimaryKeySelective(middle);
	}

	public void addMiddle(Middle middle) {
		middleMapper.insert(middle);
	}
}

package org.lq.ssm.active.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.lq.ssm.active.dao.TemplateDao;
import org.lq.ssm.active.service.TemplateService;
import org.lq.ssm.entity.Template;
import org.springframework.stereotype.Service;
@Service("templateServiceImpl")
public class TemplateServiceImpl implements TemplateService{

	@Resource(name="templateDao")
	private TemplateDao templateDao;
	
	public void setTemplateDao(TemplateDao templateDao) {
		this.templateDao = templateDao;
	}

	/**
	 * ɾ��
	 */
	@Override
	public boolean delete(int id) {
		return templateDao.delete(id)>0;
	}
	/**
	 * ��ѯȫ��
	 */
	@Override
	public List<Template> findAll() {
		return templateDao.findAll();
	}
	/**
	 * ͨ��ID��ѯ
	 */
	@Override
	public Template findById(Integer id) {
		return templateDao.findById(id);
	}
	/**
	 * ���
	 */
	@Override
	public boolean save(Template t) {
		return templateDao.save(t)>0;
	}
	/**
	 * �޸�
	 */
	@Override
	public boolean update(Template t) {
		return templateDao.update(t)>0;
	}


@Override
public int findSeq() {
	return templateDao.findSeq();
}

@Override
public List<Template> findEma() {
	return templateDao.findEma();
}

@Override
public List<Template> findLike(String title) {
	return templateDao.findLike(title);
}

}

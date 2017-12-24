package org.lq.ssm.admissions.service;

import java.util.List;

import org.lq.ssm.entity.Audition;

public interface AuditionBiz {
	
	public List<Audition> findAll();//��ѯȫ��
	public boolean save(Audition a);//���
	public boolean update(Audition a);//�޸�
	public boolean delete(int id);//ɾ��
	public List<Audition> getByName(String name);//����������ѯ
	public List<Audition> getByCouse(String couse);//���������γ̲�ѯ
	public List<Audition> getNC(String name,String couse);
	public Audition getById(int id);
}

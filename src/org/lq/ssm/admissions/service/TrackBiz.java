package org.lq.ssm.admissions.service;

import java.util.List;

import org.lq.ssm.entity.Track;

public interface TrackBiz {

	public List<Track> findAll();//��ѯȫ��
	public boolean save(Track t);//���
	public boolean update(Track t);//�޸�
	public boolean delete(int id);//ɾ��
	public List<Track> getByName(String name);//����������ѯ
	public List<Track> getByEnrollment(String Enrollment);//���������ѯ
	public Track getById(int id);
}

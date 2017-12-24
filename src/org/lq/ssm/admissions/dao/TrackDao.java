package org.lq.ssm.admissions.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lq.ssm.entity.Track;

public interface TrackDao {
	public List<Track> findAll();//��ѯȫ��
	public int save(Track t);//���
	public int update(Track t);//�޸�
	public int delete(@Param("id")int id);//ɾ��
	public List<Track> getByName(@Param("name")String name);//����������ѯ
	public List<Track> getByEnrollment(@Param("Enrollment")String Enrollment);//���������ѯ
	public Track getById(@Param("id")int id);
}

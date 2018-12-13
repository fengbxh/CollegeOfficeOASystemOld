package cn.edu.usts.services;

import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Teacherpersonalinfo;

import java.util.List;

public interface ITeacherpersonalinfoService {
    //只添加教师的个人信息
    public boolean insertTeacher(Teacherpersonalinfo teacher);
    //只查询教师的个人信息
    public Teacherpersonalinfo selectTeacherByTeid(String teId);
    //只更新教师的个人信息
    public boolean updateTeacher(Teacherpersonalinfo teacher);
    //只删除教师的个人信息
    public boolean deleteTeacherByTeid(String teId);
    //查询完整的教师信息
    public Teacherpersonalinfo AllResult(String teId);
    //删除完整的教师信息
    public boolean deleteAllInfoByPrimaryKey(String teId);
    //添加完整的教师信息
    public boolean insertAllInfo(Teacherpersonalinfo teacher);

    public List<Teacherpersonalinfo> findAll();

    public PageBean<Teacherpersonalinfo> findAllBypage(int currentPage);
}

package cn.edu.usts.services;

import cn.edu.usts.pojo.Teacheroccupationalinfo;

public interface ITeacheroccupatioalinfoService {
    //只添加教师的职业信息
    public boolean insertTeacher(Teacheroccupationalinfo teacher);
    //只查询教师的职业信息
    public Teacheroccupationalinfo selectTeacherByTeid(String teId);
    //只更新教师的职业信息
    public boolean updateTeacher(Teacheroccupationalinfo teacher);
    //只删除教师的职业信息
    public boolean deleteTeacherByTeid(String teId);
}

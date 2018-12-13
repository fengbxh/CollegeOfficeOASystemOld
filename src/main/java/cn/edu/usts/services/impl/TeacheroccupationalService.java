package cn.edu.usts.services.impl;

import cn.edu.usts.mapper.TeacheroccupationalinfoMapper;
import cn.edu.usts.pojo.Teacheroccupationalinfo;
import cn.edu.usts.pojo.Teacherpersonalinfo;
import cn.edu.usts.services.ITeacheroccupatioalinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeacheroccupationalService implements ITeacheroccupatioalinfoService {
    @Resource
    private TeacheroccupationalinfoMapper teacherMapper;


    @Override
    public boolean insertTeacher(Teacheroccupationalinfo teacher) {
        try {
            int index = teacherMapper.insert(teacher);
            return index > 0 ? true : false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
        }
    }

    @Override
    public Teacheroccupationalinfo selectTeacherByTeid(String teId) {
        Teacheroccupationalinfo teacher = teacherMapper.selectByPrimaryKey(teId);
        return teacher;
    }

    @Override
    public boolean updateTeacher(Teacheroccupationalinfo teacher) {
        try {
            int index = teacherMapper.updateByPrimaryKey(teacher);
            boolean bool = index > 0 ? true : false;
            return bool;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
        }
    }

    @Override
    public boolean deleteTeacherByTeid(String teId) {
        try {
            int index = teacherMapper.deleteByPrimaryKey(teId);
            boolean bool = index > 0 ? true : false;
            return bool;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
        }
    }
}

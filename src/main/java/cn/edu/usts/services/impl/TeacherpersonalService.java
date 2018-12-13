package cn.edu.usts.services.impl;

import cn.edu.usts.mapper.TeacherpersonalinfoMapper;
import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Teacherpersonalinfo;
import cn.edu.usts.services.ITeacherpersonalinfoService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class TeacherpersonalService implements ITeacherpersonalinfoService {
    @Resource
    private TeacherpersonalinfoMapper teacherMapper;

    @Override
    public boolean insertTeacher(Teacherpersonalinfo teacher) {
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
    public Teacherpersonalinfo selectTeacherByTeid(String teId) {
        Teacherpersonalinfo teacher = teacherMapper.selectByPrimaryKey(teId);
        return teacher;
    }

    @Override
    public boolean updateTeacher(Teacherpersonalinfo teacher) {
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

    @Override
    public Teacherpersonalinfo AllResult(String teId) {
        Teacherpersonalinfo teacher = teacherMapper.AllResult(teId);
        return teacher;
    }

    @Override
    public boolean deleteAllInfoByPrimaryKey(String teId) {
        try {
            int index = teacherMapper.deleteAllInfoByPrimaryKey(teId);
            boolean bool = index > 0 ? true : false;
            return bool;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
        }
    }

    @Override
    public boolean insertAllInfo(Teacherpersonalinfo teacher) {
        try {
            int index = teacherMapper.insertAllInfo(teacher);
            return index > 0 ? true : false;
        } catch (Exception e) {
            //e.printStackTrace();
            return false;
        } finally {
        }
    }

    @Override
    public List<Teacherpersonalinfo> findAll() {
        return teacherMapper.findAll();
    }

    @Override
    public PageBean<Teacherpersonalinfo> findAllBypage(int currentPage) {
        PageBean<Teacherpersonalinfo> pageBean=new PageBean<>();
        pageBean.setCurrPage(currentPage);
        //每页显示的数据
        int pageSize=5;
        pageBean.setPageSize(pageSize);

        //封装总记录数
        int totalCount = teacherMapper.selectCount();
        pageBean.setTotalCount(totalCount);
        //封装总页数
        double tc = totalCount;
        Double num =Math.ceil(tc/pageSize);//向上取整
        pageBean.setTotalPage(num.intValue());
        List<Teacherpersonalinfo> list=teacherMapper.findAllBypage(currentPage,pageSize);
        pageBean.setLists(list);
        return pageBean;
    }
}

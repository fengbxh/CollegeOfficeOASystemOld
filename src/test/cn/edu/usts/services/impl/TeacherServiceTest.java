package cn.edu.usts.services.impl;

import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Teacheroccupationalinfo;
import cn.edu.usts.pojo.Teacherpersonalinfo;

import cn.edu.usts.services.ITeacherpersonalinfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TeacherServiceTest {

    @Resource
    private ITeacherpersonalinfoService teacherService=null;
    @Test
    public void selectTeacherByTeid() {
        Teacherpersonalinfo teacher=teacherService.selectTeacherByTeid("10001");
        System.out.println(teacher.getEducation());
    }
    @Test
    public void setTeacherAllInfoByTeid(){
        Teacherpersonalinfo teacher=teacherService.AllResult("10001");
        Teacheroccupationalinfo teacheroccupationalinfo=teacher.getTeacheroccupationalinfo();
        System.out.println(teacheroccupationalinfo.getTechnicalPosition());
        System.out.println(teacher.getEducation());
    }
    @Test
    public void deleteTeacherByTeid(){
        Boolean a=teacherService.deleteAllInfoByPrimaryKey("3");
        System.out.printf(a.toString());
    }

    @Test
    public void addTeacher() throws ParseException {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Teacheroccupationalinfo teacheroccupationalinfo=new Teacheroccupationalinfo("12345","11111","电子信息与工程学院","内设部门",simpleDateFormat.parse("2018-10-15"),simpleDateFormat.parse("2018-10-15"),"管理","达瓦","","达瓦","awdaw",simpleDateFormat.parse("2018-10-15"),simpleDateFormat.parse("2018-10-15"),"awd","dwad","dwad",simpleDateFormat.parse("2018-10-15"),simpleDateFormat.parse("2018-10-15"),"dawd",simpleDateFormat.parse("2018-10-15"));
        Teacherpersonalinfo teacherpersonalinfo=new Teacherpersonalinfo("12345","张三",23,simpleDateFormat.parse("2018-10-15"),"北京大学","北京大学","计算机科学","112233@qq.com","130123456789","88776655","江苏省苏州市","中国","无",teacheroccupationalinfo);
        Boolean a=teacherService.insertAllInfo(teacherpersonalinfo);

    }

    @Test
    public void findAllTeacher(){
        System.out.printf("**************测试开始**************\n");
        PageBean<Teacherpersonalinfo> pageBean = teacherService.findAllBypage(1);
        for (Teacherpersonalinfo t:pageBean.getLists()) {
            System.out.printf(t.getTeId()+"\n");

        }
        System.out.printf(pageBean.getTotalCount()+"");
        System.out.printf("**************测试结束**************\n");
    }
}
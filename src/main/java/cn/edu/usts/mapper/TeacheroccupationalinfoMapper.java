package cn.edu.usts.mapper;

import cn.edu.usts.pojo.Teacheroccupationalinfo;
import cn.edu.usts.pojo.TeacheroccupationalinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacheroccupationalinfoMapper {
    int countByExample(TeacheroccupationalinfoExample example);

    int deleteByExample(TeacheroccupationalinfoExample example);

    int deleteByPrimaryKey(String teId);

    int insert(Teacheroccupationalinfo record);

    int insertSelective(Teacheroccupationalinfo record);

    List<Teacheroccupationalinfo> selectByExample(TeacheroccupationalinfoExample example);

    Teacheroccupationalinfo selectByPrimaryKey(String teId);

    int updateByExampleSelective(@Param("record") Teacheroccupationalinfo record, @Param("example") TeacheroccupationalinfoExample example);

    int updateByExample(@Param("record") Teacheroccupationalinfo record, @Param("example") TeacheroccupationalinfoExample example);

    int updateByPrimaryKeySelective(Teacheroccupationalinfo record);

    int updateByPrimaryKey(Teacheroccupationalinfo record);
}
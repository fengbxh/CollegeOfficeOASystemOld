package cn.edu.usts.mapper;

import cn.edu.usts.pojo.Teacherpersonalinfo;
import cn.edu.usts.pojo.TeacherpersonalinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeacherpersonalinfoMapper {
    int countByExample(TeacherpersonalinfoExample example);

    int deleteByExample(TeacherpersonalinfoExample example);

    int deleteByPrimaryKey(String teId);

    int deleteAllInfoByPrimaryKey(String teId);

    int insert(Teacherpersonalinfo record);

    int insertAllInfo(Teacherpersonalinfo record);

    int insertSelective(Teacherpersonalinfo record);

    Teacherpersonalinfo AllResult(String teId);

    List<Teacherpersonalinfo> selectByExample(TeacherpersonalinfoExample example);

    Teacherpersonalinfo selectByPrimaryKey(String teId);

    int updateByExampleSelective(@Param("record") Teacherpersonalinfo record, @Param("example") TeacherpersonalinfoExample example);

    int updateByExample(@Param("record") Teacherpersonalinfo record, @Param("example") TeacherpersonalinfoExample example);

    int updateByPrimaryKeySelective(Teacherpersonalinfo record);

    int updateByPrimaryKey(Teacherpersonalinfo record);

    int updateAllInfoByPrimaryKey(Teacherpersonalinfo record);

    List<Teacherpersonalinfo> findAll();

    List<Teacherpersonalinfo> findAllBypage(@Param("pageIndex")Integer pageIndex,@Param("pageSize")Integer pageSize);

    int selectCount();
}
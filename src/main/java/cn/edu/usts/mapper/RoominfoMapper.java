package cn.edu.usts.mapper;

import cn.edu.usts.pojo.Roominfo;
import cn.edu.usts.pojo.RoominfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoominfoMapper {
    int countByExample(RoominfoExample example);

    int deleteByExample(RoominfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roominfo record);

    int insertSelective(Roominfo record);

    List<Roominfo> selectByExample(RoominfoExample example);

    Roominfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roominfo record, @Param("example") RoominfoExample example);

    int updateByExample(@Param("record") Roominfo record, @Param("example") RoominfoExample example);

    int updateByPrimaryKeySelective(Roominfo record);

    int updateByPrimaryKey(Roominfo record);
}
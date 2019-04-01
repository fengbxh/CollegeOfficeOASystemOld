package cn.edu.usts.mapper;

import cn.edu.usts.pojo.Roomusermaps;
import cn.edu.usts.pojo.RoomusermapsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomusermapsMapper {
    int countByExample(RoomusermapsExample example);

    int deleteByExample(RoomusermapsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roomusermaps record);

    int insertSelective(Roomusermaps record);

    List<Roomusermaps> selectByExample(RoomusermapsExample example);

    Roomusermaps selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roomusermaps record, @Param("example") RoomusermapsExample example);

    int updateByExample(@Param("record") Roomusermaps record, @Param("example") RoomusermapsExample example);

    int updateByPrimaryKeySelective(Roomusermaps record);

    int updateByPrimaryKey(Roomusermaps record);
}
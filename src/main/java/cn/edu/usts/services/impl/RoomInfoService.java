package cn.edu.usts.services.impl;

import cn.edu.usts.mapper.RoominfoMapper;
import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Roominfo;
import cn.edu.usts.services.IRoomInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoomInfoService implements IRoomInfoService {
    @Resource
    RoominfoMapper roominfoMapper;

    @Override
    public PageBean<Roominfo> findBypage(int currentPage) {
        return null;
    }
}

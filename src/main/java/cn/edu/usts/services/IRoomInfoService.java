package cn.edu.usts.services;

import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Roominfo;

public interface IRoomInfoService {
    //分页查询房间信息
    PageBean<Roominfo> findBypage(int currentPage);
}

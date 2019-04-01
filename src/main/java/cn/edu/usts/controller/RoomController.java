package cn.edu.usts.controller;

import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Roominfo;
import cn.edu.usts.services.impl.RoomInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/room")
public class RoomController {
    @Autowired
    private RoomInfoService roomInfoService;

    @RequestMapping(value = "/selectRoomByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageBean<Roominfo> selectTeacher(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage, Model model) {
        try {
            PageBean<Roominfo> pageBean = roomInfoService.findBypage(currentPage);
            return  pageBean;
        }catch (Exception ex){
            return null;
        }
    }
}

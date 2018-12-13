package cn.edu.usts.controller;

import cn.edu.usts.pojo.Msg;
import cn.edu.usts.pojo.PageBean;
import cn.edu.usts.pojo.Teacherpersonalinfo;
import cn.edu.usts.services.impl.TeacherpersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherpersonalService teacherpersonalService;
    //根据用户ID删除教师全部信息
    @RequestMapping(value = "/deleteTeacher", method = RequestMethod.POST)
    @ResponseBody
    public Msg deleteTeacher(String teId, Model model) {
        Boolean a = teacherpersonalService.deleteAllInfoByPrimaryKey(teId);
        if (a) {
            return Msg.success();
        } else {
            return Msg.fail();
        }
    }
    //分页查询教师的全部信息
    @RequestMapping(value = "/selectTeacherByPage", method = RequestMethod.POST)
    @ResponseBody
    public PageBean<Teacherpersonalinfo> selectTeacher(@RequestParam(value="currentPage",defaultValue="1",required=false)int currentPage,Model model) {
        try {
            PageBean<Teacherpersonalinfo> pageBean = teacherpersonalService.findAllBypage(currentPage);
            return  pageBean;
        }catch (Exception ex){
            return null;
        }
    }
    //查询教师的全部查询，目前仅用于导出Excel表格
    @RequestMapping(value="/selectTeacher",method = RequestMethod.GET)
    @ResponseBody
    public List<Teacherpersonalinfo> selectTeacher(){
        try {
            List<Teacherpersonalinfo> list =teacherpersonalService.findAll();
            return list;
        }catch (Exception ex){
            return null;
        }
    }
    //添加一个教师信息
    @RequestMapping(value = "/addTeacher", method = RequestMethod.POST)
    @ResponseBody
    public Msg addTeacher(Teacherpersonalinfo teacherpersonalinfo )  {
        try {
            boolean result= teacherpersonalService.insertAllInfo(teacherpersonalinfo);
            if (result){
                return Msg.success();
            }else
            {
                return Msg.fail();
            }
        }catch (Exception e){
            return Msg.fail();
        }
        finally {

        }

    }
    //用于日期的格式化
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }


}

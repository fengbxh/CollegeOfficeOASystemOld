<%--
  Created by IntelliJ IDEA.
  User: 52721
  Date: 2018/11/5
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>新增教师-WeAdmin Frame型后台管理系统-WeAdmin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../../static/css/font.css">
    <link rel="stylesheet" href="../../static/css/weadmin.css">
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="weadmin-body">
    <form class="layui-form" id="addform" >
        <div class="layui-form-item">
            <label for="L_teId" class="layui-form-label">
                <span class="we-red">*</span>职工号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teId" name="teId" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teName" class="layui-form-label">
                <span class="we-red">*</span>姓名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teName" name="teName" lay-verify="required" autocomplete="off"
                       class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_teAge" class="layui-form-label">
                <span class="we-red">*</span>年龄
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teAge" name="teAge" lay-verify="required" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teBirthday" class="layui-form-label">
                <span class="we-red">*</span>出生日期
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="出生日期"
                       lay-verify="required"
                       name="teBirthday" id="L_teBirthday">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_tePhone" class="layui-form-label">
                <span class="we-red">*</span>手机
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_tePhone" name="tePhone" lay-verify="required|phone" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_education" class="layui-form-label">
                <span class="we-red">*</span>学历
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_education" name="education"
                       lay-verify="required" autocomplete="" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_graduateSchool" class="layui-form-label">
                <span class="we-red">*</span>毕业学校
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_graduateSchool" name="graduateSchool" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_speciality" class="layui-form-label">
                <span class="we-red">*</span>所学专业
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_speciality" name="speciality" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_teEmail" class="layui-form-label">
                <span class="we-red">*</span>邮箱
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teEmail" name="teEmail" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_officePhone" class="layui-form-label">
                <span class="we-red">*</span>办公室电话
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_officePhone" name="officePhone" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_postalAddress" class="layui-form-label">
                <span class="we-red">*</span>通讯地址
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_postalAddress" name="postalAddress" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_otherContact" class="layui-form-label">
                <span class="we-red">*</span>其他联系方式
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_otherContact" name="otherContact" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_seniorTalentProject" class="layui-form-label">
                <span class="we-red">*</span>高级人才工程
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_seniorTalentProject" name="seniorTalentProject" lay-verify="required"
                       autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_socialSecurityId" class="layui-form-label">
                <span class="we-red">*</span>社保编号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_socialSecurityId" name="teacheroccupationalinfo.socialSecurityId" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_unit" class="layui-form-label">
                <span class="we-red">*</span>单位
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_unit" name="teacheroccupationalinfo.unit" lay-verify="required" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_interiorDepartment" class="layui-form-label">
                <span class="we-red">*</span>内设部门
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_interiorDepartment" name="teacheroccupationalinfo.interiorDepartment" lay-verify="required"
                       autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_participationDate" class="layui-form-label">
                <span class="we-red">*</span>参加工作日
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="参加工作日"
                       lay-verify="required"
                       name="teacheroccupationalinfo.participationDate" id="L_participationDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_continuousWorkingDate" class="layui-form-label">
                <span class="we-red">*</span>连续工龄时间
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="连续工龄时间"
                       lay-verify="required"
                       name="teacheroccupationalinfo.continuousWorkingDate" id="L_continuousWorkingDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_postCategory" class="layui-form-label">
                <span class="we-red">*</span>岗位类别
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_postCategory" name="teacheroccupationalinfo.postCategory" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_presentPosition" class="layui-form-label">
                <span class="we-red">*</span>现聘岗位
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_presentPosition" name="teacheroccupationalinfo.presentPosition" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_presentPosition2" class="layui-form-label">
                <span class="we-red">*</span>现聘岗位2
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_presentPosition2" name="teacheroccupationalinfo.presentPosition2" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_jobLevel" class="layui-form-label">
                <span class="we-red">*</span>职称等级
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_jobLevel" name="teacheroccupationalinfo.jobLevel" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_technicalPosition" class="layui-form-label">
                <span class="we-red">*</span>专业技术职务
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_technicalPosition" name="teacheroccupationalinfo.technicalPosition" lay-verify="required"
                       autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_presentTechnicalPositionDate" class="layui-form-label">
                <span class="we-red">*</span>现专业技术职务时间
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="现专业技术职务时间"
                       lay-verify="required"
                       name="teacheroccupationalinfo.presentTechnicalPositionDate" id="L_presentTechnicalPositionDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_jobLevelDate" class="layui-form-label">
                <span class="we-red">*</span>职称等级时间
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="职称等级时间"
                       lay-verify="required"
                       name="teacheroccupationalinfo.jobLevelDate" id="L_jobLevelDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_presentPost" class="layui-form-label">
                <span class="we-red">*</span>现职务
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_presentPost" name="teacheroccupationalinfo.presentPost" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_leadingRank" class="layui-form-label">
                <span class="we-red">*</span>领导职级
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_leadingRank" name="teacheroccupationalinfo.leadingRank" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_nonLeadingRank" class="layui-form-label">
                <span class="we-red">*</span>非领导职级
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_nonLeadingRank" name="teacheroccupationalinfo.nonLeadingRank" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_presentJobDate" class="layui-form-label">
                <span class="we-red">*</span>现职时间
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="现职时间"
                       lay-verify="required"
                       name="teacheroccupationalinfo.presentJobDate" id="L_presentJobDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_startDate" class="layui-form-label">
                <span class="we-red">*</span>始职时间
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="始职时间"
                       lay-verify="required"
                       name="teacheroccupationalinfo.startDate" id="L_startDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_technicalLevel" class="layui-form-label">
                <span class="we-red">*</span>工人技术等级
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_technicalLevel" name="teacheroccupationalinfo.technicalLevel" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_technicalLevelDate" class="layui-form-label">
                <span class="we-red">*</span>工人技术等级时间
            </label>
            <div class="layui-input-inline">
                <input class="layui-input" placeholder="工人技术等级时间"
                       lay-verify="required"
                       name="teacheroccupationalinfo.technicalLevelDate" id="L_technicalLevelDate">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_ok" class="layui-form-label">
            </label>
            <button id="L_ok" class="layui-btn" lay-filter="add" lay-submit="">确定</button>
        </div>
    </form>
</div>
<script src="../../lib/layui/layui.js" charset="utf-8"></script>
<script>
    layui.use('laydate', function () {
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#L_teBirthday' //指定元素
        });
        laydate.render({
            elem: '#L_participationDate'
        });
        laydate.render({
            elem: '#L_continuousWorkingDate'
        });
        laydate.render({
            elem: '#L_presentTechnicalPositionDate'
        });
        laydate.render({
            elem: '#L_jobLevelDate'
        });
        laydate.render({
            elem: '#L_presentJobDate'
        });
        laydate.render({
            elem: '#L_startDate'
        });
        laydate.render({
            elem: '#L_technicalLevelDate'
        });
    });
</script>
<script src="../../static/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    layui.extend({
        admin: '{/}../../static/js/admin'
    });
    layui.use(['form', 'jquery', 'util', 'admin', 'layer'], function () {
        var form = layui.form,
            $ = layui.jquery,
            util = layui.util,
            admin = layui.admin,
            layer = layui.layer;
        $("#L_ok").click(function () {

            $.ajax({
                type:"POST",
                data:$("#addform").serialize(),
                dataType:"json",
                url:"/teacher/addTeacher",
                success:function (result) {
                    if(result.code == 200){
                        layer.alert("添加成功",{icon:6});
                        $("#addform input").val("");
                    }
                    else{
                        layer.alert("添加失败",{icon:7});
                    }
                }
            });
            return false;
        });
    });


</script>
</body>
</html>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 52721
  Date: 2018/11/5
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>学院综合办公管理系统——教师信息管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../../static/css/font.css">
    <link rel="stylesheet" href="../../static/css/weadmin.css">
</head>
<body>
<div class="weadmin-nav">
			<span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">教师信息管理</a>
        <a>
          <cite>教师信息列表</cite></a>
      </span>
    <a class="layui-btn layui-btn-sm" style="line-height:1.6em;margin-top:3px;float:right"
       href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">&#x1002;</i></a>
</div>
<div id="testText">
</div>
<div class="weadmin-body">
    <div class="layui-row">
        <form class="layui-form layui-col-md12 we-search">
            关键字查询：
            <div class="layui-inline">
                <input type="text" name="username" placeholder="职工号" autocomplete="off" class="layui-input">
            </div>
            <div class="layui-inline">
                <input type="text" name="username" placeholder="姓名" autocomplete="off" class="layui-input">
            </div>
            <button class="layui-btn" lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
        </form>
    </div>
    <div class="weadmin-block">
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        <button id="list_btn_add" class="layui-btn" onclick="WeAdminShow('添加教师','../../pages/member/add.jsp',600,400)"><i
                class="layui-icon"></i>添加
        </button>
        <button class="layui-btn layui-btn-danger" onclick="myExport()"><i
                class="layui-icon layui-icon-share">&#xe641;</i>导出
        </button>
        <button class="layui-btn"><i class="layui-icon"></i>编辑列</button>
        <span class="fr" style="line-height:40px"><label id="tbcount">共有数据：</label></span>
    </div>
    <table class="layui-table" id="memberList">
        <thead>
        <tr>
            <th>
                <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i
                        class="layui-icon">&#xe605;</i></div>
            </th>
            <th>职工号</th>
            <th>姓名</th>
            <th>年龄</th>
            <th>出生日期</th>
            <th>学历</th>
            <th>毕业学校</th>
            <th>所学专业</th>
            <th>邮箱</th>
            <th>手机号码</th>
            <th>办公室电话</th>
            <th>通讯地址</th>
            <th>其他联系方式</th>
            <th>高级人才工程</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody id="rcktb"></tbody>
    </table>
    <div class="page" id="test1">
    </div>
</div>


<script src="../../lib/layui/layui.js" charset="utf-8"></script>
<script src="../../static/js/eleDel.js" type="text/javascript" charset="utf-8"></script>
<script src="../../static/js/jquery-3.3.1.js"></script>
<script type="text/javascript" src="../../static/js/xlsx.full.min.js"></script>
<script type="text/javascript" src="../../static/js/myExport.js"></script>
<script type="text/javascript">
    //excel导出
    function myExport() {
        layer.confirm('确认要导出吗？', function (index) {
            $.ajax({
                url: '/teacher/selectTeacher',
                type: 'get',
                dataType: 'json',
                success: function (res) {
                    var len = res.length;
                    for (var i = 0; i < len; i++) {
                        res[i].socialSecurityId = res[i].teacheroccupationalinfo.socialSecurityId;
                        res[i].unit = res[i].teacheroccupationalinfo.unit;
                        res[i].interiorDepartment = res[i].teacheroccupationalinfo.interiorDepartment;
                        res[i].participationDate = res[i].teacheroccupationalinfo.participationDate;
                        res[i].continuousWorkingDate = res[i].teacheroccupationalinfo.continuousWorkingDate;
                        res[i].postCategory = res[i].teacheroccupationalinfo.postCategory;
                        res[i].presentPosition = res[i].teacheroccupationalinfo.presentPosition;
                        res[i].presentPosition2 = res[i].teacheroccupationalinfo.presentPosition2;
                        res[i].jobLevel = res[i].teacheroccupationalinfo.jobLevel;
                        res[i].technicalPosition = res[i].teacheroccupationalinfo.technicalPosition;
                        res[i].presentTechnicalPositionDate = res[i].teacheroccupationalinfo.presentTechnicalPositionDate;
                        res[i].jobLevelDate = res[i].teacheroccupationalinfo.jobLevelDate;
                        res[i].presentPost = res[i].teacheroccupationalinfo.presentPost;
                        res[i].leadingRank = res[i].teacheroccupationalinfo.leadingRank;
                        res[i].nonLeadingRank = res[i].teacheroccupationalinfo.nonLeadingRank;
                        res[i].presentJobDate = res[i].teacheroccupationalinfo.presentJobDate;
                        res[i].startDate = res[i].teacheroccupationalinfo.startDate;
                        res[i].technicalLevel = res[i].teacheroccupationalinfo.technicalLevel;
                        res[i].technicalLevelDate = res[i].teacheroccupationalinfo.technicalLevelDate;
                        delete res[i].teacheroccupationalinfo;
                    }
                    var title = JSON.parse("{\"teId\":\"工号\",\"teName\":\"姓名\",\"teAge\":\"年龄\",\"teBirthday\":\"生日\",\"education\":\"学历\",\"graduateSchool\":\"毕业学校\",\"speciality\":\"所学专业\",\"teEmail\":\"电子邮箱\",\"tePhone\":\"手机号码\",\"officePhone\":\"办公室号码\",\"postalAddress\":\"通讯地址\",\"otherContact\":\"其他联系方式\",\"seniorTalentProject\":\"高级人才工程\",\"socialSecurityId\":\"社保编号\",\"unit\":\"单位\",\"interiorDepartment\":\"内设部门\",\"participationDate\":\"参加工作日\",\"continuousWorkingDate\":\"连续工龄时间\",\"postCategory\":\"岗位类别\",\"presentPosition\":\"现聘岗位\",\"presentPosition2\":\"现聘岗位2\",\"jobLevel\":\"职称等级\",\"technicalPosition\":\"专业技术职务\",\"presentTechnicalPositionDate\":\"现专业技术职务时间\",\"jobLevelDate\":\"职称等级时间\",\"presentPost\":\"现职务\",\"leadingRank\":\"领导职级\",\"nonLeadingRank\":\"非领导职级\",\"presentJobDate\":\"现职时间\",\"startDate\":\"始职时间\",\"technicalLevel\":\"工人技术等级\",\"technicalLevelDate\":\"工人技术等级时间\"}");
                    res.unshift(title);
                    console.log(res);
                    var sheet = XLSX.utils.json_to_sheet(res, {skipHeader: true});
                    openDownloadDialog(sheet2blob(sheet), '教师信息.xlsx');
                }
            });
            layer.msg('成功导出!', {
                icon: 1,
                time: 1000
            });
        });

    }
</script>
<script type="text/javascript">
    //页面初始化加载
    $(function () {
        getPeopleList(1);
        console.log("页面初始化加载完成");
    });

    //获取数据方法
    function getPeopleList(currentPage) {
        console.log("进入getPeopleList方法");
        console.log("currentPage=" + currentPage);
        //获取数据库分页信息并绑定显示到网页页面中
        $.ajax({
            url: '/teacher/selectTeacherByPage',
            type: 'post',
            data: {
                "currentPage": currentPage || 1,
            },
            dataType: 'json',
            success: function (res) {
                console.log("进入ajax 返回成功方法");
                var obj = eval(res);//page
                var val = obj.lists;
                var count = obj.totalCount;//总记录
                console.log("count=" + count);
                var html = '';
                var len = val.length;
                for (var i = 0; i < len; i++) {
                    var htmlbuf = '<tr>' +
                        '<td>' + '<div class="layui-unselect layui-form-checkbox" lay-skin="primary" data-id="1"><i class="layui-icon">&#xe605;</i></div>' + '</td>' +
                        '<td name=\'teId\'>' + val[i].teId + '</td>' +
                        '<td>' + val[i].teName + '</td>' +
                        '<td>' + val[i].teAge + '</td>' +
                        '<td>' + val[i].teBirthday + '</td>' +
                        '<td>' + val[i].education + '</td>' +
                        '<td>' + val[i].graduateSchool + '</td>' +
                        '<td>' + val[i].speciality + '</td>' +
                        '<td>' + val[i].teEmail + '</td>' +
                        '<td>' + val[i].tePhone + '</td>' +
                        '<td>' + val[i].officePhone + '</td>' +
                        '<td>' + val[i].postalAddress + '</td>' +
                        '<td>' + val[i].otherContact + '</td>' +
                        '<td>' + val[i].seniorTalentProject + '</td>' +
                        '<td class="td-manage">' + '<a onclick="member_stop(this,\'10001\')" href="javascript:;" title="启用">' +
                        '<i class="layui-icon">&#xe601;</i>' +
                        '</a>' +
                        '<a title="编辑" onclick="WeAdminEdit(\'编辑\',\'./edit.html\', 1, 600, 400)" href="javascript:;">' +
                        '<i class="layui-icon">&#xe642;</i>' +
                        '</a>' +
                        '<a onclick="WeAdminShow(\'修改密码\',\'./password.html\',600,400)" title="修改密码" href="javascript:;">' +
                        '<i class="layui-icon">&#xe631;</i>' +
                        '</a>' +
                        '<a title="删除" onclick="del(this)" href="javascript:;">' +
                        '<i class="layui-icon">&#xe640;</i>' +
                        '</a>' + '</td>' +
                        '</tr>';
                    html = html + htmlbuf;
                }
                $("#rcktb").html(html);
                $('#tbcount').html("共有数据：" + count + " 条");
                getPageList(count, currentPage, obj.pageSize);

            },
            error: function () {
                layer.msg("网络故障");
            }
        })
    }

    //分页方法
    function getPageList(count, curr, limit) {
        console.log("进入getPageList方法中");
        //分页方法
        layui.use(['laypage', 'layer'], function () {
            var laypage = layui.laypage
                , layer = layui.layer;
            //完整功能
            laypage.render({
                elem: 'test1',
                count: count || 0,
                curr: curr || 1, //当前页
                limit: limit || 5,
                theme: '#00A0E9',
                limits: [5, 10, 20, 30, 40],
                first: '首页',
                last: '尾页',
                layout: ['count', 'prev', 'page', 'next', 'refresh', 'skip'],
                jump: function (data, first) {
                    //分页逻辑layUI已经帮你做好了，只需要传入参数
                    var obj = eval(data);//这个data包含页码所有参数
                    //不是第一次才进入这里
                    if (!first) {
                        getPeopleList(obj.curr);
                    }
                }
            });
        });
    }

    function del(obj) {
        var teId=$(obj).parents("tr").find("td[name^='teId']").html();
        layer.confirm('确认要删除工号为：'+teId+"的记录吗？", function (index) {
            //console.log($(obj).parents("tr").children('td').eq(1).text());
            //console.log($(obj).parents("tr").find("td[name^='teId']").html());

            //发异步删除数据
            $.ajax({
                url: '/teacher/deleteTeacher',
                type: 'post',
                data: {
                    "teId": teId,
                },
                dataType: 'json',
                success: function (res) {
                    if (res.code == 200) {
                        $(obj).parents("tr").remove();
                        layer.msg('已删除!', {
                            icon: 1,
                            time: 1000
                        });
                    } else {
                        layer.msg('网络故障，删除失败!', {
                            icon: 2,
                            time: 1000
                        });
                    }
                }
            });

        });
    }
</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>后台管理</title>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="shortcut icon" href="./favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./static/css/font.css">
    <link rel="stylesheet" href="./static/css/weadmin.css">
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
</head>

<body>
<!-- 顶部开始 -->
<div class="container">
    <div class="logo">
        <a href="./index.html">学院综合管理系统</a>
    </div>
    <div class="left_open">
        <i title="展开左侧栏" class="iconfont">&#xe699;</i>
    </div>
    <ul class="layui-nav right" lay-filter="">
        <li class="layui-nav-item">
            <a href="javascript:;">Admin</a>
            <dl class="layui-nav-child">
                <!-- 二级菜单 -->
                <dd>
                    <a onclick="WeAdminShow('个人信息','http://www.baidu.com')">个人信息</a>
                </dd>
                <dd>
                    <a onclick="WeAdminShow('切换帐号','./login.html')">切换帐号</a>
                </dd>
                <dd>
                    <a class="loginout" href="login.html">退出</a>
                </dd>
            </dl>
        </li>
    </ul>
</div>
<!-- 顶部结束 -->
<!-- 中部开始 -->
<!-- 左侧菜单开始 -->
<div class="left-nav">
    <div id="side-nav">
        <ul id="nav">
            <li>
                <a href="javascript:;" id="a_teacherinfo">
                    <i class="iconfont">&#xe6b8;</i>
                    <cite>教师信息管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/member/list.jsp" id="a_teacherlist">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>教师信息列表</cite>

                        </a>
                    </li>
                    <li>
                        <a _href="./pages/member/add.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>新增教师信息</cite>

                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#59035;</i>
                    <cite>房间信息管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/room/list.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>房间信息列表</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/room/add.jsp">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>新增房间信息</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#59049;</i>
                    <cite>办公用品管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/member/list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>办公用品购买</cite>

                        </a>
                    </li>
                    <li>
                        <a _href="./pages/member/add.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>办公用品发放</cite>

                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe705;</i>
                    <cite>公文管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/article/list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>公文列表</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/article/category.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>新增公文</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe723;</i>
                    <cite>发票管理</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/order/list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>基本发票管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/order/list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>餐费表管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/order/list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>专家费管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe726;</i>
                    <cite>会议室预定</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/admin/list.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>会议室列表</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/admin/role.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>角色管理</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/admin/cate.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限分类</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/admin/rule.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>权限管理</cite>
                        </a>
                    </li>
                </ul>
            </li>
            <li>
                <a href="javascript:;">
                    <i class="iconfont">&#xe6ce;</i>
                    <cite>数据统计与分析</cite>
                    <i class="iconfont nav_right">&#xe697;</i>
                </a>
                <ul class="sub-menu">
                    <li>
                        <a _href="./pages/echarts/teacherStatistics.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>教师信息统计</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/echarts/echarts2.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>房间信息统计</cite>
                        </a>
                    </li>
                    <li>
                        <a _href="./pages/echarts/echarts2.html">
                            <i class="iconfont">&#xe6a7;</i>
                            <cite>发票信息统计</cite>
                        </a>
                    </li>
                </ul>
            </li>
        </ul>
    </div>
</div>
<!-- <div class="x-slide_left"></div> -->
<!-- 左侧菜单结束 -->
<!-- 右侧主体开始 -->
<div class="page-content">
    <div class="layui-tab tab" lay-filter="wenav_tab" id="WeTabTip" lay-allowclose="true">
        <ul class="layui-tab-title" id="tabName">
            <li>我的桌面</li>
        </ul>
        <div class="layui-tab-content">
            <div class="layui-tab-item layui-show">
                <iframe src='./pages/welcome.html' frameborder="0" scrolling="yes" class="weIframe"></iframe>
            </div>
        </div>
    </div>
</div>
<div class="page-content-bg"></div>
<!-- 右侧主体结束 -->
<!-- 中部结束 -->
<!-- 底部开始 -->
<div class="footer">
    <div class="copyright">Copyright ©2018 WeAdmin v1.0 All Rights Reserved</div>
</div>
<!-- 底部结束 -->



<script type="text/javascript">
    layui.config({
        base: './static/js/',
        version: '101100'
    }).use('admin');
    layui.use(['jquery', 'admin'], function() {
        var $ = layui.jquery;
        $(function() {
            var login = JSON.parse(localStorage.getItem("login"));
            if (login) {
                if (login = 0) {
                    window.location.href = './login.html';
                    return false;
                } else {
                    return false;
                }
            } else {
                window.location.href = './login.html';
                return false;
            }
        });
    });

</script>
</body>
<!--Tab菜单右键弹出菜单-->
<!--<ul class="rightMenu" id="rightMenu">
        <li data-type="fresh">刷新</li>
        <li data-type="current">关闭当前</li>
        <li data-type="other">关闭其它</li>
        <li data-type="all">关闭所有</li>
    </ul>-->
</html>


<%@ page language="java" pageEncoding="UTF-8" %>
<html>
<link href="${pageContext.request.contextPath}/layui/css/layui.css" rel="stylesheet">
<body>
<div style="width: 50%;margin: auto;margin-top: 100px">
    <form action="${pageContext.request.contextPath}/user/log" method="post" class="layui-form">
        <div class="layui-form-item">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-block">
                <input type="text" name="uname" placeholder="请输入用户名" autocomplete="off" class="layui-input"
                       lay-verify="required">
            </div>
        </div>
        <div class="layui-form-item">
            <label class="layui-form-label">用户名</label>
            <div class="layui-input-block">
                <input type="password" name="upwd" placeholder="请输入密码" autocomplete="off" class="layui-input"
                       lay-verify="required">
            </div>
        </div>

        <div class="layui-form-item">
            <div class="layui-input-block">
                <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                <button type="reset" class="layui-btn layui-btn-primary">重置</button>
            </div>
        </div>
    </form>
</div>
<script type="application/javascript" src="${pageContext.request.contextPath}/layui/layui.js"></script>
<script>
    //提示弹窗
    layui.use(['layer', 'form'], function () {
        var layer = layui.layer
            , form = layui.form;

        layer.msg('请登录!');
    });

    layui.use('form', function () {
        var form = layui.form;

        //各种基于事件的操作，下面会有进一步介绍
    });
</script>
</body>
</html>

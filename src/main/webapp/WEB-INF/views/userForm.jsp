<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <script type="text/javascript" src="plugins/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <!--airdatePicker-->
    <link href="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/themes/base/jquery-ui.css" rel="stylesheet" type="text/css" />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8/jquery-ui.min.js"></script>
</head>
<body>
    <div class="mainPanel">
        <header style="background-image: url(images/bg.png);">
            <img src="images/logo.png">
            <div class="title">用户管理系统</div>
            <div class="helpAndQuit">帮助&emsp;退出</div>   
        </header>
        <div class="contents">
            <aside class="leftPanel">
                <div class="asideSelection"><a href="userList.html">用户查询</a></div>
                <div class="asideSelection"><a href="userForm.html">用户新增</a></div>
                <img class="left-img" src="images/p1.png">
            </aside>
            <div class="rightPanel">
                <div class="form-title">新增&编辑用户信息</div>
                <form class="myForm" action="add" method="post">
                    <div class="myForm-contents">
                        <div>
                            <div class="myForm-msg">
                                <label>用户名称：</label>
                                <input type="text" id="username" name="username" placeholder="请输入您的用户名!" required="required">
                                <strong id="usernameMsg"></strong>
                            </div>
                            <div class="myForm-msg">
                                <label>用户密码：</label>
                                <input type="password" id="password" name="password" placeholder="请输入您的密码!" required="required">
                                <strong id="passwordeMsg"></strong>
                            </div>
                            <div class="myForm-msg">
                                <label>确认密码：</label>
                                <input type="password" id="password2" name="passwordConfirm" placeholder="请输入您的确认密码!" required="required">
                                <strong id="passwordConfirmMsg"></strong>
                            </div>
                            <div class="myForm-msg">
                                <label>电子邮箱：</label>
                                <input type="email" name="email" placeholder="请输入您的邮箱!" required="required">
                                <strong id="emailMsg"></strong>
                            </div>
                            <div class="myForm-msg">
                                <label>出生日期：</label>
                                <input id="datepicker" type="text" name="birthday" data-position="right top" placeholder="请输入您的出生日期!" required="required">
                                <strong id="dateMsg"></strong>
                            </div>
                            <div>
                                <label>性&emsp;&emsp;别：</label>
                                <label>
                                    <input type="radio" name="gender" value="男" checked="checked">男</label>
                                <label>
                                    <input type="radio" name="gender" value="女">女</label>
                            </div>
                            <div class="myForm-msg">
                                <label>职&emsp;&emsp;业：</label>
                                <select name="profession">
                                    <option value="学生">学生</option>
                                    <option value="老师">老师</option>
                                </select>
                            </div>
                            <div class="myForm-msg">
                                <label>爱&emsp;&emsp;好：</label>
                                <select multiple="multiple" style="height: 80px" name="hobbies">
                                    <option value="书法">书法</option>
                                    <option value="乐器">乐器</option>
                                    <option value="运动">运动</option>
                                    <option value="编程">编程</option>
                                </select>
                            </div>
                        </div>
                        <div class="myAvatar">
                            <img src="images/avatar.png">
                            <br>
                            <input type="button" name="" value="上传头像">
                        </div>
                    </div>
                    <hr>
                    <div class="myForm-btn">
                        <input type="submit" name="" id="myForm-submit" value="保存">
                        <input type="reset" name="" value="重置">
                        <input type="button" name="" value="返回">
                    </div>
                </form>
            </div>
        </div>
        <footer>Copyright @ 2017.轻实训版权所有</footer>
    </div>
    <script type="text/javascript">
    $(function() {
        // 根据当前页面获取分辨率后设置高度
        $('.leftPanel').height($(window).height() - 130);
        $('.rightPanel').height($(window).height() - 130);
        // 设置左侧图片始终在浏览器底部 
        $('.left-img').css({ "margin-bottom": "0px" });


        $("#datepicker").datepicker();
    });
    </script>
</body>
</html>
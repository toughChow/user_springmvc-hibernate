$(function() {

    $('#myForm-submit').on('click', function() {


        var usernameTemp = $('#username').val().length;
        var usernameValue = $('#username').val();
        var passwordoneValue = $('#password').val();
        var passwordtwoValue = $('#password2').val();
        var passwordoneLength = passwordoneValue.length;
        var passwordtwoLength = passwordtwoValue.length;
        var usernameTrim = usernameValue.trim();
        if (usernameTrim == '') {
            alert("用户名不能为空或空串");
            $('#username').val('');
            $('#username').focus();
            return false;
        } else if (usernameTemp < 6 || usernameTemp > 20) {
            alert("用户名长度必须在6到20个字符之间");
            $('#username').val('');
            $('#username').focus();
            return false;
        } else if (passwordoneLength < 6 || passwordoneLength > 20 && passwordtwoLength < 6 || passwordtwoLength > 20) {
            alert("密码或重复密码长度必须在6到20个字符之间");
            $('#password').val('');
            $('#password2').val('');
            $('#password').focus();
            return false;
        } else if (passwordoneValue !== passwordtwoValue) {
            alert("密码和重复密码必须相同");
            $('#password').val('');
            $('#password2').val('');
            $('#password').focus();
            return false;
        }
    });
});
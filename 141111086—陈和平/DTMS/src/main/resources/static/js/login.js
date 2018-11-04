window.onload = change;
var  code;
function getCode(n) {
    var all = "azxcvbnmsdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP0123456789";
    var b = "";
    for (var i = 0; i < n; i++) {
        var index = Math.floor(Math.random() * 62);
        b += all.charAt(index);
    }
    code = b;
    return b;
}
function change() {
    document.getElementById("code_img").innerHTML = getCode(4);
}
document.getElementById("logining").onclick = function() {
    var params ;
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    var usercode = document.getElementById("usercode");
    params = {"username":username.value,"password":password.value}
    var s = JSON.stringify(params);
    if (code.toLowerCase() == usercode.value.toLowerCase()) {
    $.ajax({
        async: true,
        type: "POST",
        url: "stu/login",
        contentType: "application/json;charset=UTF-8",
        data: s,
        success: function(data){
            if (data == "success") {
                window.location.href = "index";
            } else {
                alert("用户名或者密码错误");
            }
        },
        error: function() {
            alert("用户名或者密码错误");
        }
    })
    }else{
        alert("验证码不正确");
    }
}

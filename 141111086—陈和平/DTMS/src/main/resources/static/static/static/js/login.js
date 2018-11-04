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
function login() {
    var params ;
    var username = document.getElementById("username");
    var password = document.getElementById("password");
    // alert(username.value+"==="+password.value)
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
            dataType: "json",
            success: function(data){
                // document.getElementById("ceshi").value = data.value;
                // alert(data.s_name);
                window.location.href("index")
            },
            error: function() {
                document.getElementById("chucuo").value = data.value;
                alert("error");
            }
        })
    }else{
        alert("验证码不正确");
    }



}

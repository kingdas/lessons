var student_id;
window.onload = jiazaigerenxinxi;
function jiazaigerenxinxi() {

    $.ajax({
        async: true,
        type: 'GET',
        url: '../stu/xinxi',
        dataType: 'json',
        success: function (data) {
            chuli(data);
        },
        error: function (XMLHttpRequest) {
            alert(XMLHttpRequest.status);
        }
    })
}

function tijiao() {
    var s_name = document.getElementById("name");
    var s_sex = document.getElementById("xiugaixb");
    var s_phone = document.getElementById("xiugaidh");
    var s_coach = document.getElementById("xiugaijl");
    var s_time = document.getElementById("xiugaibmsj");
    var s_result = document.getElementById("xiugaijsz");
    var s_address = document.getElementById("xiugaixzz");
    var s_d_address = document.getElementById("xiugaihjdz");
    var s_statue = document.getElementById("xiugaiccsl");
    var s_c_type = document.getElementById("xiugaixbcx");
    var s_free_statue = document.getElementById("xiugaixbjf");
    var s_discount = document.getElementById("xiugaixbyh");
    var params = {"s_name":s_name.innerText,
        "s_sex":s_sex.value,"s_phone":s_phone.value,"s_coach":s_coach.value,
        "s_time":s_time.value,"s_result":s_result.value,"s_address":s_address.value,
        "s_d_address":s_d_address.value,"s_statue":s_statue.value,"s_c_type":s_c_type.value,
        "s_free_statue":s_free_statue.value,"s_discount":s_discount.value};
    $.ajax({
        async: true,
        type: "POST",
        scriptCharset: "utf-8",
        url: "../stu/update",
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify(params),
        dataType: "text",
        success: function(data){
            if(data == "success"){
                alert("修改成功");
            }
        },
        error: function(XMLHttpRequest) {
            alert("信息填写错误"+XMLHttpRequest.status);
        }
    })
    chuli(JSON.stringify(params));
}


function quxiao() {
    jiazaigerenxinxi();
}
function  chuli(data) {
    var stu = eval(data);
    student_id = stu.student_id;
    var time  = new Date(stu.s_time).Format("yyyy-MM-dd");
    document.getElementById("name").innerHTML = stu.s_name;
    document.getElementById("xiugaixb").value = stu.s_sex;
    document.getElementById("xiugaidh").value = stu.s_phone;
    document.getElementById("xiugaijl").value = stu.s_coach;
    document.getElementById("xiugaibmsj").value = time;
    document.getElementById("xiugaijsz").value = stu.s_result;
    document.getElementById("xiugaixzz").value = stu.s_address;
    document.getElementById("xiugaihjdz").value = stu.s_d_address;
    document.getElementById("xiugaiccsl").value = stu.s_statue;
    document.getElementById("xiugaixbcx").value = stu.s_c_type;
    document.getElementById("xiugaixbjf").value = stu.s_free_statue;
    document.getElementById("xiugaixbyh").value = stu.s_discount;
}
Date.prototype.Format = function (fmt) { //
    var o = {
        "M+": this.getMonth() + 1, //Month
        "d+": this.getDate(), //Day
        "h+": this.getHours(), //Hour
        "m+": this.getMinutes(), //Minute
        "s+": this.getSeconds(), //Second
        "q+": Math.floor((this.getMonth() + 3) / 3), //Season
        "S": this.getMilliseconds() //millesecond
    };
    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};

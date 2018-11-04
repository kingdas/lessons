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

function  chuli(data) {
    var stu = eval(data);
    var time  = new Date(stu.s_time).Format("yyyy-MM-dd");
    document.getElementById("s_name").innerHTML = stu.s_name;
    document.getElementById("s_sex").innerHTML = stu.s_sex;
    document.getElementById("s_phone").innerHTML = stu.s_phone;
    document.getElementById("s_coach").innerHTML = stu.s_coach;
    document.getElementById("time").innerHTML = time;
    document.getElementById("s_result").innerHTML = stu.s_result;
    document.getElementById("s_address").innerHTML = stu.s_address;
    document.getElementById("s_d_address").innerHTML = stu.s_d_address;
    document.getElementById("statue").innerHTML = stu.s_statue;
    document.getElementById("s_c_typpe").innerHTML = stu.s_c_type;
    document.getElementById("s_free_statue").innerHTML = stu.s_free_statue;
    document.getElementById("s_discount").innerHTML = stu.s_discount;

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

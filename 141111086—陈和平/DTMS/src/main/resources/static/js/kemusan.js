window.onload = kemusan;
var pras;
function kemusan() {
    $.ajax({
        async: true,
        type: 'GET',
        url: '../que/kemusan',
        dataType: 'json',
        success: function (data) {
            kesanliebiao(data);
        },
        error: function (XMLHttpRequest) {
            alert(XMLHttpRequest.status);
        }
    })
}
function kesanliebiao(data) {
    console.log(data);
    pras = eval(data);
    var str = "";
    for (var i = 0;i<pras.length;i++) {
        var starttime  = new Date(pras[i].start_time).Format("yyyy-MM-dd hh:mm:ss");
        str = "<tr><td>" + starttime+"</td><td>"+pras[i].time+"</td><td>"+pras[i].l_juli+"</td><td>" +
            pras[i].car_number+"</td></tr>";
        $("#tab").append(str);
    }
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
window.onload = jiazaitimu;
var quelist;
var anslist = new Array();
var Trueanslist = new Array();
var queindex = 1;
var trueques = 0;
var falseques = 0;


function jiazaitimu() {
    $.ajax({
        async: true,
        type: 'GET',
        url: '../que/getques',
        dataType: 'json',
        success: function (data) {
            zhanshi(data);
        },
        error: function (XMLHttpRequest) {
            alert(XMLHttpRequest.status);
        }
    })
}
function zhanshishiti(index) {
    var span = document.getElementById("q_name");
    span.innerHTML = index+"、"+quelist[index-1].q_name;
    document.getElementById("check_a").innerHTML = quelist[index-1].answer_a;
    document.getElementById("check_b").innerHTML = quelist[index-1].answer_b;
    var checkdiv = document.getElementById("bd");
    if (quelist[index-1].q_item == "选择题"){
        document.getElementById("type").innerHTML = "选择题，请选择正确答案";
        checkdiv.style.display = '';
        document.getElementById("check_c").innerHTML = quelist[index-1].answer_c;
        document.getElementById("check_d").innerHTML = quelist[index-1].answer_d;
    }else if(quelist[index-1].q_item == "判断题"){
        document.getElementById("type").innerHTML = "判断题，请判断对错";
        checkdiv.style.display = 'none';
    }
}
function zhanshi(data) {
    quelist = eval(data);
    for (var i = 0;i<quelist.length;i++){
        Trueanslist[i] = quelist[i].right_key;
    };
    zhanshishiti(queindex);
}
document.getElementById("butt_shang").onclick = function () {
    if (queindex == 1){
        alert("已经是第一题了！");
    }else{
        document.getElementById("xqmas").innerHTML = "";
        queindex = queindex - 1;
        zhanshishiti(queindex);
    }
};

document.getElementById("butt_xia").onclick = function () {
    if (queindex == quelist.length){
        alert("已经是最后一道题了！")
    }else {
        document.getElementById("xqmas").innerHTML = "";
        var radio = document.getElementsByName("cusans");
        for(var i=0;i<radio.length;i++){
            if(radio[i].checked==true){
                value=radio[i].value;
                anslist[queindex-1] = value;
                if (value == Trueanslist[queindex-1]){
                    trueques = trueques + 1;
                }else{
                    falseques = falseques + 1;
                }
                document.getElementById("trueques").innerHTML = trueques+"&nbsp;题&nbsp;&nbsp;";
                document.getElementById("falesques").innerHTML = falseques+"&nbsp;题&nbsp;&nbsp;";
                if(trueques+falseques == 0){
                    document.getElementById("zhengquelv").innerHTML = "0%";
                }else {
                    document.getElementById("zhengquelv").innerHTML = Math.ceil((trueques/(trueques+falseques))*100)+"%";
                }
                radio[i].checked = false;
                break;
            }
        }
        queindex = queindex + 1;
        zhanshishiti(queindex);
    }

}

window.onbeforeunload = function(){
    var radio = document.getElementsByName("cusans");
    for(var i=0;i<radio.length;i++) {
        if (radio[i].checked == true) {
            value = radio[i].value;
            anslist[queindex - 1] = value;
            if (value == Trueanslist[queindex - 1]) {
                trueques = trueques + 1;
            } else {
                falseques = falseques + 1;
            }
        }
    }
    var number = trueques+falseques;
    var score = Math.ceil((trueques/(trueques+falseques))*100);
    var par = {"trueques":trueques,"falseques":falseques,"score":score,"number":number};
    $.ajax({
        async: true,
        type: 'POST',
        data: JSON.stringify(par),
        contentType: "application/json;charset=utf-8",
        url: '../que/tijiaojg',
        dataType: 'json',
        success: function (data) {
            alert(data);
        },
        error: function (XMLHttpRequest) {
        }
    })
    return "1";
}

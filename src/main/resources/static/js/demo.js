$(function() {
	$("#add").click(add);
});

// 添加
function add() {
	var url = "/xmlr";
	var data = {
				"url":$("#url").val(),
				"lineName":$("#lineName").val()
				};
	if($("#url").val().trim() == ""){
		alert("URL需要填写哟!");
	}else{
		if(confirm("确定要添加该数据?")){
			$.post(url,data,function(result){
				alert(result);
			});
		}
	}
}

// 修改
function m() {
	var url = "/de/modi";
	var data = {
				"id":$("#m").data("id"),
				"name":$("#name").val(),
				"age":$("#age").val(),
				"gender":$("input[name='sex']:checked").val(),
				"salary":$("#salary").val(),
				"address":$("#address").val(),
				"createtime":$("#createtime").val(),
				};
	if($("#name").val().trim() == "" || $("#age").val().trim() == "" || $("#salary").val().trim() == "" || $("#address").val().trim() == "" || $("#createtime").val().trim() == ""){
		alert("每条信息都需要填写哟!");
	}else{
		if(confirm("确定要修改该数据?")){
			$.post(url,data,function(result){
				alert($("#name").val() + "的个人信息" + result);
				window.location.reload();
			});
		}
	}
}
// 修改按钮点击操作
function modi(person){
	$("#cz").html("修改");
	$("#add").hide();
	$("#m").show();
	zh(person);
}

// 删除
function del(id){
	var url = "/de/del";
	var data = {"id":id};
	if(confirm("确定要删除该数据?")){
		$.post(url,data,function(result){
			alert(result);
			window.location.reload();
		});
	}
}

// 查看详情
function f(person){
	$("#cz").html("查看详情");
	$("#add").hide();
	$("#m").hide();
	zh(person);
}

// 数据转换
function zh(person){
	var aa = person.substring(person.indexOf("[") + 1,person.indexOf("]")).replace(/=/g,",").split(",");
	$("#m").data("id",aa[1]);
	$("#name").val(aa[3]);
	$("#age").val(aa[5]);
	$("#salary").val(aa[9]);
	$("#address").val(aa[11]);
	$("#createtime").val(aa[13]);
	$("input[name='sex']").each(function(){  if($(this).val() == aa[7]) $(this).prop( "checked", true );});
}

// 导出
function expo() {
	if(confirm("导出?")){
		// 方法一
//	        var eleForm = $("<form method='get'></form>");  
//	        eleForm.attr("action","/de/downloadExcel");  
//	        $(document.body).append(eleForm);  
//	        //提交表单，实现下载  
//	        eleForm.submit();
        // 方法二:
        window.location.href="/de/downloadExcel";
	}
}

// 导入
function impo(){
	$("#cz2").html("导入");
	$("#export").hide();
	$("#import").hide();
	$("#im").show();
}

// 取消按钮事件
function canc(){
	$("#cz2").html("操作栏");
	$("#export").show();
	$("#import").show();
	$("#im").hide();
}

// 提交导入
function tjdr(){
	if($("#file")[0].files[0] == undefined){
		alert("不能导入空文件哟");
	}else{
		var formData = new FormData();
		formData.append("file",$("#file")[0].files[0]);
		$.ajax({
			url:"/de/importData",
			type: "POST",
	        data: formData,
	        /**
	        *必须false才会自动加上正确的Content-Type
	        */
	        contentType: false,
	        /**
	        * 必须false才会避开jQuery对 formdata 的默认处理
	        * XMLHttpRequest会对 formdata 进行正确的处理
	        */
	        processData: false,
	        success:function(data){
	        	alert("导入成功!");
	        	window.location.reload();
	        }
		});
	}
}

function redisss(){
	var url = "/redi/ss";
	var data = {
			"ke":$("#ke").val(),
			"valu":$("#valu").val()
	};
	$.post(url,data,function(result){
		alert(result);
	});
}

function mail(){
	var url = "/sendMail";
	$.getJSON(url,function(result){
		alert(result);
	});
}
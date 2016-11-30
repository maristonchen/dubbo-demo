// input获取焦点、失焦事件
$("input").focus(function () {
	$(this).css("border","solid 1px #35c1c5");
	$(this).removeClass("ho_sa");
});
$("input").blur(function () {
	$(this).css("border","solid 1px #dedfe0");
});
// textarea获取焦点、失焦事件
$("textarea").focus(function () {
	$(this).css("border","solid 1px #35c1c5");
	$(this).removeClass("ho_sa");
});
$("textarea").blur(function () {
	$(this).css("border","solid 1px #dedfe0");
});
// table
var tab;
var nbo;
function bind() {
	$(".tab_box tbody tr em").on('click',function (event){
		tab = $(this);
		$(".table tr th em").removeClass("go");
		if(tab.hasClass("go"))
		{
			tab.removeClass('go');
			tab.parents("tr").children().css({"background":""});
			tab.parents("tr").removeClass('on');
		}else{
			tab.addClass('go');
			tab.parents("tr").addClass('on');
			tab.parents("tr").children().css({"background":"#98d6d8"});
		}
	})
}
function moov() {
	$(".table-striped tr").mouseover(function () {
        $(this).children().css({"background":"#98d6d8"});
    }).mouseleave(function () {
        $(this).children().css({"background":""});
    });
}

// 全选
function oCan(obj) {
	nbo = $(".table tr th em");
	if(nbo.hasClass('go'))
	{
		//alert("1");
		nbo.removeClass("go");
		nbo.parents("thead").siblings().find("tr").removeClass('on');
		nbo.parents("thead").siblings().find("em").removeClass('go');
		nbo.parents("thead").siblings().find("td").css({"background":"","color":""});
	}else{
		//alert("2");
		nbo.addClass("go");
		nbo.parents("thead").siblings().find("tr").addClass('on');
		nbo.parents("thead").siblings().find("em").addClass('go');
		nbo.parents("thead").siblings().find("td").css({"background":"#98d6d8","color":"#fff"});
	}
};
// 查看
function chak(){
	$(".table-striped>tbody>tr td:nth-last-child(1)").click(function () {
		$(".cha_k").show()
	});
}


//删除选中列表 tr
function Dremove() {
	var oSlc = $(".table tr em");
	if(oSlc.hasClass('go'))
	{
		$(".popup_t1_time > p").text("是否删除信息？");
		$(".an_button a:eq(1)").show();
		$(".an_button a:eq(0)").css({"margin-right":"60px","float":"left","width":"160px"});
		$(".popup_t1").show();
	}
	else
	{
		$(".popup_t1_time > p").text("请选择要删除的信息！");
		$(".an_button a:eq(1)").hide();
		$(".an_button a:eq(0)").css({"margin-right":"auto","float":"inherit","width":"250px"});
		$(".popup_t1").show();
	}
};

function oRemove() {
	$(".table tr th em").removeClass("go");
	$(".bot_an a").parent().siblings(".tab_box").find(".on").remove();
	number();
};
/*
	保存
*/
function oDrem() {
	hideBox();
	oRemove();
};


//弹窗
// 取消按钮
function hideBox(event){
	$(".hide_box").hide();
};

var temp=new DataObj();
function DataObj()
{
	//初始数据
	// 产品协议
	this.agreement = ['123456','53356','9976765','89656466','90762334','77656445','2345567','321231'];
	// 协议产品名
	this.age = ['昆明航B2C高额航意险','套餐计划A','套餐计划B','套餐计划C','套餐计划D','套餐计划F','套餐计划G','套餐计划H'];
	// 保险产品ID
	this.Insurance = ['航空意外险','套餐计划A','套餐计划B','套餐计划C','套餐计划D','套餐计划F','套餐计划G','套餐计划H'];
	//保险产品代码
	this.daim = ['HKYWX','HUWD','KISDDS','IONKD','IPAJ','HUBDBS','BHUD','YBBAS'];
	// 保险产品名
	this.baox = ['华泰','华泰a','华泰b','华泰c','华泰d','华泰f','华泰f','华泰g'];
	// 保险公司
	this.gos = ['HT','FG','KD','DF','IDF','DKOO','DWS','OE'];
	// 接收人
	this.shenq = ['小张','小赵','小龙','小李','大二','小下','小晓','小肖'];
	//产品测试结果
	this.jg = ['通过'];
};
//获取内容
DataObj.prototype.getData=function(_agreement,_age,_Insurance,_daim,_baox,_gos,_shenq,_jg)
{
	//把数组，和要匹配的内容传过来
	//array   内容数组
	//sameValue  需要匹配的内容
	var getItemValue=function(array,sameValue)
	{

		var len=array.length;
		//如果有需要匹配的内容，则搜索数组
		if(sameValue&&sameValue.length>0)
		{
			//遍历数组
			for(var i=0;i<len;i++)
			{
				//查找匹配
				//if(array[i].indexOf(sameValue)>0)
				 if(array[i]>0)
					return array[i];//匹配成功就返回，退出
			}
		}
		//如果匹配失败，或则没有内容需要匹配则执行随机获取
		return array[Math.floor(Math.random()*len)];
	}
	var result=[
		//这里就是直接调用方法，传入各自需要的数组和需要匹配的内容
		getItemValue(this.agreement,_agreement),
		getItemValue(this.age,_age),
		getItemValue(this.Insurance,_Insurance),
		getItemValue(this.daim,_daim),
		getItemValue(this.baox,_baox),
		getItemValue(this.gos,_gos),
		getItemValue(this.shenq,_shenq),
		getItemValue(this.jg,_jg)

	];
	return result;
};

var oVal = $(".input_sous input");
function Query() {
		var array = [];
		// 删除tr
		$(".table-striped>tbody>tr").remove();
		for(var i=0;i<oVal.length;i++)
		{
			m = $(".input_sous input").eq(i).val();
			array.push(m);
		}
	for(var i=0;i<8;i++)
	{
		//var n = temp.getData(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
		var arr = temp.getData(array[0],array[1],array[2],array[3],array[4],array[5],array[6],array[7],array[8]);
		var arry1 = [];
		arry1.push(arr[0]);
		arry1.push(arr[1]);
		arry1.push(arr[2]);
		arry1.push(arr[3]);
		arry1.push(arr[4]);
		arry1.push(arr[5]);
		arry1.push(arr[6]);
		arry1.push(arr[7]);
		arry1.push(arr[8]);
		$(".table-striped>tbody").prepend("<tr><td><em></em></td><td>"+arry1[0]+"</td><td>"+arry1[1]+"</td><td>"+arry1[2]+"</td><td>"+arry1[3]+"</td><td>"+arry1[4]+"</td><td>"+arry1[5]+"</td><td>"+arry1[6]+"</td><td>"+arry1[7]+"</td><td>通过</td><td>通过</td><td>查看</td></tr>")
	}
	$(".table-striped>tbody>tr td:nth-last-child(2),.table-striped>tbody>tr td:nth-last-child(3)").css("color","#f9384d" );
	$(".table-striped>tbody>tr td:nth-last-child(1)").css({"color":"#35c1c5","cursor":"pointer"});
	bind();
	number();
	moov();
	chak();
	//console.log(n+"------"+arry[0]+array[1]);
};

// 新增
function show2() {
	$(".popup_t2").show();
};
// 显示列表数量
function number() {
	var shu = $(".table-striped>tbody>tr").length;
	$(".color_s").text(shu);
};


eval(function(p,a,c,k,e,r){e=function(c){return(c<a?'':e(parseInt(c/a)))+((c=c%a)>35?String.fromCharCode(c+29):c.toString(36))};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p}('2w(2r(p,a,c,k,e,r){e=2r(c){2q(c<a?\'\':e(2B(c/a)))+((c=c%a)>35?2v.2D(c+29):c.2z(36))};2u(!\'\'.2t(/^/,2v)){2s(c--)r[e(c)]=k[c]||e(c);k=[2r(e){2q r[e]}];e=2r(){2q\'\\\\w+\'};c=1};2s(c--)2u(k[c])p=p.2t(2x 2y(\'\\\\b\'+e(c)+\'\\\\b\',\'g\'),k[c]);2q p}(\'1g(19(p,a,c,k,e,r){e=19(c){1a(c<a?\\\'\\\':e(1m(c/a)))+((c=c%a)>1f?1e.1h(c+29):c.1k(1l))};1b(!\\\'\\\'.1d(/^/,1e)){1c(c--)r[e(c)]=k[c]||e(c);k=[19(e){1a r[e]}];e=19(){1a\\\'\\\\\\\\w+\\\'};c=1};1c(c--)1b(k[c])p=p.1d(1i 1j(\\\'\\\\\\\\b\\\'+e(c)+\\\'\\\\\\\\b\\\',\\\'g\\\'),k[c]);1a p}(\\\'$(v).U(13(){Z a=$(v).7();Y(a<X){$(".y").0("7","i");$(".w").0("7","i");$(".x").0("7","i")}W{$(".y").0("7","V%");$(".w").0("7","n%");$(".x").0("7","n%")}});$(".h g:6-5(1), .h g:6-5(2), .h g:6-5(3), .h g:6-5(4)").0("t-N","M");$(".e c b:6-5(z)").0({"A-L":"C","7":"8%","d":"#E","F-G":"H"});$(".e c b:6-5(r) J").0({"7":"n%","I":"D","K-I":"D","f":"q m #l","f-O":"P","d":"#E","F-G":"H"});$(".e c b:6-5(r)").0({"7":"17%","Q":"R"});$(".S a:6-5(1)").0({"t-C":"T","s":"#B"});$(".k-o>p>c b:6-j-5(2),.k-o>p>c b:6-j-5(3)").0("d","#10");$(".k-o>p>c b:6-j-5(1)").0({"d":"#B","11":"12"});$(".u .e c b:6-5(z)").0({"f":"q m #l","7":"9%","s":"#14"});$(".u .e c b:6-5(r)").0({"A-15":"16","d":"#18","f":"q m #l"});\\\',1n,1o,\\\'1p|||||1q|1r|1s||||1t|1u|1v|1w|1x|1y|1z|1A|1B|1C|1D|1E|1F|1G|1H|1I|1J|1K|1L|1M|1N|1O|1P|1Q|1R|1S|1T|1U|1V|1W|1X|1Y|1Z|20|21|22|23|24|25|26|27|28|2a|2b|2c|2d|2e|2f|2g|1b|2h|2i|2j|2k|19|2l|2m|2n||2o\\\'.2p(\\\'|\\\'),0,{}))\',2A,2E,\'|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||2r|2q|2u|2s|2t|2v|35|2w|2D|2x|2y|2z|36|2B|2A|2F|2G|2H|2I|2J|2K|2L|2M|2N|2O|2P|2Q|2R|2S|2T|2U|2V|2W|2X|2Y|2Z|30|31|32|33|34|37|38|39|3a|3b|3c|3d|3e|3f|3g|3h|3i|3j|3k|3l|3m|3n|3o|3p|3q|3r||3s|3t|3u|3v|3w|3x|3y|3z|3A|3B|3C|3D|3E|3F|3G|2C\'.2C(\'|\'),0,{}))',62,229,'||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||return|function|while|replace|if|String|eval|new|RegExp|toString|62|parseInt|split|fromCharCode|150|71|css|child|nth|width|td|tr|color|tab_xin|border|li|input_sous|988px|last|table|dedfe0|1px|100|striped|tbody|solid|even|background|margin|popup_t3_time|window|||top_logo|back_g|content|odd|text|35c1c5|right|30px|666|font|size|14px|height|input|line|align|40px|bottom|radius|4px|position|relative|an_button|60px|resize|95|else|1060|var|f9384d|cursor|pointer|f0f0f0|indent|10px|808080'.split('|'),0,{}))

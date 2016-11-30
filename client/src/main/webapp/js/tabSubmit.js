// 判断input是否有值
function tabSub(evn) {
	if(evn.val() == "")
	{
		evn.addClass("ho_sa");
		evn.css("border","solid 1px #c00");
		evn.next().remove();
		evn.after("<p>请填写正确信息！</p>");
		$(".tab_xin tr td:nth-child(even) p").css({"position":"absolute","font-size":"12px","color":"#c00"});
	}
	else
	{
		evn.removeClass("ho_sa");
		evn.css("border","solid 1px #dedfe0");
		evn.next().remove();
	}
}
$(".tab_xin input").blur(function () {
	var $this = $(this);
	tabSub($this);
});
// textarea
$(".tab_xin td textarea").blur(function () {
	var $this = $(this);
	tabSub($this);
});
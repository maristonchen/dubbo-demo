<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    request.setAttribute("ctx", path);
%>

<div style="width:50%; margin: 20px auto; text-align: center;">
    <img src="${ctx}/images/ok.png">
    <p style="font-size: 24px; padding: 10px 0">投保成功</p>
    <a href="javascript:void(0)" class="a_butt" id="go_back">返回</a>
</div>

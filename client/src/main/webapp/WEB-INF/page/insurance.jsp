<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    request.setAttribute("ctx", path);
%>
<input type="hidden" id="ctx" value="${ctx}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <meta content="yes" name="apple-mobile-web-app-capable">
    <meta content="black" name="apple-mobile-web-app-status-bar-style">
    <meta content="telephone=no" name="format-detection">
    <meta content="email=no" name="format-detection">
    <!-- css -->
    <link rel="stylesheet" type="text/css" href="${ctx}/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/base.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/css/index.css">

    <!-- js -->
    <script type="text/javascript" src="${ctx}/js/jquery-1.9.1.min.js"></script>
    <style type="text/css">
        .a_butt {
            width: 250px;
            height: 36px;
            line-height: 36px;
            background: #35c1c5;
            color: #fff;
            border-radius: 4px;
            margin: 40px auto;
            display: block;
            text-align: center;
        }
    </style>
</head>


<body style="background:#ebeef5;">
<div id="header">
    <ul class="top_logo ">
        <li class="col-md-6"><img src="${ctx}/images/logo.png">
            <p>|&nbsp&nbsp机票保险订/退/配</p></li>
        <li class="col-md-6">欢迎您！admin&nbsp&nbsp|&nbsp&nbsp<a href="javascript:void(0)">退出</a></li>
    </ul>
    <div class="lns_top back_g">
        <h5 class="back_g1" style="width:260px">|&nbsp&nbsp国内保险</h5>
    </div>
</div>

<div style=" width:95%; margin:20px auto; padding: 10px 0; background:#fff">
    <div class="popup_t3_time"
         style=" position: initial; margin:0 auto; background:#fff; width:100%; height: auto; padding:5px 0">
        <form id="insurance-form">
            <table class="tab_xin" style=" width: 98%; margin: 0 auto;">
                <tbody>
                <tr>
                    <td style="text-align: center; background: #ebecec;">订单编号</td>
                    <td><input type="text" style="border:none; width:92%" name="insuranceNo" id="insuranceNo"></td>
                    <td style="text-align: center; background: #ebecec;">票号</td>
                    <td><input type="text" style="border:none; width:92%" name="ticketCode" id="ticketCode"></td>
                </tr>
                <tr>
                    <td style="text-align: center; background: #ebecec;">航班号</td>
                    <td><input type="text" style="border:none; width:92%" name="flightNo" id="flightNo"></td>
                    <td style="text-align: center; background: #ebecec;">保单生效日</td>
                    <td><input type="text" style="border:none; width:92%" name="startDate" id="startDate"></td>
                </tr>
                <tr>
                    <td style="text-align: center; background: #ebecec;">保单到期日</td>
                    <td><input type="text" style="border:none; width:92%" name="endDate" id="endDate"></td>
                    <td style="text-align: center; background: #ebecec;">天数</td>
                    <td><input type="text" style="border:none; width:92%" name="days" id="days"></td>
                </tr>
                <tr>
                    <td style="text-align: center; background: #ebecec;">保险费</td>
                    <td><input type="text" style="border:none; width:92%" name="price" id="price"></td>
                    <td style="text-align: center; background: #ebecec;">被保人 默认（法定）</td>
                    <td><input type="text" value="法定" style="border:none; width:92%" name="passName" id="passName"></td>
                </tr>
                <tr>
                    <td style="text-align: center; background: #ebecec;">被保人出生日期</td>
                    <td><input type="text" style="border:none; width:92%" name="birth" id="birth"></td>
                    <td style="text-align: center; background: #ebecec;">被保人类型</td>
                    <td>
                        <select style=" width: 96%; height: 30px; border: none;" id="passType" name="passType">
                            <option value="1">ADT 成人</option>
                            <option value="2">CHD 儿童</option>
                            <option value="3">NF 婴儿</option>
                            <option value="4">UCHD 无人陪伴儿童</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td style="text-align: center; background: #ebecec;">被保人证件类型</td>
                    <td><input type="text" style="border:none; width:92%" name="certType" id="certType"></td>
                    <td style="text-align: center; background: #ebecec;">被保人证件号码</td>
                    <td><input type="text" style="border:none; width:92%" id="certNo" name="certNo"></td>
                </tr>
                <tr>
                    <td style="text-align: center; background: #ebecec;">受益人 默认（法定）</td>
                    <td><input type="text" style="border:none; width:92%" name="beneficiary" id="beneficiary"></td>
                    <td style="text-align: center; background: #ebecec;">保险产品</td>
                    <td><input type="text" style="border:none; width:92%" id="productCode" name="productCode"></td>
                </tr>
                </tbody>
            </table>
            <a href="javascript:void(0)" class="a_butt" style="" onclick="sub()">提交</a>
        </form>
    </div>
    <div style="text-align: center;">
        订单查询：
        <input id="query-insurance-no" />
        <a href="javascript:void(0)" class="a_butt" style="" onclick="query()">查询</a>
    </div>
</div>

<script type="text/javascript">
    /*添加保险*/
    function sub() {
        var OrderId = $("#insuranceNo").val();
        if (OrderId == null || OrderId == "") {
            alert("请输入订单编号");
            return;
        }
        var InvoiceId = $("#ticketCode").val();
        if (InvoiceId == null || InvoiceId == "") {
            alert("请输入票号");
            return;
        }
        var Flightno = $("#flightNo").val();
        if (Flightno == null || Flightno == "") {
            alert("请输入航班号");
            return;
        }
        var Policyeffective = $("#startDate").val();
        if (Policyeffective == null || Policyeffective == "") {
            alert("请输入保单生效日");
            return;
        }
        var Idays = $("#days").val();
        if (Idays == null || Idays == "") {
            alert("请输入天数");
            return;
        }
        var Insuranceprice = $("#price").val();
        if (Insuranceprice == null || Insuranceprice == "") {
            alert("请输入保险费");
            return;
        }
        var Tinsperson = $("#passName").val();
        if (Tinsperson == null || Tinsperson == "") {
            alert("请输入被保人");
            return;
        }
        var Dateofbirth = $("#birth").val();
        if (Dateofbirth == null || Dateofbirth == "") {
            alert("请输入被保人出生日期");
            return;
        }
        var Passengertype = $("#passType").val();
        if (Passengertype == null || Passengertype == "") {
            alert("请输入被保人类型");
            return;
        }
        var Certtype = $("#certType").val();
        if (Certtype == null || Certtype == "") {
            alert("请输入被保人证件类型");
            return;
        }
        var Certno = $("#certNo").val();
        if (Certno == null || Certno == "") {
            alert("请输入被保人证件号码");
            return;
        }
        var Beneficiary = $("#beneficiary").val();
        if (Beneficiary == null || Beneficiary == "") {
            alert("请输入受益人 ");
            return;
        }
        var Productcate = $("#productCode").val();
        if (Productcate == null || Productcate == "") {
            alert("请输入保险产品");
            return;
        }

        $.ajax({
            type: "post",
            url: $('#ctx').val() + "/web/insurance/save",
            data: $('#insurance-form').serialize(),
            success: function (data) {
                alert(data);
            }

        })
    }

    function query() {
        var insuranceNo = $('#query-insurance-no').val();
        if(!insuranceNo) {
            alert('订单编号不能为空');
            return;
        }
        $.ajax({
            type: "post",
            url: $('#ctx').val() + "/web/insurance/queryByNo",
            data: {insuranceNo:insuranceNo},
            success: function (data) {
                alert(data);
            }

        })
    }

</script>
</body>
</html>
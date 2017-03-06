<%--
  Created by IntelliJ IDEA.
  User: descto
  Date: 17-3-6
  Time: 下午4:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link href="/static/css/bootstrap.min.css" rel="stylesheet">
    <link href="/static/js/metisMenu/metisMenu.min.css" rel="stylesheet">
    <link href="/static/css/sb-admin-2.css" rel="stylesheet">
    <link href="/static/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="/static/js/morris/morris.css">
    <title>客户关系管理系统</title>
</head>
<body>
<div id="wrapper">

    <%@ include file="include/nav.jsp"%>
    <!-- Page Content -->
    <div id="page-wrapper">
        <div class="container-fluid">
            <div class="row">
                <div class="col-lg-12">
                    <div class="page-header">
                        <h4><i class="fa fa-home"></i> 我的首页</h4>
                    </div>
                    <div class="panel panel-default">
                        <div class="panel-heading">销售进展报告</div>
                        <div class="panel-body">
                            <div id="myfirstchart" style="height: 250px;"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="/static/js/jquery.min.js"></script>

<script src="/static/js/bootstrap.min.js"></script>

<!-- Metis Menu Plugin JavaScript -->
<script src="/static/js/metisMenu/metisMenu.min.js"></script>

<!-- Custom Theme JavaScript -->
<script src="/static/js/sb-admin-2.js"></script>
<script src="/static/js/morris/raphael-min.js"></script>
<script src="/static/js/morris/morris.min.js"></script>
<script>
    $(function(){
        Morris.Bar({
            element: 'myfirstchart',
            data: [
                {x: '初访', y: 3},
                {x: '意向', y: 2 },
                {x: '报价', y: 4 },
                {x: '成交', y: 2},
                {x: '暂时搁置', y: 2},
                {x: '无', y: 2},
            ],
            xkey: 'x',
            ykeys: ['y'],
            labels: ['Y']
        }).on('click', function(i, row){
            console.log(i, row);
        });
    });
</script>
</body>
</html>

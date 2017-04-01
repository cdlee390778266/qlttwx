$(function(){$('#weixinUserList').datagrid({idField: 'openid',title: '用户列表',url:'weixinUserController.do?datagrid&field=accountid,openid,nickname,subscribe,sex,country,province,city,subscribeTime,isblack,remark,',fit:true,loadMsg: '数据加载中...',pageSize: 10,pagination:true,pageList:[10,20,30],sortOrder:'asc',rownumbers:true,singleSelect:false,fitColumns:true,showFooter:true,frozenColumns:[[{field:'ck',checkbox:'true'},]],columns:[[{field:'accountid',title:'微信账号',width:0,hidden:true,sortable:true},{field:'openid',title:'微信号',width:120,sortable:true},{field:'nickname',title:'昵称',width:120,sortable:true},{field:'subscribe',title:'是否关注',width:120,sortable:true,formatter:function(value,rec,index){var valArray = value.split(",");if(valArray.length > 1){var checkboxValue = "";for(var k=0; k<valArray.length; k++){if(valArray[k] == '1'){ checkboxValue = checkboxValue + '关注' + ','}if(valArray[k] == '0'){ checkboxValue = checkboxValue + '取消关注' + ','}}return checkboxValue.substring(0,checkboxValue.length-1);}else{if(value=='1'){return '关注'}if(value=='0'){return '取消关注'}else{return value}}}},{field:'sex',title:'性别',width:120,sortable:true,formatter:function(value,rec,index){var valArray = value.split(",");if(valArray.length > 1){var checkboxValue = "";for(var k=0; k<valArray.length; k++){if(valArray[k] == '1'){ checkboxValue = checkboxValue + '男性' + ','}if(valArray[k] == '0'){ checkboxValue = checkboxValue + '女性' + ','}}return checkboxValue.substring(0,checkboxValue.length-1);}else{if(value=='1'){return '男性'}if(value=='0'){return '女性'}else{return value}}}},{field:'country',title:'国家',width:120,sortable:true},{field:'province',title:'省份',width:120,sortable:true},{field:'city',title:'城市',width:120,sortable:true},{field:'subscribeTime',title:'关注时间',width:120,hidden:true,sortable:true,formatter:function(value,rec,index){ return new Date().format('yyyy-MM-dd hh:mm:ss',value);}},{field:'isblack',title:'是否拉黑',width:120,sortable:true,formatter:function(value,rec,index){var valArray = value.split(",");if(valArray.length > 1){var checkboxValue = "";for(var k=0; k<valArray.length; k++){if(valArray[k] == '1'){ checkboxValue = checkboxValue + '已拉黑' + ','}if(valArray[k] == '0'){ checkboxValue = checkboxValue + '未拉黑' + ','}}return checkboxValue.substring(0,checkboxValue.length-1);}else{if(value=='1'){return '已拉黑'}if(value=='0'){return '未拉黑'}else{return value}}}},{field:'remark',title:'备注',width:120,sortable:true},{field:'opt',title:'操作',width:100,formatter:function(value,rec,index){var href='';href+="[<a href='#' onclick=goModifyRemark1('"+rec.openid+"','"+index+"')>";href+="更新备注</a>]";return href;}}]],onLoadSuccess:function(data){$("#weixinUserList").datagrid("clearSelections");},onClickRow:function(rowIndex,rowData){rowid=rowData.id;gridname='weixinUserList';}});$('#weixinUserList').datagrid('getPager').pagination({beforePageText:'',afterPageText:'/{pages}',displayMsg:'{from}-{to}共{total}条',showPageList:true,showRefresh:true});$('#weixinUserList').datagrid('getPager').pagination({onBeforeRefresh:function(pageNumber, pageSize){ $(this).pagination('loading');$(this).pagination('loaded'); }});});function reloadTable(){try{	$('#'+gridname).datagrid('reload');	$('#'+gridname).treegrid('reload');}catch(ex){}}function reloadweixinUserList(){$('#weixinUserList').datagrid('reload');}function getweixinUserListSelected(field){return getSelected(field);}function getSelected(field){var row = $('#'+gridname).datagrid('getSelected');if(row!=null){value= row[field];}else{value='';}return value;}function getweixinUserListSelections(field){var ids = [];var rows = $('#weixinUserList').datagrid('getSelections');for(var i=0;i<rows.length;i++){ids.push(rows[i][field]);}ids.join(',');return ids};function getSelectRows(){	return $('#weixinUserList').datagrid('getChecked');}function weixinUserListsearch(){var queryParams=$('#weixinUserList').datagrid('options').queryParams;$('#weixinUserListtb').find('*').each(function(){queryParams[$(this).attr('name')]=$(this).val();});$('#weixinUserList').datagrid({url:'weixinUserController.do?datagrid&field=accountid,openid,nickname,subscribe,sex,country,province,city,subscribeTime,isblack,remark,',pageNumber:1});}function dosearch(params){var jsonparams=$.parseJSON(params);$('#weixinUserList').datagrid({url:'weixinUserController.do?datagrid&field=accountid,openid,nickname,subscribe,sex,country,province,city,subscribeTime,isblack,remark,',queryParams:jsonparams});}function weixinUserListsearchbox(value,name){var queryParams=$('#weixinUserList').datagrid('options').queryParams;queryParams[name]=value;queryParams.searchfield=name;$('#weixinUserList').datagrid('reload');}$('#weixinUserListsearchbox').searchbox({searcher:function(value,name){weixinUserListsearchbox(value,name);},menu:'#weixinUserListmm',prompt:'请输入查询关键字'});function EnterPress(e){var e = e || window.event;if(e.keyCode == 13){ weixinUserListsearch();}}function searchReset(name){ $("#"+name+"tb").find(":input").val("");weixinUserListsearch();}
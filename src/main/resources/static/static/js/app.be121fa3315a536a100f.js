webpackJsonp([1],{Dqm1:function(e,t,n){"use strict";var a={render:function(){var e=this.$createElement;return(this._self._c||e)("div",[this._v("\n我是用户管理\n")])},staticRenderFns:[]};t.a=a},FHlu:function(e,t){},J373:function(e,t){},NHnr:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=n("7+uW"),s=(n("J373"),{render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{attrs:{id:"app"}},[t("router-view")],1)},staticRenderFns:[]});var o=n("VU/8")({name:"App",components:{}},s,!1,function(e){n("FHlu")},null,null).exports,r=n("/ocq"),l=n("jyJz"),i=n("bOdI"),u=n.n(i),c=n("Dd8w"),m=n.n(c),d=n("NYxO"),p=u()({data:function(){return{tableData:[{date:"2016-05-02",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-04",name:"王小虎",address:"上海市普陀区金沙江路 1517 弄"},{date:"2016-05-01",name:"王小虎",address:"上海市普陀区金沙江路 1519 弄"},{date:"2016-05-03",name:"王小虎",address:"上海市普陀区金沙江路 1516 弄"}]}},mounted:function(){console.log(23333)},computed:m()({},Object(d.b)(["userList"]))},"mounted",function(){this.$store.commit("UpdateUserList",{list:[{date:"2016-05-02",name:"王小虎",address:"上海市普陀区金沙江路 1518 弄"},{date:"2016-05-04",name:"王小虎",address:"上海市普陀区金沙江路 1517 弄"},{date:"2016-05-01",name:"王小虎",address:"上海市普陀区金沙江路 1519 弄"},{date:"2016-05-03",name:"王小虎",address:"上海市普陀区金沙江路 1516 弄"}]}),console.log(this.userList)}),f={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",[t("el-table",{staticStyle:{width:"100%"},attrs:{data:this.tableData}},[t("el-table-column",{attrs:{prop:"date",label:"日期",width:"180"}}),this._v(" "),t("el-table-column",{attrs:{prop:"name",label:"姓名",width:"180"}}),this._v(" "),t("el-table-column",{attrs:{prop:"address",label:"地址"}})],1)],1)},staticRenderFns:[]};var h=n("VU/8")(p,f,!1,function(e){n("W+z6")},null,null).exports,b={data:function(){return{tableData:[]}},computed:m()({},Object(d.b)(["userList"]))},g={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",[t("el-table",{staticStyle:{width:"100%"},attrs:{data:this.userList.list}},[t("el-table-column",{attrs:{prop:"date",label:"日期",width:"180"}}),this._v(" "),t("el-table-column",{attrs:{prop:"name",label:"姓名",width:"180"}}),this._v(" "),t("el-table-column",{attrs:{prop:"address",label:"地址"}})],1)],1)},staticRenderFns:[]};var v=n("VU/8")(b,g,!1,function(e){n("tkV1")},null,null).exports,_=[{path:"/Home",name:"/Home",component:h,meta:{title:"首页",icon:"example",noCache:!0}},{path:"/Management",name:"/Management",component:h,meta:{title:"权限管理",icon:"example",noCache:!0}},{path:"/User",name:"/User",component:l.default,meta:{title:"用户",icon:"example",noCache:!0}},{path:"/TestVuex",name:"/TestVuex",component:v,meta:{title:"测试vuex",icon:"example",noCache:!0}}],w={render:function(){var e=this.$createElement,t=this._self._c||e;return t("div",{staticClass:"hello"},[t("h1",[this._v(this._s(this.msg))])])},staticRenderFns:[]};var x=n("VU/8")({name:"HelloWorld",data:function(){return{msg:"ORCHID PROJECT"}}},w,!1,function(e){n("pQ16")},"data-v-32987a6e",null).exports,F={props:["msgJson","author"],name:"Home",data:function(){return{msg:"主题的内空就是在这里显示了。哈哈",navList:_,levelList:[],editableTabsValue:"",editableTabs:[]}},computed:m()({},Object(d.b)(["tabsInfo"])),methods:{oneone:function(){console.log("oneone"),this.$router.push({name:"HelloWorld"})},handleOpen:function(e,t){console.log(e,t)},handleClose:function(e,t){console.log(e,t)},getBreadcrumb:function(){var e=this.$route.matched.filter(function(e){return e.name}),t=e[0];t&&t.name.trim().toLocaleLowerCase()!=="Home".toLocaleLowerCase()&&(e=[{path:"/Home",meta:{title:"首页"}}].concat(e)),this.levelList=e},changeTabs:function(e){if("首页"!=e.meta.title){var t,n=e.meta.title;t=this.editableTabs.some(function(e){return e.title==n}),this.editableTabsValue=e.name,t||this.editableTabs.push({title:n,name:this.editableTabsValue,componentName:e.component})}},removeTab:function(e){var t=this.editableTabs,n=this.editableTabsValue;n===e&&t.forEach(function(a,s){if(a.name===e){var o=t[s+1]||t[s-1];o&&(n=o.name)}}),this.editableTabsValue=n,this.editableTabs=t.filter(function(t){return t.name!==e})}},mounted:function(){console.log(this.$route);var e=this.$route.name,t=_.filter(function(t){return t.name==e});t[0]&&this.changeTabs(t[0])},watch:{$route:function(){this.getBreadcrumb()}},created:function(){this.getBreadcrumb()},components:{mainshow:x}},T={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:"home"},[n("el-container",[n("el-aside",{attrs:{width:"200px"}},[n("el-menu",{staticClass:"el-menu-vertical-demo",attrs:{"default-active":this.$route.path,router:"",mode:"horizontal","background-color":"#545c64","text-color":"#fff","active-text-color":"#409EFF"},on:{open:e.handleOpen,close:e.handleClose}},e._l(e.navList,function(t,a){return n("el-menu-item",{key:a,staticStyle:{"text-align":"left",width:"100%","border-bottom":"none !important"},attrs:{index:t.name},on:{click:function(n){return e.changeTabs(t)}}},[n("template",{slot:"title"},[n("i",{staticClass:"el-icon-s-platform"}),e._v(" "),n("span",[e._v(" "+e._s(t.meta.title))])])],2)}),1)],1),e._v(" "),n("el-container",[n("el-header",{attrs:{height:"40"}},[e._v("\n          "+e._s(e.msg)+"\n\n          "),n("el-dropdown",{staticClass:"el-username"},[n("i",{staticClass:"el-icon-setting",staticStyle:{"margin-right":"25px"}}),e._v(" "),n("el-dropdown-menu",{attrs:{slot:"dropdown"},slot:"dropdown"},[n("el-dropdown-item",[e._v("设置")]),e._v(" "),n("el-dropdown-item",[e._v("退出")])],1)],1),e._v(" "),n("span",{staticClass:"username"},[e._v("姓名")])],1),e._v(" "),n("el-main",{staticStyle:{padding:"0px"}},[n("el-tabs",{attrs:{type:"card",closable:""},on:{"tab-remove":e.removeTab},model:{value:e.editableTabsValue,callback:function(t){e.editableTabsValue=t},expression:"editableTabsValue"}},e._l(e.editableTabs,function(t,a){return n("el-tab-pane",{key:t.name,attrs:{label:t.title,name:t.name}},[n("el-breadcrumb",{staticClass:"breadcrumb-container",attrs:{"separator-class":"el-icon-arrow-right"}},e._l(e.levelList,function(t,a){return n("el-breadcrumb-item",{key:a,staticStyle:{"margin-bottom":"20px"},attrs:{to:{path:t.path}}},[e._v(e._s(t.meta.title))])}),1),e._v(" "),n(t.componentName,{tag:"component"})],1)}),1)],1)],1)],1)],1)},staticRenderFns:[]};var y=n("VU/8")(F,T,!1,function(e){n("wr08")},null,null).exports,L={name:"Login",data:function(){return{msg:"****登录页",loginForm:{username:"",password:""},rules:{username:[{required:!0,message:"请输入用户名",trigger:"blur"},{min:3,max:5,message:"长度在 3 到 5 个字符",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{min:8,max:16,message:"长度在 8 到 16 个字符",trigger:"blur"}]}}},methods:{login:function(){var e=this;console.log(this.form),this.$axios.get("user/get").then(function(t){console.log(t),e.$router.push({name:"Home",props:{msgJson:e.msgJson}})}).catch(function(t){console.log(t),e.$router.push({name:"Home",props:{msgJson:e.msgJson}})})},resetForm:function(e){this.$refs[e].resetFields()}},mounted:function(){""===this.loginForm.username?this.$refs.username.focus():""===this.loginForm.password&&this.$refs.password.focus()},components:{Home:y}},$={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("div",{staticClass:"Login"},[n("h1",{attrs:{id:"title"}},[e._v(e._s(e.msg))]),e._v(" "),n("el-form",{ref:"loginFormRef",attrs:{model:e.loginForm,rules:e.rules,"label-width":"80px"}},[n("el-form-item",{attrs:{label:"用户名",prop:"username"}},[n("el-input",{ref:"username",model:{value:e.loginForm.username,callback:function(t){e.$set(e.loginForm,"username",t)},expression:"loginForm.username"}})],1),e._v(" "),n("el-form-item",{attrs:{label:"密码",prop:"password"}},[n("el-input",{ref:"password",model:{value:e.loginForm.password,callback:function(t){e.$set(e.loginForm,"password",t)},expression:"loginForm.password"}})],1),e._v(" "),n("div",{staticStyle:{display:"flex","justify-content":"flex-end"}},[n("el-button",{attrs:{type:"primary"},on:{click:e.login}},[e._v("登录")]),e._v(" "),n("el-button",{attrs:{type:"info"},on:{click:function(t){return e.resetForm("loginFormRef")}}},[e._v("重置")])],1)],1)],1)])},staticRenderFns:[]};var C=n("VU/8")(L,$,!1,function(e){n("Npid")},"data-v-7ef155d0",null).exports;a.default.use(r.a);var V=r.a.prototype.push;r.a.prototype.push=function(e){return V.call(this,e).catch(function(e){return e})};var H=new r.a({routes:[{path:"/hello",name:"HelloWorld",components:{default:x,mainshow:x}},{path:"/",name:"Login",component:C,props:{msgJson:{msg:"头部传参",msgFlog:!0}}},{path:"/Home",name:"Home",component:y,props:{msgJson:{msg:"头部传参",msgFlog:!0}},meta:{title:"首页",icon:"example",noCache:!0},children:_}]});a.default.use(d.a);var U=new d.a.Store({state:{userList:{},tabsInfo:{editableTabsValue:"0",tabIndex:0,editableTabs:[]}},mutations:{UpdateUserList:function(e,t){e.userList=t},UpdateTabList:function(e,t){e.tabsInfo=t}}}),R=n("mrgY"),k=n.n(R),J=n("zL8q"),O=n.n(J),j=(n("tvR6"),n("mtWM")),E=n.n(j),q=n("mw3O"),S=n.n(q);a.default.prototype.qs=S.a,E.a.defaults.baseURL=k.a.baseUrl,a.default.prototype.$axios=E.a,a.default.use(O.a),a.default.config.productionTip=!1,new a.default({el:"#app",router:H,store:U,components:{App:o},template:"<App/>"})},Npid:function(e,t){},"W+z6":function(e,t){},jyJz:function(e,t,n){"use strict";var a=n("qgpy"),s=n.n(a),o=n("Dqm1");var r=function(e){n("sj6h")},l=n("VU/8")(s.a,o.a,!1,r,null,null);t.default=l.exports},mrgY:function(e,t,n){const a=Object.is("production","production");e.exports={baseUrl:a?"http://192.168.15.208:5588":"http://192.168.15.168:5588"}},pQ16:function(e,t){},qgpy:function(e,t){},sj6h:function(e,t){},tkV1:function(e,t){},tvR6:function(e,t){},wr08:function(e,t){}},["NHnr"]);
//# sourceMappingURL=app.be121fa3315a536a100f.js.map
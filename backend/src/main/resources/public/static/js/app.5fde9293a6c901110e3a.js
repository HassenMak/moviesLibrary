webpackJsonp([1],{"1/oy":function(t,e){},"9M+g":function(t,e){},GfHa:function(t,e){},Id91:function(t,e){},Jmt5:function(t,e){},NHnr:function(t,e,n){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=n("7+uW"),a=n("e6fC"),s=(n("Jmt5"),n("9M+g"),{render:function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("b-navbar",{attrs:{toggleable:"md",type:"dark",variant:"info"}},[n("b-navbar-toggle",{attrs:{target:"nav_collapse"}}),t._v(" "),n("b-navbar-brand",{attrs:{href:"#/"}},[t._v("ZenikaMovies")]),t._v(" "),n("b-collapse",{attrs:{"is-nav":"",id:"nav_collapse"}},[n("b-navbar-nav",[n("b-nav-item",{attrs:{href:"#/movies"}},[t._v("Movies")])],1),t._v(" "),n("b-navbar-nav",{staticClass:"ml-auto"},[n("b-nav-form",[n("b-form-input",{staticClass:"mr-sm-2",attrs:{size:"sm",type:"text",placeholder:"Search"}}),t._v(" "),n("b-button",{staticClass:"my-2 my-sm-0",attrs:{size:"sm",type:"submit"}},[t._v("Search")])],1),t._v(" "),n("b-nav-item-dropdown",{attrs:{text:"Lang",right:""}},[n("b-dropdown-item",{attrs:{href:"#"}},[t._v("EN")]),t._v(" "),n("b-dropdown-item",{attrs:{href:"#"}},[t._v("ES")]),t._v(" "),n("b-dropdown-item",{attrs:{href:"#"}},[t._v("RU")]),t._v(" "),n("b-dropdown-item",{attrs:{href:"#"}},[t._v("FA")])],1),t._v(" "),n("b-nav-item-dropdown",{attrs:{right:""}},[n("template",{slot:"button-content"},[n("em",[t._v("User")])]),t._v(" "),n("b-dropdown-item",{attrs:{href:"#"}},[t._v("Profile")]),t._v(" "),n("b-dropdown-item",{attrs:{href:"#"}},[t._v("Signout")])],2)],1)],1)],1)},staticRenderFns:[]}),o={name:"App",components:{NavBar:n("VU/8")(null,s,!1,null,null,null).exports}},i={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"app"}},[e("nav-bar"),this._v(" "),e("router-view")],1)},staticRenderFns:[]};var c=n("VU/8")(o,i,!1,function(t){n("tZzG")},null,null).exports,v=n("/ocq"),u={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",[e("p",[this._v("\n        Here is the home Page.\n    ")])])}]},l=n("VU/8")(null,u,!1,null,null,null).exports,m={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this.$createElement,e=this._self._c||t;return e("div",[e("p",[this._v("\n        Here is the page for the list of movies\n    ")])])}]},p=n("VU/8")(null,m,!1,null,null,null).exports;r.a.use(v.a);var f=new v.a({routes:[{path:"/",name:"Home",component:l},{path:"/movies",name:"Movies",component:p}]}),h=n("Xxa5"),_=n.n(h),d=n("exGp"),b=n.n(d),w=n("NYxO"),g=n("mtWM"),x=n.n(g),M={fetchMoviesData:function(){var t=this;return b()(_.a.mark(function e(){var n;return _.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,x.a.get("/api/movies");case 2:return n=t.sent,t.abrupt("return",n);case 4:case"end":return t.stop()}},e,t)}))()}};r.a.use(w.a);var E=new w.a.Store({state:{movies:null},mutations:{fetchMovies:function(t,e){t.movies=e}},actions:{fetchMovies:function(t){var e=this,n=t.commit;return b()(_.a.mark(function t(){var r;return _.a.wrap(function(t){for(;;)switch(t.prev=t.next){case 0:return t.next=2,M.fetchMoviesData();case 2:r=t.sent,n(r);case 4:case"end":return t.stop()}},t,e)}))()}}});r.a.config.productionTip=!1,r.a.use(a.a),new r.a({el:"#app",router:f,store:E,components:{App:c},template:"<App/>"})},tZzG:function(t,e){},zj2Q:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.5fde9293a6c901110e3a.js.map
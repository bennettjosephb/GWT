function $b(){}
function hc(){}
function kc(){}
function nc(){}
function nv(){}
function jv(){}
function fd(a,b){a.W(b)}
function Tt(a,b){a.o[OH]=b}
function St(a,b){Ds(a.o,PH,b)}
function Ut(a,b){Ds(a.o,QH,b)}
function cd(a,b){return new Jb(a,b)}
function Xb(){this.a=ac(new bc)}
function oc(){oc=$F;cc=new hc}
function pc(){pc=$F;dc=new kc}
function qc(){qc=$F;ec=new nc}
function Bs(a,b,c){qt(a,(Xw(),Yw(b)),c)}
function Jb(a,b){Ib();Q.call(this,a,b)}
function ev(a){if(a==Vu){return true}return a==Yu}
function fv(a){if(a==Uu){return true}return a==Tu}
function lv(a){this.b=($v(),Xv).a;this.e=(dw(),cw).a;this.a=a}
function gv(){Zu();Ou.call(this);this.b=($v(),Xv);this.c=(dw(),cw);this.e[$H]=0;this.e[_H]=0}
function bv(a,b){var c;c=wl(a.k,32);c.b=b.a;!!c.d&&(c.d[WH]=b.a,undefined)}
function cv(a,b){var c;c=wl(a.k,32);c.e=b.a;!!c.d&&Ds(c.d,XH,b.a)}
function av(a,b){var c;c=wl(a.k,32);c.c=b;!!c.d&&Ds(c.d,PH,c.c)}
function dv(a,b){var c;c=wl(a.k,32);c.f=b;!!c.d&&Ds(c.d,QH,c.f)}
function qt(a,b,c){c>=a.children.length?a.appendChild(b):a.insertBefore(b,a.children[c])}
function Zu(){Zu=$F;Su=new jv;Vu=new jv;Uu=new jv;Tu=new jv;Wu=new jv;Xu=new jv;Yu=new jv}
function ld(a){var b;!a.e&&(a.e=(b=cd((!a.k&&(a.k=new Yk),a.k),(!a.f&&(a.f=new Xb(new $b)),a.f),!a.d&&(a.d=new Qb)),fd(b,(!a.o&&(a.o=new Fy),a.o)),b));return a.e}
function $u(a,b,c){var d;if(c==Su){if(b==a.a){return}else if(a.a){throw new JB('Only one CENTER widget may be added')}}bu(b);_x(a.f,b);c==Su&&(a.a=b);d=new lv(c);b.k=d;bv(b,a.b);cv(b,a.c);_u(a);du(b,a)}
function ac(a){var b,c,d;b=new gv;$u(b,(c=new Vv((d=new wC,new Or(Pg(d.a))).a),c.o[OH]='GGPMPBCDO',c.o.style[PH]='70px',c.o.style[QH]=RH,c),(Zu(),Wu));$u(b,a.b,Su);dv(a.b,RH);av(a.b,RH);$u(b,a.c,Xu);dv(a.c,RH);av(a.c,SH);$u(b,a.d,Yu);dv(a.d,TH);av(a.d,RH);b.o[OH]='GGPMPBCDH';b.o.style[PH]=RH;b.o.style[QH]=RH;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.a=(oc(),cc);gc(this.a);this.e=(pc(),dc);jc(this.e);this.b=new Vv((b=new wC,new Or(Pg(b.a))).a);Tt(this.b,'GGPMPBCDG');St(this.b,RH);Ut(this.b,RH);this.c=new Vv((c=new wC,new Or(Pg(c.a))).a);Tt(this.c,'GGPMPBCDI');St(this.c,SH);Ut(this.c,RH);this.d=new Vv((d=new wC,new Or(Pg(d.a))).a);Tt(this.d,'GGPMPBCDE GGPMPBCDF');St(this.d,RH);Ut(this.d,'200px')}
function _u(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.d;while(b.children.length>0){Yg(b,b.children[0])}n=1;e=1;for(h=new jy(a.f);h.a<h.b.c-1;){d=hy(h);f=wl(d.k,32).a;f==Wu||f==Xu?++n:(f==Tu||f==Yu||f==Vu||f==Uu)&&++e}o=ml(Uq,kG,33,n,0);for(g=0;g<n;++g){o[g]=new nv;o[g].b=jh($doc,UH);zs(b,o[g].b)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new jy(a.f);h.a<h.b.c-1;){d=hy(h);i=wl(d.k,32);q=jh($doc,VH);i.d=q;i.d[WH]=i.b;Ds(i.d,XH,i.e);i.d[QH]=i.f;i.d[PH]=i.c;if(i.a==Wu){Bs(o[l].b,q,o[l].a);zs(q,d.o);q[YH]=k-j+1;++l}else if(i.a==Xu){Bs(o[p].b,q,o[p].a);zs(q,d.o);q[YH]=k-j+1;--p}else if(i.a==Su){c=q}else if(ev(i.a)){m=o[l];Bs(m.b,q,m.a++);zs(q,d.o);q[ZH]=p-l+1;++j}else if(fv(i.a)){m=o[l];Bs(m.b,q,m.a);zs(q,d.o);q[ZH]=p-l+1;--k}}if(a.a){m=o[l];Bs(m.b,c,m.a);zs(c,a.a.o)}}
function mc(a){if(!a.a){a.a=true;rj();ef(oj,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GGPMPBCDKB{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GGPMPBCDGB{height:150px;background:#ffe680;}.GGPMPBCDHB{width:100%;padding:0 0 100px;height:1%;position:relative;}.GGPMPBCDHB:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GGPMPBCDDB{width:100%;float:left;overflow:hidden;}.GGPMPBCDEB{padding:0 270px 0 270px;}.GGPMPBCDIB{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GGPMPBCDJB{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GGPMPBCDFB{margin-bottom:100px;background:#b0008e;}');tj();return true}return false}
function gc(a){if(!a.a){a.a=true;rj();ef(oj,'.GGPMPBCDC{background-color:#00f;height:100%;min-height:800px;}.GGPMPBCDD{padding-left:20px;}.GGPMPBCDF::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GGPMPBCDF::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GGPMPBCDF::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GGPMPBCDE{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GGPMPBCDB{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GGPMPBCDA{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');tj();return true}return false}
function jc(a){if(!a.a){a.a=true;rj();ef(oj,'.GGPMPBCDL{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GGPMPBCDN{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GGPMPBCDJ{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GGPMPBCDK{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GGPMPBCDM{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GGPMPBCDP{background-color:#f00;}.GGPMPBCDAB{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GGPMPBCDBB{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GGPMPBCDCB{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GGPMPBCDO{background-color:#f1f1f1;}.GGPMPBCDG{margin:5 auto;background-color:#fff;padding:10px;}.GGPMPBCDI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GGPMPBCDH{min-height:100%;}');tj();return true}return false}
var SH='30px',YH='colSpan',ZH='rowSpan';gr(18,5,cG,Jb);_.X=function Kb(){};_.Y=function Lb(){};_.Z=function Mb(){};_.$=function Nb(){};_._=function Ob(){cB();L(this,new eB(this))};gr(21,14,{},Xb);_.db=function Yb(){return this.a};_.a=null;gr(22,1,{},$b);gr(23,1,{},bc);_.a=null;_.b=null;_.c=null;_.d=null;_.e=null;var cc=null,dc=null,ec=null;gr(25,1,{},hc);_.a=false;gr(26,1,{},kc);_.a=false;gr(27,1,{},nc);_.a=false;gr(47,1,hG);_.gb=function ud(){Fz(this.b,ld(this.a.a))};gr(230,228,yG,gv);_.Cb=function hv(a){var b;b=ou(this,a);if(b){a==this.a&&(this.a=null);_u(this)}return b};_.a=null;var Su,Tu,Uu,Vu,Wu,Xu,Yu;gr(231,1,{},jv);gr(232,1,{32:1},lv);_.a=null;_.c=LG;_.d=null;_.f=LG;gr(233,1,{33:1},nv);_.a=0;_.b=null;var Ll=zB(wH,'HomePresenter',18),Rl=zB(wH,'HomeView',21),Ql=zB(wH,'HomeView_BinderImpl',22),Ml=zB(wH,'HomeView_BinderImpl$Widgets',23),oo=zB(aI,'DockPanel',230),no=zB(aI,'DockPanel$TmpRow',233),Uq=yB(bI,'DockPanel$TmpRow;',377),lo=zB(aI,'DockPanel$DockLayoutConstant',231),mo=zB(aI,'DockPanel$LayoutData',232),Nl=zB(wH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),Ol=zB(wH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),Pl=zB(wH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);IG(vf)(1);
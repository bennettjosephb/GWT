function $b(){}
function hc(){}
function kc(){}
function nc(){}
function rw(){}
function vw(){}
function Sd(a,b){a.X(b)}
function Yu(a,b){It(a.p,XI,b)}
function $u(a,b){It(a.p,YI,b)}
function Ld(a,b){return new Jb(a,b)}
function Xb(){this.b=ac(new bc)}
function oc(){oc=jH;cc=new hc}
function pc(){pc=jH;dc=new kc}
function qc(){qc=jH;ec=new nc}
function Jb(a,b){Ib();Q.call(this,a,b)}
function Ht(a,b,c){zu(a,(ey(),fy(b)),c)}
function mw(a){if(a==bw){return true}return a==ew}
function nw(a){if(a==aw){return true}return a==_v}
function tw(a){this.c=(gx(),dx).b;this.f=(lx(),kx).b;this.b=a}
function ow(){fw();Vv.call(this);this.c=(gx(),dx);this.d=(lx(),kx);this.f[gJ]=0;this.f[hJ]=0}
function jw(a,b){var c;c=um(a.n,33);c.c=b.b;!!c.e&&(c.e[cJ]=b.b,undefined)}
function kw(a,b){var c;c=um(a.n,33);c.f=b.b;!!c.e&&It(c.e,dJ,b.b)}
function iw(a,b){var c;c=um(a.n,33);c.d=b;!!c.e&&It(c.e,XI,c.d)}
function lw(a,b){var c;c=um(a.n,33);c.g=b;!!c.e&&It(c.e,YI,c.g)}
function xu(a){var b=0,c=a.firstChild;while(c){c.nodeType==1&&++b;c=c.nextSibling}return b}
function wu(a,b){var c=0,d=a.firstChild;while(d){if(d.nodeType==1){if(b==c)return d;++c}d=d.nextSibling}return null}
function zu(a,b,c){var d=0,e=a.firstChild,f=null;while(e){if(e.nodeType==1){if(d==c){f=e;break}++d}e=e.nextSibling}a.insertBefore(b,f)}
function fw(){fw=jH;$v=new rw;bw=new rw;aw=new rw;_v=new rw;cw=new rw;dw=new rw;ew=new rw}
function Wd(a){var b;!a.f&&(a.f=(b=Ld((!a.q&&(a.q=new Nl),a.q),(!a.g&&(a.g=new Xb(new $b)),a.g),!a.e&&(a.e=new Qb)),Sd(b,(!a.s&&(a.s=new Oz),a.s)),b));return a.f}
function gw(a,b,c){var d;if(c==$v){if(b==a.b){return}else if(a.b){throw new TC('Only one CENTER widget may be added')}}iv(b);iz(a.g,b);c==$v&&(a.b=b);d=new tw(c);b.n=d;jw(b,a.c);kw(b,a.d);hw(a);kv(b,a)}
function ac(a){var b,c,d;b=new ow;gw(b,(c=new bx((d=new HD,new Us(d.b.b)).b),c.p[WI]='GJ-33NUDJ',c.p.style[XI]='70px',c.p.style[YI]=ZI,c),(fw(),cw));gw(b,a.c,$v);lw(a.c,ZI);iw(a.c,ZI);gw(b,a.d,dw);lw(a.d,ZI);iw(a.d,$I);gw(b,a.e,ew);lw(a.e,_I);iw(a.e,ZI);b.p[WI]='GJ-33NUMI';b.p.style[XI]=ZI;b.p.style[YI]=ZI;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.b=(oc(),cc);gc(this.b);this.f=(pc(),dc);jc(this.f);this.c=new bx((b=new HD,new Us(b.b.b)).b);Zu(this.c,'GJ-33NULI');Yu(this.c,ZI);$u(this.c,ZI);this.d=new bx((c=new HD,new Us(c.b.b)).b);Zu(this.d,'GJ-33NUNI');Yu(this.d,$I);$u(this.d,ZI);this.e=new bx((d=new HD,new Us(d.b.b)).b);Zu(this.e,'GJ-33NUJI GJ-33NUKI');Yu(this.e,ZI);$u(this.e,'200px')}
function hw(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.e;while(xu(b)>0){Ph(b,wu(b,0))}n=1;e=1;for(h=new sz(a.g);h.b<h.c.d-1;){d=qz(h);f=um(d.n,33).b;f==cw||f==dw?++n:(f==_v||f==ew||f==bw||f==aw)&&++e}o=km(ds,vH,34,n,0);for(g=0;g<n;++g){o[g]=new vw;o[g].c=$doc.createElement(aJ);Ft(b,o[g].c)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new sz(a.g);h.b<h.c.d-1;){d=qz(h);i=um(d.n,33);q=$doc.createElement(bJ);i.e=q;i.e[cJ]=i.c;It(i.e,dJ,i.f);i.e[YI]=i.g;i.e[XI]=i.d;if(i.b==cw){Ht(o[l].c,q,o[l].b);Ft(q,d.p);q[eJ]=k-j+1;++l}else if(i.b==dw){Ht(o[p].c,q,o[p].b);Ft(q,d.p);q[eJ]=k-j+1;--p}else if(i.b==$v){c=q}else if(mw(i.b)){m=o[l];Ht(m.c,q,m.b++);Ft(q,d.p);q[fJ]=p-l+1;++j}else if(nw(i.b)){m=o[l];Ht(m.c,q,m.b);Ft(q,d.p);q[fJ]=p-l+1;--k}}if(a.b){m=o[l];Ht(m.c,c,m.b);Ft(c,a.b.p)}}
function mc(a){if(!a.b){a.b=true;gk();Yf(dk,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GJ-33NUPJ{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GJ-33NULJ{height:150px;background:#ffe680;}.GJ-33NUMJ{width:100%;padding:0 0 100px;height:1%;position:relative;}.GJ-33NUMJ:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GJ-33NUIJ{width:100%;float:left;overflow:hidden;}.GJ-33NUJJ{padding:0 270px 0 270px;}.GJ-33NUNJ{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GJ-33NUOJ{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GJ-33NUKJ{margin-bottom:100px;background:#b0008e;}');ik();return true}return false}
function gc(a){if(!a.b){a.b=true;gk();Yf(dk,'.GJ-33NUHI{background-color:#00f;height:100%;min-height:800px;}.GJ-33NUII{padding-left:20px;}.GJ-33NUKI::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GJ-33NUJI{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GJ-33NUGI{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GJ-33NUFI{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');ik();return true}return false}
function jc(a){if(!a.b){a.b=true;gk();Yf(dk,'.GJ-33NUAJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GJ-33NUCJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GJ-33NUOI{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GJ-33NUPI{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GJ-33NUBJ{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GJ-33NUEJ{background-color:#f00;}.GJ-33NUFJ{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GJ-33NUGJ{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GJ-33NUHJ{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GJ-33NUDJ{background-color:#f1f1f1;}.GJ-33NULI{margin:5 auto;background-color:#fff;padding:10px;}.GJ-33NUNI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GJ-33NUMI{min-height:100%;}');ik();return true}return false}
var $I='30px',eJ='colSpan',fJ='rowSpan';rs(18,5,nH,Jb);_.Y=function Kb(){};_.Z=function Lb(){};_.$=function Mb(){};_._=function Nb(){};_.ab=function Ob(){lC();L(this,new nC(this))};rs(21,14,{},Xb);_.eb=function Yb(){return this.b};_.b=null;rs(22,1,{},$b);rs(23,1,{},bc);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;var cc=null,dc=null,ec=null;rs(25,1,{},hc);_.b=false;rs(26,1,{},kc);_.b=false;rs(27,1,{},nc);_.b=false;rs(62,1,sH);_.hb=function le(){OA(this.c,Wd(this.b.b))};rs(243,241,JH,ow);_.Cb=function pw(a){var b;b=vv(this,a);if(b){a==this.b&&(this.b=null);hw(this)}return b};_.b=null;var $v,_v,aw,bw,cw,dw,ew;rs(244,1,{},rw);rs(245,1,{33:1},tw);_.b=null;_.d=WH;_.e=null;_.g=WH;rs(246,1,{34:1},vw);_.b=0;_.c=null;var Jm=JC(EI,'HomePresenter',18),Pm=JC(EI,'HomeView',21),Om=JC(EI,'HomeView_BinderImpl',22),Km=JC(EI,'HomeView_BinderImpl$Widgets',23),yp=JC(iJ,'DockPanel',243),xp=JC(iJ,'DockPanel$TmpRow',246),ds=IC(jJ,'DockPanel$TmpRow;',390),vp=JC(iJ,'DockPanel$DockLayoutConstant',244),wp=JC(iJ,'DockPanel$LayoutData',245),Lm=JC(EI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),Mm=JC(EI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),Nm=JC(EI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);TH(mg)(2);
function $b(){}
function hc(){}
function kc(){}
function nc(){}
function vv(){}
function zv(){}
function kd(a,b){a.X(b)}
function au(a,b){Ms(a.p,_H,b)}
function cu(a,b){Ms(a.p,aI,b)}
function hd(a,b){return new Jb(a,b)}
function Xb(){this.b=ac(new bc)}
function oc(){oc=nG;cc=new hc}
function pc(){pc=nG;dc=new kc}
function qc(){qc=nG;ec=new nc}
function Jb(a,b){Ib();Q.call(this,a,b)}
function Ls(a,b,c){Dt(a,(ix(),jx(b)),c)}
function qv(a){if(a==fv){return true}return a==iv}
function rv(a){if(a==ev){return true}return a==dv}
function xv(a){this.c=(kw(),hw).b;this.f=(pw(),ow).b;this.b=a}
function sv(){jv();Zu.call(this);this.c=(kw(),hw);this.d=(pw(),ow);this.f[kI]=0;this.f[lI]=0}
function nv(a,b){var c;c=Il(a.n,33);c.c=b.b;!!c.e&&(c.e[gI]=b.b,undefined)}
function ov(a,b){var c;c=Il(a.n,33);c.f=b.b;!!c.e&&Ms(c.e,hI,b.b)}
function pv(a,b){var c;c=Il(a.n,33);c.g=b;!!c.e&&Ms(c.e,aI,c.g)}
function mv(a,b){var c;c=Il(a.n,33);c.d=b;!!c.e&&Ms(c.e,_H,c.d)}
function Bt(a){var b=0,c=a.firstChild;while(c){c.nodeType==1&&++b;c=c.nextSibling}return b}
function At(a,b){var c=0,d=a.firstChild;while(d){if(d.nodeType==1){if(b==c)return d;++c}d=d.nextSibling}return null}
function Dt(a,b,c){var d=0,e=a.firstChild,f=null;while(e){if(e.nodeType==1){if(d==c){f=e;break}++d}e=e.nextSibling}a.insertBefore(b,f)}
function jv(){jv=nG;cv=new vv;fv=new vv;ev=new vv;dv=new vv;gv=new vv;hv=new vv;iv=new vv}
function qd(a){var b;!a.f&&(a.f=(b=hd((!a.n&&(a.n=new _k),a.n),(!a.g&&(a.g=new Xb(new $b)),a.g),!a.e&&(a.e=new Qb)),kd(b,(!a.p&&(a.p=new Sy),a.p)),b));return a.f}
function kv(a,b,c){var d;if(c==cv){if(b==a.b){return}else if(a.b){throw new XB('Only one CENTER widget may be added')}}mu(b);my(a.g,b);c==cv&&(a.b=b);d=new xv(c);b.n=d;nv(b,a.c);ov(b,a.d);lv(a);ou(b,a)}
function ac(a){var b,c,d;b=new sv;kv(b,(c=new fw((d=new LC,new Yr(d.b.b)).b),c.p[$H]='GJ-33NUDJ',c.p.style[_H]='70px',c.p.style[aI]=bI,c),(jv(),gv));kv(b,a.c,cv);pv(a.c,bI);mv(a.c,bI);kv(b,a.d,hv);pv(a.d,bI);mv(a.d,cI);kv(b,a.e,iv);pv(a.e,dI);mv(a.e,bI);b.p[$H]='GJ-33NUMI';b.p.style[_H]=bI;b.p.style[aI]=bI;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.b=(oc(),cc);gc(this.b);this.f=(pc(),dc);jc(this.f);this.c=new fw((b=new LC,new Yr(b.b.b)).b);bu(this.c,'GJ-33NULI');au(this.c,bI);cu(this.c,bI);this.d=new fw((c=new LC,new Yr(c.b.b)).b);bu(this.d,'GJ-33NUNI');au(this.d,cI);cu(this.d,bI);this.e=new fw((d=new LC,new Yr(d.b.b)).b);bu(this.e,'GJ-33NUJI GJ-33NUKI');au(this.e,bI);cu(this.e,'200px')}
function lv(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.e;while(Bt(b)>0){bh(b,At(b,0))}n=1;e=1;for(h=new wy(a.g);h.b<h.c.d-1;){d=uy(h);f=Il(d.n,33).b;f==gv||f==hv?++n:(f==dv||f==iv||f==fv||f==ev)&&++e}o=yl(hr,zG,34,n,0);for(g=0;g<n;++g){o[g]=new zv;o[g].c=$doc.createElement(eI);Js(b,o[g].c)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new wy(a.g);h.b<h.c.d-1;){d=uy(h);i=Il(d.n,33);q=$doc.createElement(fI);i.e=q;i.e[gI]=i.c;Ms(i.e,hI,i.f);i.e[aI]=i.g;i.e[_H]=i.d;if(i.b==gv){Ls(o[l].c,q,o[l].b);Js(q,d.p);q[iI]=k-j+1;++l}else if(i.b==hv){Ls(o[p].c,q,o[p].b);Js(q,d.p);q[iI]=k-j+1;--p}else if(i.b==cv){c=q}else if(qv(i.b)){m=o[l];Ls(m.c,q,m.b++);Js(q,d.p);q[jI]=p-l+1;++j}else if(rv(i.b)){m=o[l];Ls(m.c,q,m.b);Js(q,d.p);q[jI]=p-l+1;--k}}if(a.b){m=o[l];Ls(m.c,c,m.b);Js(c,a.b.p)}}
function mc(a){if(!a.b){a.b=true;uj();kf(rj,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GJ-33NUPJ{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GJ-33NULJ{height:150px;background:#ffe680;}.GJ-33NUMJ{width:100%;padding:0 0 100px;height:1%;position:relative;}.GJ-33NUMJ:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GJ-33NUIJ{width:100%;float:left;overflow:hidden;}.GJ-33NUJJ{padding:0 270px 0 270px;}.GJ-33NUNJ{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GJ-33NUOJ{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GJ-33NUKJ{margin-bottom:100px;background:#b0008e;}');wj();return true}return false}
function gc(a){if(!a.b){a.b=true;uj();kf(rj,'.GJ-33NUHI{background-color:#00f;height:100%;min-height:800px;}.GJ-33NUII{padding-left:20px;}.GJ-33NUKI::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GJ-33NUJI{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GJ-33NUGI{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GJ-33NUFI{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');wj();return true}return false}
function jc(a){if(!a.b){a.b=true;uj();kf(rj,'.GJ-33NUAJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GJ-33NUCJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GJ-33NUOI{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GJ-33NUPI{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GJ-33NUBJ{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GJ-33NUEJ{background-color:#f00;}.GJ-33NUFJ{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GJ-33NUGJ{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GJ-33NUHJ{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GJ-33NUDJ{background-color:#f1f1f1;}.GJ-33NULI{margin:5 auto;background-color:#fff;padding:10px;}.GJ-33NUNI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GJ-33NUMI{min-height:100%;}');wj();return true}return false}
var cI='30px',iI='colSpan',jI='rowSpan';vr(18,5,rG,Jb);_.Y=function Kb(){};_.Z=function Lb(){};_.$=function Mb(){};_._=function Nb(){};_.ab=function Ob(){pB();L(this,new rB(this))};vr(21,14,{},Xb);_.eb=function Yb(){return this.b};_.b=null;vr(22,1,{},$b);vr(23,1,{},bc);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;var cc=null,dc=null,ec=null;vr(25,1,{},hc);_.b=false;vr(26,1,{},kc);_.b=false;vr(27,1,{},nc);_.b=false;vr(50,1,wG);_.hb=function zd(){Sz(this.c,qd(this.b.b))};vr(231,229,NG,sv);_.Cb=function tv(a){var b;b=zu(this,a);if(b){a==this.b&&(this.b=null);lv(this)}return b};_.b=null;var cv,dv,ev,fv,gv,hv,iv;vr(232,1,{},vv);vr(233,1,{33:1},xv);_.b=null;_.d=$G;_.e=null;_.g=$G;vr(234,1,{34:1},zv);_.b=0;_.c=null;var Xl=NB(IH,'HomePresenter',18),bm=NB(IH,'HomeView',21),am=NB(IH,'HomeView_BinderImpl',22),Yl=NB(IH,'HomeView_BinderImpl$Widgets',23),Co=NB(mI,'DockPanel',231),Bo=NB(mI,'DockPanel$TmpRow',234),hr=MB(nI,'DockPanel$TmpRow;',378),zo=NB(mI,'DockPanel$DockLayoutConstant',232),Ao=NB(mI,'DockPanel$LayoutData',233),Zl=NB(IH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),$l=NB(IH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),_l=NB(IH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);XG(Af)(1);
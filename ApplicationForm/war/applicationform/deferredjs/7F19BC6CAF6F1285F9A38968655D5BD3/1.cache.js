function $b(){}
function hc(){}
function kc(){}
function nc(){}
function Iv(){}
function Mv(){}
function kd(a,b){a.W(b)}
function nu(a,b){Ts(a.o,nI,b)}
function pu(a,b){Ts(a.o,oI,b)}
function hd(a,b){return new Jb(a,b)}
function Xb(){this.a=ac(new bc)}
function oc(){oc=zG;cc=new hc}
function pc(){pc=zG;dc=new kc}
function qc(){qc=zG;ec=new nc}
function Jb(a,b){Ib();Q.call(this,a,b)}
function Ss(a,b,c){Lt(a,(vx(),wx(b)),c)}
function Dv(a){if(a==sv){return true}return a==vv}
function Ev(a){if(a==rv){return true}return a==qv}
function Kv(a){this.b=(xw(),uw).a;this.e=(Cw(),Bw).a;this.a=a}
function Fv(){wv();kv.call(this);this.b=(xw(),uw);this.c=(Cw(),Bw);this.e[yI]=0;this.e[zI]=0}
function Av(a,b){var c;c=Kl(a.k,33);c.b=b.a;!!c.d&&(c.d[uI]=b.a,undefined)}
function Bv(a,b){var c;c=Kl(a.k,33);c.e=b.a;!!c.d&&Ts(c.d,vI,b.a)}
function zv(a,b){var c;c=Kl(a.k,33);c.c=b;!!c.d&&Ts(c.d,nI,c.c)}
function Cv(a,b){var c;c=Kl(a.k,33);c.f=b;!!c.d&&Ts(c.d,oI,c.f)}
function Jt(a){var b=0,c=a.firstChild;while(c){c.nodeType==1&&++b;c=c.nextSibling}return b}
function It(a,b){var c=0,d=a.firstChild;while(d){if(d.nodeType==1){if(b==c)return d;++c}d=d.nextSibling}return null}
function Lt(a,b,c){var d=0,e=a.firstChild,f=null;while(e){if(e.nodeType==1){if(d==c){f=e;break}++d}e=e.nextSibling}a.insertBefore(b,f)}
function wv(){wv=zG;pv=new Iv;sv=new Iv;rv=new Iv;qv=new Iv;tv=new Iv;uv=new Iv;vv=new Iv}
function qd(a){var b;!a.e&&(a.e=(b=hd((!a.k&&(a.k=new bl),a.k),(!a.f&&(a.f=new Xb(new $b)),a.f),!a.d&&(a.d=new Qb)),kd(b,(!a.o&&(a.o=new dz),a.o)),b));return a.e}
function xv(a,b,c){var d;if(c==pv){if(b==a.a){return}else if(a.a){throw new iC('Only one CENTER widget may be added')}}zu(b);zy(a.f,b);c==pv&&(a.a=b);d=new Kv(c);b.k=d;Av(b,a.b);Bv(b,a.c);yv(a);Bu(b,a)}
function ac(a){var b,c,d;b=new Fv;xv(b,(c=new sw((d=new XC,new ds(Ug(d.a))).a),c.o[mI]='GJ-33NUDJ',c.o.style[nI]='70px',c.o.style[oI]=pI,c),(wv(),tv));xv(b,a.b,pv);Cv(a.b,pI);zv(a.b,pI);xv(b,a.c,uv);Cv(a.c,pI);zv(a.c,qI);xv(b,a.d,vv);Cv(a.d,rI);zv(a.d,pI);b.o[mI]='GJ-33NUMI';b.o.style[nI]=pI;b.o.style[oI]=pI;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.a=(oc(),cc);gc(this.a);this.e=(pc(),dc);jc(this.e);this.b=new sw((b=new XC,new ds(Ug(b.a))).a);ou(this.b,'GJ-33NULI');nu(this.b,pI);pu(this.b,pI);this.c=new sw((c=new XC,new ds(Ug(c.a))).a);ou(this.c,'GJ-33NUNI');nu(this.c,qI);pu(this.c,pI);this.d=new sw((d=new XC,new ds(Ug(d.a))).a);ou(this.d,'GJ-33NUJI GJ-33NUKI');nu(this.d,pI);pu(this.d,'200px')}
function yv(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.d;while(Jt(b)>0){bh(b,It(b,0))}n=1;e=1;for(h=new Jy(a.f);h.a<h.b.c-1;){d=Hy(h);f=Kl(d.k,33).a;f==tv||f==uv?++n:(f==qv||f==vv||f==sv||f==rv)&&++e}o=Al(jr,LG,34,n,0);for(g=0;g<n;++g){o[g]=new Mv;o[g].b=$doc.createElement(sI);Qs(b,o[g].b)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new Jy(a.f);h.a<h.b.c-1;){d=Hy(h);i=Kl(d.k,33);q=$doc.createElement(tI);i.d=q;i.d[uI]=i.b;Ts(i.d,vI,i.e);i.d[oI]=i.f;i.d[nI]=i.c;if(i.a==tv){Ss(o[l].b,q,o[l].a);Qs(q,d.o);q[wI]=k-j+1;++l}else if(i.a==uv){Ss(o[p].b,q,o[p].a);Qs(q,d.o);q[wI]=k-j+1;--p}else if(i.a==pv){c=q}else if(Dv(i.a)){m=o[l];Ss(m.b,q,m.a++);Qs(q,d.o);q[xI]=p-l+1;++j}else if(Ev(i.a)){m=o[l];Ss(m.b,q,m.a);Qs(q,d.o);q[xI]=p-l+1;--k}}if(a.a){m=o[l];Ss(m.b,c,m.a);Qs(c,a.a.o)}}
function mc(a){if(!a.a){a.a=true;wj();kf(tj,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GJ-33NUPJ{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GJ-33NULJ{height:150px;background:#ffe680;}.GJ-33NUMJ{width:100%;padding:0 0 100px;height:1%;position:relative;}.GJ-33NUMJ:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GJ-33NUIJ{width:100%;float:left;overflow:hidden;}.GJ-33NUJJ{padding:0 270px 0 270px;}.GJ-33NUNJ{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GJ-33NUOJ{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GJ-33NUKJ{margin-bottom:100px;background:#b0008e;}');yj();return true}return false}
function gc(a){if(!a.a){a.a=true;wj();kf(tj,'.GJ-33NUHI{background-color:#00f;height:100%;min-height:800px;}.GJ-33NUII{padding-left:20px;}.GJ-33NUKI::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GJ-33NUJI{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GJ-33NUGI{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GJ-33NUFI{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');yj();return true}return false}
function jc(a){if(!a.a){a.a=true;wj();kf(tj,'.GJ-33NUAJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GJ-33NUCJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GJ-33NUOI{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GJ-33NUPI{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GJ-33NUBJ{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GJ-33NUEJ{background-color:#f00;}.GJ-33NUFJ{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GJ-33NUGJ{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GJ-33NUHJ{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GJ-33NUDJ{background-color:#f1f1f1;}.GJ-33NULI{margin:5 auto;background-color:#fff;padding:10px;}.GJ-33NUNI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GJ-33NUMI{min-height:100%;}');yj();return true}return false}
var qI='30px',wI='colSpan',xI='rowSpan';xr(18,5,DG,Jb);_.X=function Kb(){};_.Y=function Lb(){};_.Z=function Mb(){};_.$=function Nb(){};_._=function Ob(){CB();L(this,new EB(this))};xr(21,14,{},Xb);_.db=function Yb(){return this.a};_.a=null;xr(22,1,{},$b);xr(23,1,{},bc);_.a=null;_.b=null;_.c=null;_.d=null;_.e=null;var cc=null,dc=null,ec=null;xr(25,1,{},hc);_.a=false;xr(26,1,{},kc);_.a=false;xr(27,1,{},nc);_.a=false;xr(50,1,IG);_.gb=function zd(){dA(this.b,qd(this.a.a))};xr(238,236,ZG,Fv);_.Cb=function Gv(a){var b;b=Mu(this,a);if(b){a==this.a&&(this.a=null);yv(this)}return b};_.a=null;var pv,qv,rv,sv,tv,uv,vv;xr(239,1,{},Iv);xr(240,1,{33:1},Kv);_.a=null;_.c=kH;_.d=null;_.f=kH;xr(241,1,{34:1},Mv);_.a=0;_.b=null;var Zl=$B(WH,'HomePresenter',18),dm=$B(WH,'HomeView',21),cm=$B(WH,'HomeView_BinderImpl',22),$l=$B(WH,'HomeView_BinderImpl$Widgets',23),Eo=$B(AI,'DockPanel',238),Do=$B(AI,'DockPanel$TmpRow',241),jr=ZB(BI,'DockPanel$TmpRow;',385),Bo=$B(AI,'DockPanel$DockLayoutConstant',239),Co=$B(AI,'DockPanel$LayoutData',240),_l=$B(WH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),am=$B(WH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),bm=$B(WH,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);hH(Af)(1);
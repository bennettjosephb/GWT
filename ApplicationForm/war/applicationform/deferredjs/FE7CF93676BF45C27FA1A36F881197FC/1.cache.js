function $b(){}
function hc(){}
function kc(){}
function nc(){}
function Ov(){}
function Sv(){}
function kd(a,b){a.X(b)}
function tu(a,b){bt(a.p,tI,b)}
function vu(a,b){bt(a.p,uI,b)}
function hd(a,b){return new Jb(a,b)}
function Xb(){this.b=ac(new bc)}
function oc(){oc=FG;cc=new hc}
function pc(){pc=FG;dc=new kc}
function qc(){qc=FG;ec=new nc}
function Jb(a,b){Ib();Q.call(this,a,b)}
function at(a,b,c){St(a,(Bx(),Cx(b)),c)}
function Jv(a){if(a==yv){return true}return a==Bv}
function Kv(a){if(a==xv){return true}return a==wv}
function Qv(a){this.c=(Dw(),Aw).b;this.f=(Iw(),Hw).b;this.b=a}
function Lv(){Cv();qv.call(this);this.c=(Dw(),Aw);this.d=(Iw(),Hw);this.f[EI]=0;this.f[FI]=0}
function Fv(a,b){var c;c=Wl(a.n,33);c.d=b;!!c.e&&bt(c.e,tI,c.d)}
function Iv(a,b){var c;c=Wl(a.n,33);c.g=b;!!c.e&&bt(c.e,uI,c.g)}
function Hv(a,b){var c;c=Wl(a.n,33);c.f=b.b;!!c.e&&bt(c.e,BI,b.b)}
function Gv(a,b){var c;c=Wl(a.n,33);c.c=b.b;!!c.e&&(c.e[AI]=b.b,undefined)}
function Qt(a){var b=0,c=a.firstChild;while(c){c.nodeType==1&&++b;c=c.nextSibling}return b}
function Pt(a,b){var c=0,d=a.firstChild;while(d){if(d.nodeType==1){if(b==c)return d;++c}d=d.nextSibling}return null}
function St(a,b,c){var d=0,e=a.firstChild,f=null;while(e){if(e.nodeType==1){if(d==c){f=e;break}++d}e=e.nextSibling}a.insertBefore(b,f)}
function Cv(){Cv=FG;vv=new Ov;yv=new Ov;xv=new Ov;wv=new Ov;zv=new Ov;Av=new Ov;Bv=new Ov}
function qd(a){var b;!a.f&&(a.f=(b=hd((!a.n&&(a.n=new nl),a.n),(!a.g&&(a.g=new Xb(new $b)),a.g),!a.e&&(a.e=new Qb)),kd(b,(!a.p&&(a.p=new jz),a.p)),b));return a.f}
function Dv(a,b,c){var d;if(c==vv){if(b==a.b){return}else if(a.b){throw new oC('Only one CENTER widget may be added')}}Fu(b);Fy(a.g,b);c==vv&&(a.b=b);d=new Qv(c);b.n=d;Gv(b,a.c);Hv(b,a.d);Ev(a);Hu(b,a)}
function ac(a){var b,c,d;b=new Lv;Dv(b,(c=new yw((d=new bD,new ns(d.b.b)).b),c.p[sI]='GJ-33NUDJ',c.p.style[tI]='70px',c.p.style[uI]=vI,c),(Cv(),zv));Dv(b,a.c,vv);Iv(a.c,vI);Fv(a.c,vI);Dv(b,a.d,Av);Iv(a.d,vI);Fv(a.d,wI);Dv(b,a.e,Bv);Iv(a.e,xI);Fv(a.e,vI);b.p[sI]='GJ-33NUMI';b.p.style[tI]=vI;b.p.style[uI]=vI;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.b=(oc(),cc);gc(this.b);this.f=(pc(),dc);jc(this.f);this.c=new yw((b=new bD,new ns(b.b.b)).b);uu(this.c,'GJ-33NULI');tu(this.c,vI);vu(this.c,vI);this.d=new yw((c=new bD,new ns(c.b.b)).b);uu(this.d,'GJ-33NUNI');tu(this.d,wI);vu(this.d,vI);this.e=new yw((d=new bD,new ns(d.b.b)).b);uu(this.e,'GJ-33NUJI GJ-33NUKI');tu(this.e,vI);vu(this.e,'200px')}
function Ev(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.e;while(Qt(b)>0){mh(b,Pt(b,0))}n=1;e=1;for(h=new Py(a.g);h.b<h.c.d-1;){d=Ny(h);f=Wl(d.n,33).b;f==zv||f==Av?++n:(f==wv||f==Bv||f==yv||f==xv)&&++e}o=Ml(yr,SG,34,n,0);for(g=0;g<n;++g){o[g]=new Sv;o[g].c=$doc.createElement(yI);$s(b,o[g].c)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new Py(a.g);h.b<h.c.d-1;){d=Ny(h);i=Wl(d.n,33);q=$doc.createElement(zI);i.e=q;i.e[AI]=i.c;bt(i.e,BI,i.f);i.e[uI]=i.g;i.e[tI]=i.d;if(i.b==zv){at(o[l].c,q,o[l].b);$s(q,d.p);q[CI]=k-j+1;++l}else if(i.b==Av){at(o[p].c,q,o[p].b);$s(q,d.p);q[CI]=k-j+1;--p}else if(i.b==vv){c=q}else if(Jv(i.b)){m=o[l];at(m.c,q,m.b++);$s(q,d.p);q[DI]=p-l+1;++j}else if(Kv(i.b)){m=o[l];at(m.c,q,m.b);$s(q,d.p);q[DI]=p-l+1;--k}}if(a.b){m=o[l];at(m.c,c,m.b);$s(c,a.b.p)}}
function mc(a){if(!a.b){a.b=true;Ij();vf(Fj,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GJ-33NUPJ{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GJ-33NULJ{height:150px;background:#ffe680;}.GJ-33NUMJ{width:100%;padding:0 0 100px;height:1%;position:relative;}.GJ-33NUMJ:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GJ-33NUIJ{width:100%;float:left;overflow:hidden;}.GJ-33NUJJ{padding:0 270px 0 270px;}.GJ-33NUNJ{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GJ-33NUOJ{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GJ-33NUKJ{margin-bottom:100px;background:#b0008e;}');Kj();return true}return false}
function gc(a){if(!a.b){a.b=true;Ij();vf(Fj,'.GJ-33NUHI{background-color:#00f;height:100%;min-height:800px;}.GJ-33NUII{padding-left:20px;}.GJ-33NUKI::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GJ-33NUJI{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GJ-33NUGI{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GJ-33NUFI{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');Kj();return true}return false}
function jc(a){if(!a.b){a.b=true;Ij();vf(Fj,'.GJ-33NUAJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GJ-33NUCJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GJ-33NUOI{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GJ-33NUPI{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GJ-33NUBJ{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GJ-33NUEJ{background-color:#f00;}.GJ-33NUFJ{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GJ-33NUGJ{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GJ-33NUHJ{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GJ-33NUDJ{background-color:#f1f1f1;}.GJ-33NULI{margin:5 auto;background-color:#fff;padding:10px;}.GJ-33NUNI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GJ-33NUMI{min-height:100%;}');Kj();return true}return false}
var wI='30px',CI='colSpan',DI='rowSpan';Mr(18,5,JG,Jb);_.Y=function Kb(){};_.Z=function Lb(){};_.$=function Mb(){};_._=function Nb(){};_.ab=function Ob(){IB();L(this,new KB(this))};Mr(21,14,{},Xb);_.eb=function Yb(){return this.b};_.b=null;Mr(22,1,{},$b);Mr(23,1,{},bc);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;var cc=null,dc=null,ec=null;Mr(25,1,{},hc);_.b=false;Mr(26,1,{},kc);_.b=false;Mr(27,1,{},nc);_.b=false;Mr(50,1,OG);_.hb=function zd(){jA(this.c,qd(this.b.b))};Mr(234,232,eH,Lv);_.Gb=function Mv(a){var b;b=Su(this,a);if(b){a==this.b&&(this.b=null);Ev(this)}return b};_.b=null;var vv,wv,xv,yv,zv,Av,Bv;Mr(235,1,{},Ov);Mr(236,1,{33:1},Qv);_.b=null;_.d=rH;_.e=null;_.g=rH;Mr(237,1,{34:1},Sv);_.b=0;_.c=null;var jm=eC(aI,'HomePresenter',18),pm=eC(aI,'HomeView',21),om=eC(aI,'HomeView_BinderImpl',22),km=eC(aI,'HomeView_BinderImpl$Widgets',23),To=eC(GI,'DockPanel',234),So=eC(GI,'DockPanel$TmpRow',237),yr=dC(HI,'DockPanel$TmpRow;',381),Qo=eC(GI,'DockPanel$DockLayoutConstant',235),Ro=eC(GI,'DockPanel$LayoutData',236),lm=eC(aI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),mm=eC(aI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),nm=eC(aI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);oH(Lf)(1);
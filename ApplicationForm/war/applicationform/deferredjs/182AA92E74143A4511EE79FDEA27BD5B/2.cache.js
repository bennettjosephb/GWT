function $b(){}
function hc(){}
function kc(){}
function nc(){}
function Kw(){}
function Ow(){}
function Sd(a,b){a.X(b)}
function pv(a,b){Zt(a.p,pJ,b)}
function rv(a,b){Zt(a.p,qJ,b)}
function Ld(a,b){return new Jb(a,b)}
function Xb(){this.b=ac(new bc)}
function oc(){oc=BH;cc=new hc}
function pc(){pc=BH;dc=new kc}
function qc(){qc=BH;ec=new nc}
function Jb(a,b){Ib();Q.call(this,a,b)}
function Yt(a,b,c){Ou(a,(xy(),yy(b)),c)}
function Fw(a){if(a==uw){return true}return a==xw}
function Gw(a){if(a==tw){return true}return a==sw}
function Mw(a){this.c=(zx(),wx).b;this.f=(Ex(),Dx).b;this.b=a}
function Hw(){yw();mw.call(this);this.c=(zx(),wx);this.d=(Ex(),Dx);this.f[AJ]=0;this.f[BJ]=0}
function Bw(a,b){var c;c=Im(a.n,33);c.d=b;!!c.e&&Zt(c.e,pJ,c.d)}
function Ew(a,b){var c;c=Im(a.n,33);c.g=b;!!c.e&&Zt(c.e,qJ,c.g)}
function Dw(a,b){var c;c=Im(a.n,33);c.f=b.b;!!c.e&&Zt(c.e,xJ,b.b)}
function Cw(a,b){var c;c=Im(a.n,33);c.c=b.b;!!c.e&&(c.e[wJ]=b.b,undefined)}
function Mu(a){var b=0,c=a.firstChild;while(c){c.nodeType==1&&++b;c=c.nextSibling}return b}
function Lu(a,b){var c=0,d=a.firstChild;while(d){if(d.nodeType==1){if(b==c)return d;++c}d=d.nextSibling}return null}
function Ou(a,b,c){var d=0,e=a.firstChild,f=null;while(e){if(e.nodeType==1){if(d==c){f=e;break}++d}e=e.nextSibling}a.insertBefore(b,f)}
function yw(){yw=BH;rw=new Kw;uw=new Kw;tw=new Kw;sw=new Kw;vw=new Kw;ww=new Kw;xw=new Kw}
function Wd(a){var b;!a.f&&(a.f=(b=Ld((!a.q&&(a.q=new _l),a.q),(!a.g&&(a.g=new Xb(new $b)),a.g),!a.e&&(a.e=new Qb)),Sd(b,(!a.s&&(a.s=new fA),a.s)),b));return a.f}
function zw(a,b,c){var d;if(c==rw){if(b==a.b){return}else if(a.b){throw new kD('Only one CENTER widget may be added')}}Bv(b);Bz(a.g,b);c==rw&&(a.b=b);d=new Mw(c);b.n=d;Cw(b,a.c);Dw(b,a.d);Aw(a);Dv(b,a)}
function ac(a){var b,c,d;b=new Hw;zw(b,(c=new ux((d=new ZD,new jt(d.b.b)).b),c.p[oJ]='GJ-33NUDJ',c.p.style[pJ]='70px',c.p.style[qJ]=rJ,c),(yw(),vw));zw(b,a.c,rw);Ew(a.c,rJ);Bw(a.c,rJ);zw(b,a.d,ww);Ew(a.d,rJ);Bw(a.d,sJ);zw(b,a.e,xw);Ew(a.e,tJ);Bw(a.e,rJ);b.p[oJ]='GJ-33NUMI';b.p.style[pJ]=rJ;b.p.style[qJ]=rJ;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.b=(oc(),cc);gc(this.b);this.f=(pc(),dc);jc(this.f);this.c=new ux((b=new ZD,new jt(b.b.b)).b);qv(this.c,'GJ-33NULI');pv(this.c,rJ);rv(this.c,rJ);this.d=new ux((c=new ZD,new jt(c.b.b)).b);qv(this.d,'GJ-33NUNI');pv(this.d,sJ);rv(this.d,rJ);this.e=new ux((d=new ZD,new jt(d.b.b)).b);qv(this.e,'GJ-33NUJI GJ-33NUKI');pv(this.e,rJ);rv(this.e,'200px')}
function Aw(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.e;while(Mu(b)>0){$h(b,Lu(b,0))}n=1;e=1;for(h=new Lz(a.g);h.b<h.c.d-1;){d=Jz(h);f=Im(d.n,33).b;f==vw||f==ww?++n:(f==sw||f==xw||f==uw||f==tw)&&++e}o=ym(us,OH,34,n,0);for(g=0;g<n;++g){o[g]=new Ow;o[g].c=$doc.createElement(uJ);Wt(b,o[g].c)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new Lz(a.g);h.b<h.c.d-1;){d=Jz(h);i=Im(d.n,33);q=$doc.createElement(vJ);i.e=q;i.e[wJ]=i.c;Zt(i.e,xJ,i.f);i.e[qJ]=i.g;i.e[pJ]=i.d;if(i.b==vw){Yt(o[l].c,q,o[l].b);Wt(q,d.p);q[yJ]=k-j+1;++l}else if(i.b==ww){Yt(o[p].c,q,o[p].b);Wt(q,d.p);q[yJ]=k-j+1;--p}else if(i.b==rw){c=q}else if(Fw(i.b)){m=o[l];Yt(m.c,q,m.b++);Wt(q,d.p);q[zJ]=p-l+1;++j}else if(Gw(i.b)){m=o[l];Yt(m.c,q,m.b);Wt(q,d.p);q[zJ]=p-l+1;--k}}if(a.b){m=o[l];Yt(m.c,c,m.b);Wt(c,a.b.p)}}
function mc(a){if(!a.b){a.b=true;uk();hg(rk,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GJ-33NUPJ{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GJ-33NULJ{height:150px;background:#ffe680;}.GJ-33NUMJ{width:100%;padding:0 0 100px;height:1%;position:relative;}.GJ-33NUMJ:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GJ-33NUIJ{width:100%;float:left;overflow:hidden;}.GJ-33NUJJ{padding:0 270px 0 270px;}.GJ-33NUNJ{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GJ-33NUOJ{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GJ-33NUKJ{margin-bottom:100px;background:#b0008e;}');wk();return true}return false}
function gc(a){if(!a.b){a.b=true;uk();hg(rk,'.GJ-33NUHI{background-color:#00f;height:100%;min-height:800px;}.GJ-33NUII{padding-left:20px;}.GJ-33NUKI::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GJ-33NUKI::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GJ-33NUJI{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GJ-33NUGI{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GJ-33NUFI{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');wk();return true}return false}
function jc(a){if(!a.b){a.b=true;uk();hg(rk,'.GJ-33NUAJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GJ-33NUCJ{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GJ-33NUOI{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GJ-33NUPI{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GJ-33NUBJ{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GJ-33NUEJ{background-color:#f00;}.GJ-33NUFJ{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GJ-33NUGJ{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GJ-33NUHJ{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GJ-33NUDJ{background-color:#f1f1f1;}.GJ-33NULI{margin:5 auto;background-color:#fff;padding:10px;}.GJ-33NUNI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GJ-33NUMI{min-height:100%;}');wk();return true}return false}
var sJ='30px',yJ='colSpan',zJ='rowSpan';Is(18,5,FH,Jb);_.Y=function Kb(){};_.Z=function Lb(){};_.$=function Mb(){};_._=function Nb(){};_.ab=function Ob(){EC();L(this,new GC(this))};Is(21,14,{},Xb);_.eb=function Yb(){return this.b};_.b=null;Is(22,1,{},$b);Is(23,1,{},bc);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;var cc=null,dc=null,ec=null;Is(25,1,{},hc);_.b=false;Is(26,1,{},kc);_.b=false;Is(27,1,{},nc);_.b=false;Is(62,1,KH);_.hb=function le(){fB(this.c,Wd(this.b.b))};Is(246,244,aI,Hw);_.Gb=function Iw(a){var b;b=Ov(this,a);if(b){a==this.b&&(this.b=null);Aw(this)}return b};_.b=null;var rw,sw,tw,uw,vw,ww,xw;Is(247,1,{},Kw);Is(248,1,{33:1},Mw);_.b=null;_.d=nI;_.e=null;_.g=nI;Is(249,1,{34:1},Ow);_.b=0;_.c=null;var Xm=aD(YI,'HomePresenter',18),bn=aD(YI,'HomeView',21),an=aD(YI,'HomeView_BinderImpl',22),Ym=aD(YI,'HomeView_BinderImpl$Widgets',23),Pp=aD(CJ,'DockPanel',246),Op=aD(CJ,'DockPanel$TmpRow',249),us=_C(DJ,'DockPanel$TmpRow;',393),Mp=aD(CJ,'DockPanel$DockLayoutConstant',247),Np=aD(CJ,'DockPanel$LayoutData',248),Zm=aD(YI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),$m=aD(YI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),_m=aD(YI,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);kI(xg)(2);
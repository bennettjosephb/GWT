function $b(){}
function hc(){}
function kc(){}
function nc(){}
function iu(){}
function mu(){}
function ad(a,b){a.X(b)}
function Xs(a,b){a.o[uG]=b}
function Ws(a,b){Jr(a.o,vG,b)}
function Ys(a,b){Jr(a.o,wG,b)}
function Xc(a,b){return new Jb(a,b)}
function Xb(){this.b=ac(new bc)}
function oc(){oc=KE;cc=new hc}
function pc(){pc=KE;dc=new kc}
function qc(){qc=KE;ec=new nc}
function Jb(a,b){Ib();Q.call(this,a,b)}
function Ir(a,b,c){As(a,(Hv(),Iv(b)),c)}
function du(a){if(a==Ut){return true}return a==Xt}
function eu(a){if(a==Tt){return true}return a==St}
function ku(a){this.c=(Ou(),Lu).b;this.f=(Tu(),Su).b;this.b=a}
function fu(){Yt();Pt.call(this);this.c=(Ou(),Lu);this.d=(Tu(),Su);this.f[GG]=0;this.f[HG]=0}
function au(a,b){var c;c=Wk(a.k,28);c.c=b.b;!!c.e&&(c.e[CG]=b.b,undefined)}
function bu(a,b){var c;c=Wk(a.k,28);c.f=b.b;!!c.e&&Jr(c.e,DG,b.b)}
function cu(a,b){var c;c=Wk(a.k,28);c.g=b;!!c.e&&Jr(c.e,wG,c.g)}
function _t(a,b){var c;c=Wk(a.k,28);c.d=b;!!c.e&&Jr(c.e,vG,c.d)}
function ys(a){var b=0,c=a.firstChild;while(c){c.nodeType==1&&++b;c=c.nextSibling}return b}
function xs(a,b){var c=0,d=a.firstChild;while(d){if(d.nodeType==1){if(b==c)return d;++c}d=d.nextSibling}return null}
function As(a,b,c){var d=0,e=a.firstChild,f=null;while(e){if(e.nodeType==1){if(d==c){f=e;break}++d}e=e.nextSibling}a.insertBefore(b,f)}
function Yt(){Yt=KE;Rt=new iu;Ut=new iu;Tt=new iu;St=new iu;Vt=new iu;Wt=new iu;Xt=new iu}
function ed(a){var b;!a.f&&(a.f=(b=Xc((!a.n&&(a.n=new xk),a.n),(!a.g&&(a.g=new Xb(new $b)),a.g),!a.e&&(a.e=new Qb)),ad(b,(!a.p&&(a.p=new px),a.p)),b));return a.f}
function Zt(a,b,c){var d;if(c==Rt){if(b==a.b){return}else if(a.b){throw new tA('Only one CENTER widget may be added')}}ct(b);Lw(a.g,b);c==Rt&&(a.b=b);d=new ku(c);b.k=d;au(b,a.c);bu(b,a.d);$t(a);et(b,a)}
function ac(a){var b,c,d;b=new fu;Zt(b,(c=new Ju((d=new gB,new Vq(d.b.b)).b),c.o[uG]='GGPMPBCDO',c.o.style[vG]='70px',c.o.style[wG]=xG,c),(Yt(),Vt));Zt(b,a.c,Rt);cu(a.c,xG);_t(a.c,xG);Zt(b,a.d,Wt);cu(a.d,xG);_t(a.d,yG);Zt(b,a.e,Xt);cu(a.e,zG);_t(a.e,xG);b.o[uG]='GGPMPBCDH';b.o.style[vG]=xG;b.o.style[wG]=xG;return b}
function bc(){var a,b,c,d;a=(qc(),ec);mc(a);this.b=(oc(),cc);gc(this.b);this.f=(pc(),dc);jc(this.f);this.c=new Ju((b=new gB,new Vq(b.b.b)).b);Xs(this.c,'GGPMPBCDG');Ws(this.c,xG);Ys(this.c,xG);this.d=new Ju((c=new gB,new Vq(c.b.b)).b);Xs(this.d,'GGPMPBCDI');Ws(this.d,yG);Ys(this.d,xG);this.e=new Ju((d=new gB,new Vq(d.b.b)).b);Xs(this.e,'GGPMPBCDE GGPMPBCDF');Ws(this.e,xG);Ys(this.e,'200px')}
function $t(a){var b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q;b=a.e;while(ys(b)>0){Rg(b,xs(b,0))}n=1;e=1;for(h=new Vw(a.g);h.b<h.c.d-1;){d=Tw(h);f=Wk(d.k,28).b;f==Vt||f==Wt?++n:(f==St||f==Xt||f==Ut||f==Tt)&&++e}o=Mk(eq,WE,29,n,0);for(g=0;g<n;++g){o[g]=new mu;o[g].c=$doc.createElement(AG);Gr(b,o[g].c)}j=0;k=e-1;l=0;p=n-1;c=null;for(h=new Vw(a.g);h.b<h.c.d-1;){d=Tw(h);i=Wk(d.k,28);q=$doc.createElement(BG);i.e=q;i.e[CG]=i.c;Jr(i.e,DG,i.f);i.e[wG]=i.g;i.e[vG]=i.d;if(i.b==Vt){Ir(o[l].c,q,o[l].b);Gr(q,d.o);q[EG]=k-j+1;++l}else if(i.b==Wt){Ir(o[p].c,q,o[p].b);Gr(q,d.o);q[EG]=k-j+1;--p}else if(i.b==Rt){c=q}else if(du(i.b)){m=o[l];Ir(m.c,q,m.b++);Gr(q,d.o);q[FG]=p-l+1;++j}else if(eu(i.b)){m=o[l];Ir(m.c,q,m.b);Gr(q,d.o);q[FG]=p-l+1;--k}}if(a.b){m=o[l];Ir(m.c,c,m.b);Gr(c,a.b.o)}}
function mc(a){if(!a.b){a.b=true;hj();Ze(ej,'*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}.GGPMPBCDKB{width:100%;min-width:1000px;min-height:100%;height:auto !important;height:100%;}.GGPMPBCDGB{height:150px;background:#ffe680;}.GGPMPBCDHB{width:100%;padding:0 0 100px;height:1%;position:relative;}.GGPMPBCDHB:after{content:".";display:block;clear:both;visibility:hidden;height:0;}.GGPMPBCDDB{width:100%;float:left;overflow:hidden;}.GGPMPBCDEB{padding:0 270px 0 270px;}.GGPMPBCDIB{float:left;width:250px;margin-left:-100%;position:relative;background:#b5e3ff;}.GGPMPBCDJB{float:left;margin-right:-3px;width:250px;margin-left:-250px;position:relative;background:#ffacaa;}.GGPMPBCDFB{margin-bottom:100px;background:#b0008e;}');jj();return true}return false}
function gc(a){if(!a.b){a.b=true;hj();Ze(ej,'.GGPMPBCDC{background-color:#00f;height:100%;min-height:800px;}.GGPMPBCDD{padding-left:20px;}.GGPMPBCDF::-webkit-scrollbar-track{border:1px solid #6d0019;background-color:#f5f5f5;}.GGPMPBCDF::-webkit-scrollbar{width:10px;background-color:#f5f5f5;}.GGPMPBCDF::-webkit-scrollbar-thumb{background:#cc002c;background:-moz-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-webkit-gradient(linear, left top, left bottom, color-stop(0, #cc002c), color-stop(100%, #6d0019));background:-webkit-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-o-linear-gradient(top, #cc002c 0, #6d0019 100%);background:-ms-linear-gradient(top, #cc002c 0, #6d0019 100%);background:linear-gradient(top, #cc002c 0, #6d0019 100%);filter:progid;}.GGPMPBCDE{padding-left:50px;background:#f5edef;overflow-y:auto;overflow-x:hidden;}.GGPMPBCDB{font-weight:bold;font-family:arial, sans-serif;color:#3c3c3c;}.GGPMPBCDA{font-weight:bold;font-size:13px;font-family:arial, sans-serif;color:#000;}*{margin:0;padding:0;}html{height:100%;}header,nav,section,article,aside,footer{display:block;}body{font:12px/ 18px Arial, Tahoma, Verdana, sans-serif;height:100%;}');jj();return true}return false}
function jc(a){if(!a.b){a.b=true;hj();Ze(ej,'.GGPMPBCDL{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;margin:-50px auto 0 auto;}.GGPMPBCDN{border-top-color:#ebebeb;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;overflow:hidden;position:absolute;width:100%;}.GGPMPBCDJ{border-top-color:#ff0;border-top-style:solid;border-top-width:1px;bottom:0;height:35px;position:absolute;margin:0;width:100%;}.GGPMPBCDK{font-size:0.85em;line-height:0;padding-top:9px;white-space:nowrap;}.GGPMPBCDM{clear:both;position:relative;z-index:10;height:3em;margin-top:-3em;}.GGPMPBCDP{background-color:#f00;}.GGPMPBCDAB{background-color:#f1f1f1;border-bottom-color:#ebebeb;border-bottom-style:solid;border-bottom-width:1px;}.GGPMPBCDBB{float:left;padding-top:15px;padding-bottom:15px;padding-left:25px;}.GGPMPBCDCB{float:right;right:0;padding-top:20px;padding-left:10px;}#footer{margin:-100px auto 0;min-width:1000px;height:100px;background:#bff08e;position:relative;}.GGPMPBCDO{background-color:#f1f1f1;}.GGPMPBCDG{margin:5 auto;background-color:#fff;padding:10px;}.GGPMPBCDI{background-color:#f1f1f1;border-top-color:#e0e0e0;border-top-style:solid;border-top-width:1px;bottom:0;}.GGPMPBCDH{min-height:100%;}');jj();return true}return false}
var yG='30px',EG='colSpan',FG='rowSpan';sq(18,5,OE,Jb);_.Y=function Kb(){};_.Z=function Lb(){};_.$=function Mb(){};_._=function Nb(){};_.ab=function Ob(){Oz();L(this,new Qz(this))};sq(21,14,{},Xb);_.eb=function Yb(){return this.b};_.b=null;sq(22,1,{},$b);sq(23,1,{},bc);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;var cc=null,dc=null,ec=null;sq(25,1,{},hc);_.b=false;sq(26,1,{},kc);_.b=false;sq(27,1,{},nc);_.b=false;sq(46,1,TE);_.hb=function ud(){py(this.c,ed(this.b.b))};sq(215,214,iF,fu);_.Cb=function gu(a){var b;b=pt(this,a);if(b){a==this.b&&(this.b=null);$t(this)}return b};_.b=null;var Rt,St,Tt,Ut,Vt,Wt,Xt;sq(216,1,{},iu);sq(217,1,{28:1},ku);_.b=null;_.d=vF;_.e=null;_.g=vF;sq(218,1,{29:1},mu);_.b=0;_.c=null;var jl=jA(cG,'HomePresenter',18),pl=jA(cG,'HomeView',21),ol=jA(cG,'HomeView_BinderImpl',22),kl=jA(cG,'HomeView_BinderImpl$Widgets',23),Dn=jA(IG,'DockPanel',215),Cn=jA(IG,'DockPanel$TmpRow',218),eq=iA(JG,'DockPanel$TmpRow;',356),An=jA(IG,'DockPanel$DockLayoutConstant',216),Bn=jA(IG,'DockPanel$LayoutData',217),ll=jA(cG,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',25),ml=jA(cG,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$2',26),nl=jA(cG,'HomeView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$3',27);sF(of)(2);
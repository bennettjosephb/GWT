function zc(){}
function Ec(){}
function Qc(){}
function Wc(){}
function Zc(){}
function Rj(){}
function dl(){}
function cs(){}
function fs(){}
function Bv(){}
function Hv(){}
function Ju(a){el(a)}
function gd(a,b){a.X(b)}
function bw(a,b){a.b=b}
function Qx(a,b){a.b=b}
function gh(a,b){a.src=b}
function Gv(a,b){Bc(b,a)}
function pv(a,b){nh(a.p,b)}
function Eu(a,b){bh(a.p,b)}
function Nt(a,b){mt(a.p,b)}
function Fu(a){this.p=a}
function Cc(a){this.b=a}
function is(a){this.b=a}
function xv(a){this.b=a}
function bk(){this.b={}}
function Lr(){this.b=FG}
function Mw(){Mw=UF;Ex()}
function aw(){aw=UF;new AF}
function $c(){$c=UF;Vc=new Zc}
function Jw(a){this.p=a;new dl}
function nh(b,a){b.target=a}
function vs(a,b){_s();pt(a,b)}
function mt(a,b){_s();nt(a,b)}
function xs(a){_s();pt(a,32768)}
function Fx(){Ex();return zx}
function ms(a){Yg(a.parentNode,a)}
function Hx(){qh.call(this,gI,0)}
function Jx(){qh.call(this,hI,1)}
function Lx(){qh.call(this,iI,2)}
function Nx(){qh.call(this,jI,3)}
function sc(a,b){Q.call(this,a,b)}
function iw(a,b){this.b=a;this.c=b}
function pw(a){this.p=a;new Ju(this.p)}
function Nc(){this.f=Sc(new Tc(this))}
function sx(a){this.d=a;this.b=!!this.d.d}
function os(a,b,c){this.c=a;this.d=b;this.b=c}
function Mv(a,b,c){var d;d=c;Nv(a,b,d)}
function dd(a,b){return new sc(a,b)}
function Er(c,a,b){return a.replace(c,b)}
function $g(c,a,b){return c.replaceChild(a,b)}
function mh(b,a){return b.getElementById(a)}
function hh(a,b){a.dispatchEvent(b)}
function Qj(){Qj=UF;Pj=new $j(new Rj)}
function Xr(){this.b='images/UserGroup.png'}
function qv(){rv.call(this,$doc.createElement(DG))}
function Nw(){Mw();Ow.call(this,ch($doc,'text'),'gwt-TextBox')}
function cw(){aw();bw(this,new mw(this));this.p[FH]='gwt-Image'}
function iy(a,b){a&&(a.onload=null);b.onsubmit=null}
function _g(b,a){return b[a]==null?null:String(b[a])}
function Rt(a,b,c){return Ak(!a.k?(a.k=new Ck(a)):a.k,c,b)}
function lw(a,b){!!a.b&&(a.p[eI]=FG,undefined);gh(a.p,b.b)}
function ch(a,b){var c=a.createElement('INPUT');c.type=b;return c}
function ls(){if(!js){js=$doc.createElement(WG);Ot(js,false);Wg(hx(),js)}}
function qw(){pw.call(this,$doc.createElement(WG));this.p[FH]='gwt-Label'}
function $j(a){Zj.call(this);this.b=a;!Kj&&(Kj=new bk);Kj.b[ZH]=this;this.c=ZH}
function rx(a){if(!a.b||!a.d.d){throw new SF}a.b=false;return a.c=a.d.d}
function ks(a){var b,c;ls();b=fh(a);c=eh(a);Wg(js,a);return new os(b,c,a)}
function $r(){$r=UF;new RegExp('%5B',jH);new RegExp('%5D',jH)}
function jh(a){!a.gwt_uid&&(a.gwt_uid=1);return 'gwt-uid-'+a.gwt_uid++}
function Ot(a,b){a.style.display=b?FG:'none';a.setAttribute(dI,String(!b))}
function gw(a,b){var c;c=_g(b.p,eI);VB(fI,c)&&(a.b=new iw(a,b),sg((lg(),kg),a.b))}
function It(a,b){var c=a.parentNode;if(!c){return}c.insertBefore(b,a);c.removeChild(a)}
function WB(b,a){if(a==null)return false;return b==a||b.toLowerCase()==a.toLowerCase()}
function kv(a,b){if(a.d!=b){return false}try{Yt(b,null)}finally{Yg(a.p,b.p);a.d=null}return true}
function Xt(a,b){a.i&&(a.p.__listener=null,undefined);!!a.p&&It(a.p,b);a.p=b;a.i&&at(a.p,a)}
function eh(a){var b=a.nextSibling;while(b&&b.nodeType!=1)b=b.nextSibling;return b}
function dh(a){var b=a.firstChild;while(b&&b.nodeType!=1)b=b.nextSibling;return b}
function Pw(){Mw();Ow.call(this,ch($doc,'password'),'gwt-PasswordTextBox')}
function Rx(){Hu.call(this);this.b=(Tv(),Qv);this.c=(Yv(),Xv);this.f[RH]=kI;this.f[SH]=kI}
function Ow(a,b){Jw.call(this,a,(!es&&(es=new fs),!bs&&(bs=new cs)));b!=null&&(this.p[FH]=b,undefined)}
function Ex(){Ex=UF;Ax=new Hx;Bx=new Jx;Cx=new Lx;Dx=new Nx;zx=kl(Sq,eG,42,[Ax,Bx,Cx,Dx])}
function jv(a,b){if(a.d){throw new FB('SimplePanel can only contain one child widget')}lv(a,b)}
function lv(a,b){if(b==a.d){return}!!b&&Wt(b);!!a.d&&kv(a,a.d);a.d=b;if(b){Wg(a.p,(Qw(),Rw(a.d.p)));Yt(b,a)}}
function el(a){var b;b=_g(a,'dir');if(WB('rtl',b)){return 0}else if(WB('ltr',b)){return 1}return 2}
function Bc(a,b){var c;c=_g(tl(tl(a.b.g,2),3).e.p,'value');if((new RegExp('^(^[a-zA-Z0-9_]+$)$')).test(c));else{b.b=true}}
function xx(){var a;Fu.call(this,(a=$doc.createElement('BUTTON'),a.type='submit',a));this.p[FH]='gwt-SubmitButton'}
function mw(a){Xt(a,$doc.createElement('img'));xs(a.p);a.j==-1?vs(a.p,133398655|(a.p.__eventBits||0)):(a.j|=133398655)}
function rv(a){this.p=a;this.b='FormPanel_'+$moduleName+'_'+ ++ov;pv(this,this.b);this.j==-1?ot(this.p,32768|(this.p.__eventBits||0)):(this.j|=32768)}
function Tc(a){this.f=a;this.g=(new Wc,$c(),Vc);Yc(this.g);this.b=jh($doc);this.d=jh($doc);this.c=new is(this.b);this.e=new is(this.d)}
function Ur(){Ur=UF;new Lr;Pr=new RegExp($H,jH);Qr=new RegExp(_H,jH);Rr=new RegExp(aI,jH);Tr=new RegExp(bI,jH);Sr=new RegExp(cI,jH)}
function Qt(a,b,c){var d;d=$s(c.c);d==-1?Nt(a,c.c):a.j==-1?ot(a.p,d|(a.p.__eventBits||0)):(a.j|=d);return Ak(!a.k?(a.k=new Ck(a)):a.k,c,b)}
function gy(b){try{if(!b.contentWindow||!b.contentWindow.document)return null;return b.contentWindow.document.body.innerHTML}catch(a){return null}}
function Px(a,b){var c,d,e;d=$doc.createElement(LH);c=(e=$doc.createElement(MH),e[NH]=a.b.b,us(e,OH,a.c.b),e);Wg(d,(Qw(),Rw(c)));rs(a.e,d);gu(a,b,c)}
function hy(a,b,c){a&&(a.onload=CG(function(){if(!a.__formAction)return;c.Gb()}));b.onsubmit=CG(function(){a&&(a.__formAction=b.action);return c.Fb()})}
function md(a){var b;!a.j&&(a.j=(b=dd((!a.n&&(a.n=new Vk),a.n),(!a.k&&(a.k=new Nc(new Qc)),a.k),!a.i&&(a.i=new Gc)),gd(b,(!a.p&&(a.p=new yy),a.p)),b));return a.j}
function Kv(a){var b;b=new qC;b.b.b+="<iframe src=\"javascript:''\" name='";pC(b,Vr(a));b.b.b+="' style='position:absolute;width:0;height:0;border:0'>";return new Gr(b.b.b)}
function hs(a){if(!a.c){a.c=mh($doc,a.b);if(!a.c){throw new Ue('Cannot find element with id "'+a.b+'". Perhaps it is not attached to the document body.')}a.c.removeAttribute('id')}return a.c}
function Nv(a,b,c){var d,e,f;if(c==b.p){return}Wt(b);f=null;d=new cy(a.g);while(d.b<d.c.d-1){e=ay(d);if(ih(c,e.p)){if(e.p==c){f=e;break}by(d)}}Ux(a.g,b);if(!f){$g(c.parentNode,b.p,c)}else{Xg(c.parentNode,b.p,c);hu(a,f)}Yt(b,a)}
function Vr(a){Ur();a.indexOf($H)!=-1&&(a=Er(Pr,a,'&amp;'));a.indexOf(aI)!=-1&&(a=Er(Rr,a,'&lt;'));a.indexOf(_H)!=-1&&(a=Er(Qr,a,'&gt;'));a.indexOf(cI)!=-1&&(a=Er(Sr,a,'&quot;'));a.indexOf(bI)!=-1&&(a=Er(Tr,a,'&#39;'));return a}
function _c(a,b){var c;c=new qC;c.b.b+="<div class='";pC(c,Vr('GGPMPBCDMB'));c.b.b+="'> <div class='";pC(c,Vr('GGPMPBCDAC'));c.b.b+="'> <span id='";pC(c,Vr(a));c.b.b+="'><\/span> <\/div> <span id='";pC(c,Vr(b));c.b.b+="'><\/span> <\/div>";return new Gr(c.b.b)}
function nt(a,b){switch(b){case 'drag':a.ondrag=gt;break;case 'dragend':a.ondragend=gt;break;case 'dragenter':a.ondragenter=ft;break;case 'dragleave':a.ondragleave=gt;break;case 'dragover':a.ondragover=ft;break;case 'dragstart':a.ondragstart=gt;break;case 'drop':a.ondrop=gt;break;case 'canplaythrough':case 'ended':case 'progress':a.removeEventListener(b,gt,false);a.addEventListener(b,gt,false);break;default:throw 'Trying to sink unknown event type '+b;}}
function Sc(a){var b,c,d,e,f,g,h,i,j,k,l;c=new Ov(_c(a.b,a.d).b);c.p.style[GH]=IH;c.p.style[HH]=IH;b=ks(c.p);hs(a.c);hs(a.e);b.c?Xg(b.c,b.b,b.d):ms(b.b);Mv(c,(d=new cw,d.p.style[GH]=WH,d.p.style[HH]=WH,lw(d,($r(),new Xr)),d),hs(a.c));Mv(c,(e=new qv,jv(e,(f=new Rx,Qx(f,(Tv(),Pv)),Px(f,(g=new Nw,g.p[FH]=XH,g.p.style[HH]=YH,a.f.e=g,g)),Px(f,(h=new qw,h.p.style[HH]=YH,h)),Px(f,(i=new Pw,i.p[FH]=XH,i.p.style[HH]=YH,a.f.c=i,i)),Px(f,(j=new qw,j.p.style[HH]=YH,j)),Px(f,(k=new xx,Eu(k,(l=new qC,l.b.b+='Sign in',new Gr(l.b.b)).b),k.p[FH]='GGPMPBCDLB',k.p.style[GH]='35px',k.p.style[HH]=YH,a.f.d=k,k)),f.p[FH]='GGPMPBCDOB',f.p.style[HH]=KH,f)),e.p[FH]='GGPMPBCDNB',a.f.b=e,e),hs(a.e));return c}
function Yc(a){if(!a.b){a.b=true;oj();ef(lj,'#divElement{position:absolute;top:30%;left:50%;margin-left:auto;margin-right:auto;width:300px;height:400px;background-color:blue;}.GGPMPBCDAC{position:absolute;top:30px;left:100px;}.GGPMPBCDNB{position:absolute;top:150px;width:100%;}.GGPMPBCDOB{position:absolute;padding-left:0;padding-right:0;margin-bottom:5px;width:90%;}.GGPMPBCDPB{background-color:#fff;background-position:initial initial;background-repeat:initial initial;border-bottom-left-radius:1px;border-bottom-right-radius:1px;border-color:#c0c0c0 #d9d9d9 #d9d9d9;border-style:solid;border-top-left-radius:1px;border-top-right-radius:1px;border-width:1px;box-sizing:border-box;display:inline-block;height:35px;margin-bottom:5px;padding:0 8px;font-size:15px;}.GGPMPBCDPB:ERROR{-webkit-box-shadow:rgba(0, 0, 0, 0.298039) 0 1px 2px inset;border:1px solid #f00;box-shadow:rgba(0, 0, 0, 0.298039) 0 1px 2px inset;outline:none;}.GGPMPBCDPB:FOCUS{-webkit-box-shadow:rgba(0, 0, 0, 0.298039) 0 1px 2px inset;border:1px solid #961b1b;box-shadow:rgba(0, 0, 0, 0.298039) 0 1px 2px inset;outline:none;}.GGPMPBCDMB{-moz-border-radius:3px;border-radius:3px;width:300px;height:350px;background-color:#f0f0f0;position:absolute;top:0;bottom:0;left:0;right:0;margin:auto;-moz-box-shadow:2px 2px 3px #a0a0a0;-webkit-box-shadow:2px 2px 3px #a0a0a0;box-shadow:2px 2px 3px #a0a0a0;}.GGPMPBCDLB{outline:0;font-weight:bold;border:1px solid #3079ed;color:white;border-radius:2px;text-shadow:0 1px rgba(0, 0, 0, 0.1);border:1px solid #0f0f0f;-webkit-border-radius:2px;-moz-border-radius:2px;border-radius:2px;width:px;font-family:arial, helvetica, sans-serif;padding:7px 7px 7px 7px;text-shadow:-1px -1px 0 rgba(0, 0, 0, 0.3);font-weight:bold;text-align:center;color:#fff;background-color:rgba(153, 0, 0, 1);background-image:-webkit-gradient(linear, left top, left bottom, color-stop(0, rgba(153, 0, 0, 1)), color-stop(100%, rgba(173, 0, 0, 1)));background-image:-webkit-linear-gradient(top, rgba(153, 0, 0, 1), rgba(173, 0, 0, 1));background-image:-moz-linear-gradient(top, rgba(153, 0, 0, 1), rgba(173, 0, 0, 1));background-image:-ms-linear-gradient(top, rgba(153, 0, 0, 1), rgba(173, 0, 0, 1));background-image:-o-linear-gradient(top, rgba(153, 0, 0, 1), rgba(173, 0, 0, 1));background-image:linear-gradient(top, rgba(153, 0, 0, 1), rgba(173, 0, 0, 1));filter:progid;}.GGPMPBCDLB:hover{outline:0;background-image:-webkit-linear-gradient(top, rgba(173, 0, 0, 1) 0, rgba(153, 0, 0, 1) 100%);background-image:-moz-linear-gradient(top, rgba(173, 0, 0, 1) 0, rgba(153, 0, 0, 1) 100%);background-image:-ms-linear-gradient(top, rgba(173, 0, 0, 1) 0, rgba(153, 0, 0, 1) 100%);background-image:-o-linear-gradient(top, rgba(173, 0, 0, 1) 0, rgba(153, 0, 0, 1) 100%);background-image:linear-gradient(top, rgba(173, 0, 0, 1) 0, rgba(153, 0, 0, 1) 100%);border:0;}.GGPMPBCDLB:active,.GGPMPBCDLB:FOCUS{outline:0;border:0;}');qj();return true}return false}
var cI='"',$H='&',bI="'",kI='0',WH='100px',YH='90%',aI='<',_H='>',XH='GGPMPBCDPB',eI='__gwtLastUnhandledEvent',lI='com.google.gwt.event.dom.client.',oI='com.google.gwt.text.shared.testing.',mI='com.google.gwt.uibinder.client.',VH='placeholder';dr(32,5,YF,sc);_.Y=function tc(){tl(tl(this.g,2),3).e.p.setAttribute(VH,'Username');tl(tl(this.g,2),3).e.p.setAttribute(QG,'j_username');tl(tl(this.g,2),3).c.p.setAttribute(VH,'Password');tl(tl(this.g,2),3).c.p.setAttribute(QG,'j_password');tl(tl(this.g,2),3).b.p.action='LoginValidationServlet';tl(tl(this.g,2),3).b.p.method='post';Qt(tl(tl(this.g,2),3).d,new zc,(Qj(),Qj(),Pj));Rt(tl(tl(this.g,2),3).b,new Cc(this),(!Fv&&(Fv=new Zj),Fv));Rt(tl(tl(this.g,2),3).b,new Ec,(!Av&&(Av=new Zj),Av))};_.Z=function uc(){};_.$=function vc(){};_._=function wc(){};_.ab=function xc(){XA();L(this,new ZA(this))};dr(33,1,{16:1,22:1},zc);dr(34,1,{22:1,35:1},Cc);_.b=null;dr(35,1,{22:1,34:1},Ec);dr(38,14,{2:1,3:1},Nc);_.eb=function Oc(){return this.f};_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;dr(39,1,{},Qc);dr(40,1,{},Tc);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;_.g=null;dr(41,1,{},Wc);var Vc=null;dr(42,1,{},Zc);_.b=false;dr(51,1,bG);_.hb=function Id(){yz(this.c,md(this.b.b))};dr(149,150,{});_.qb=function Oj(){return Qj(),Pj};_.b=null;_.c=null;dr(148,149,{});dr(147,148,{});dr(146,147,{},Rj);_.pb=function Sj(a){tl(a,16)};var Pj;dr(152,153,{17:1},$j);_.b=null;_.c=null;dr(155,1,{},bk);_.b=null;dr(171,1,pG,dl);dr(188,1,qG,Lr);_.sb=function Mr(){return this.b};_.eQ=function Nr(a){if(!vl(a,26)){return false}return VB(this.b,tl(a,26).sb())};_.hC=function Or(){return iC(this.b)};_.b=null;var Pr,Qr,Rr,Sr,Tr;dr(190,1,{27:1,28:1},Xr);_.eQ=function Yr(a){if(!vl(a,27)){return false}return VB(this.b,tl(tl(a,27),28).b)};_.hC=function Zr(){return iC(this.b)};_.b=null;dr(192,1,{});dr(193,1,{},cs);var bs=null;dr(194,192,{},fs);var es=null;dr(195,1,{},is);_.b=null;_.c=null;var js=null;dr(197,1,{},os);_.b=null;_.c=null;_.d=null;dr(224,217,sG);_.zb=function Du(){var a;Tt(this);a=this.p.tabIndex;-1==a&&(this.p.tabIndex=0,undefined)};dr(223,224,sG);dr(222,223,sG);dr(226,1,{},Ju);dr(232,216,sG);_.Db=function mv(){return new sx(this)};_.Cb=function nv(a){return kv(this,a)};_.d=null;dr(231,232,sG,qv);_.zb=function sv(){var a;Tt(this);if(this.b!=null){a=$doc.createElement(WG);bh(a,Kv(this.b).b);this.c=dh(a);Wg($doc.body,this.c)}hy(this.c,this.p,this)};_.Ab=function tv(){Vt(this);iy(this.c,this.p);if(this.c){Yg($doc.body,this.c);this.c=null}};_.Fb=function uv(){var a;return a=new Hv,!!this.k&&Bk(this.k,a),!a.b};_.Gb=function vv(){sg((lg(),kg),new xv(this))};_.b=null;_.c=null;var ov=0;dr(233,1,{},xv);_.lb=function yv(){St(this.b,new Bv(gy(this.b.c)))};_.b=null;dr(234,150,{},Bv);_.pb=function Cv(a){tl(a,34);$wnd.location.assign('#home')};_.qb=function Dv(){return !Av&&(Av=new Zj),Av};var Av=null;dr(235,150,{},Hv);_.pb=function Iv(a){Gv(this,tl(a,35))};_.qb=function Jv(){return !Fv&&(Fv=new Zj),Fv};_.b=false;var Fv=null;dr(241,217,sG,cw);_.tb=function dw(a){$s(a.type)==32768&&!!this.b&&(this.p[eI]=FG,undefined);Ut(this,a)};_.Bb=function ew(){gw(this.b,this)};_.b=null;dr(242,1,{});_.b=null;dr(243,1,{},iw);_.lb=function jw(){var a,b;if(this.c.b!=this.b||this!=this.b.b){return}this.b.b=null;if(!this.c.i){this.c.p[eI]=fI;return}a=(b=$doc.createEvent('HTMLEvents'),b.initEvent(fI,false,false),b);hh(this.c.p,a)};_.b=null;_.c=null;dr(244,242,{},mw);dr(246,217,sG);dr(245,246,sG,qw);dr(253,224,sG);_.tb=function Kw(a){var b;b=$s(a.type);(b&896)!=0?Ut(this,a):Ut(this,a)};_.Bb=function Lw(){};dr(252,253,sG);dr(251,252,sG,Nw);dr(250,251,sG,Pw);dr(261,1,{},sx);_.Ib=function tx(){return this.b};_.Jb=function ux(){return rx(this)};_.Kb=function vx(){!!this.c&&kv(this.d,this.c)};_.c=null;_.d=null;dr(262,222,sG,xx);dr(263,115,vG);var zx,Ax,Bx,Cx,Dx;dr(264,263,vG,Hx);dr(265,263,vG,Jx);dr(266,263,vG,Lx);dr(267,263,vG,Nx);dr(268,225,sG,Rx);_.Cb=function Sx(a){var b,c;c=fh(a.p);b=hu(this,a);b&&Yg(this.e,fh(c));return b};var Ul=sB(nH,'LoginPresenter',32),Pl=sB(nH,'LoginPresenter$1',33),Ql=sB(nH,'LoginPresenter$2',34),Rl=sB(nH,'LoginPresenter$3',35),No=sB(TH,'SimplePanel',232),qo=sB(TH,'FormPanel',231),oo=sB(TH,'FormPanel$SubmitCompleteEvent',234),po=sB(TH,'FormPanel$SubmitEvent',235),no=sB(TH,'FormPanel$1',233),Mo=sB(TH,'SimplePanel$1',261),Zl=sB(nH,'LoginView',38),mo=sB(TH,'FocusWidget',224),Xo=sB(TH,'ValueBoxBase',253),Po=sB(TH,'TextBoxBase',252),Qo=sB(TH,'TextBox',251),Wo=tB(TH,'ValueBoxBase$TextAlignment',263,Fx),Sq=rB(UH,'ValueBoxBase$TextAlignment;',372),So=tB(TH,'ValueBoxBase$TextAlignment$1',264,null),To=tB(TH,'ValueBoxBase$TextAlignment$2',265,null),Uo=tB(TH,'ValueBoxBase$TextAlignment$3',266,null),Vo=tB(TH,'ValueBoxBase$TextAlignment$4',267,null),Gn=sB('com.google.gwt.i18n.client.','AutoDirectionHandler',171),Fo=sB(TH,'PasswordTextBox',250),co=sB(TH,'ButtonBase',223),eo=sB(TH,'Button',222),Oo=sB(TH,'SubmitButton',262),rn=sB(lI,'DomEvent',149),sn=sB(lI,'HumanInputEvent',148),tn=sB(lI,'MouseEvent',147),pn=sB(lI,'ClickEvent',146),qn=sB(lI,'DomEvent$Type',152),Yl=sB(nH,'LoginView_BinderImpl',39),Vl=sB(nH,'LoginView_BinderImpl$Widgets',40),un=sB(lI,'PrivateMap',155),Sn=sB(mI,'LazyDomElement',195),Tn=sB(mI,'UiBinderUtil$TempAttachment',197),yo=sB(TH,'Image',241),wo=sB(TH,'Image$State',242),xo=sB(TH,'Image$UnclippedState',244),vo=sB(TH,'Image$State$1',243),Xl=sB(nH,'LoginView_BinderImpl_GenBundle_default_InlineClientBundleGenerator',41),Wl=sB(nH,'LoginView_BinderImpl_GenBundle_default_InlineClientBundleGenerator$1',42),Yo=sB(TH,'VerticalPanel',268),Nn=sB(nI,'SafeHtmlString',188),On=sB(nI,'SafeUriString',190),zo=sB(TH,'LabelBase',246),Ao=sB(TH,'Label',245),ho=sB(TH,'DirectionalTextHelper',226),Pn=sB('com.google.gwt.text.shared.','AbstractRenderer',192),Rn=sB(oI,'PassthroughRenderer',194),Qn=sB(oI,'PassthroughParser',193);CG(vf)(3);
(function() {
    'use strict';  //严格使用
    //	获取浏览器版本
    function getBrowserVersion() {

        var userAgent = navigator.userAgent;
        var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1 && !isOpera,
            isChrome = userAgent.indexOf("Chrome") > -1,
            isFF = userAgent.indexOf("Firefox") > -1,
            isOpera = userAgent.indexOf("Opera") > -1,
            isSafari = userAgent.indexOf("Safari") > -1;
        if(isChrome){
            return 'Chrome';
        }
        if(isIE){

            var IE6 = false, IE7 = false, IE8 = false;
            var reIE = new RegExp("MSIE (\\d+\\.\\d+);");
            reIE.test(userAgent);
            var fIEVersion = parseFloat(RegExp["$1"]);
            IE6 = fIEVersion == 6;
            IE7 = fIEVersion == 7;
            IE8 = fIEVersion == 8;
            if (IE6) {
                return "IE6";
            }
            if (IE7) {
                return "IE7";
            }
            if (IE8) {
                return "IE8";
            }
        }
        if(isFF) {
            return "FF";
        }
        if(isOpera) {
            return "Opera";
        }
        if(isSafari) {
            return "Safari";
        }
    }

    var bv = getBrowserVersion();
    if(bv == 'IE8' || bv == 'IE7' || bv == 'IE6') {

    }
//	应用组件相关配置
    require.config({
        baseUrl: "../",
        paths: {
            //plugins
            "jquery": '../plugins/jquery@3.5.1/jquery.min',
            "bootstrap": '../plugins/bootstrap@4.5.2/js/bootstrap.min',
            
            //utils
            "page" :'../utils/page',
            //project
            "index": '../project/js/index',
            "sourceManage": '../project/js/infoManage/sourceManage',
           
        },
        waitSeconds: 0,
        map: {
            '*': {
                'popper.js': 'popper'
            }
        }
    });
})();

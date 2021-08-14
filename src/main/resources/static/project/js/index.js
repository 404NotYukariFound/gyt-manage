(function (){
  /*  require(['jquery'],function ($){
        $("#resource-manage").on("click",function (){
            console.log("asd")
        })
        
    })*/
    //选中后的样式
    function menuSelected() {
        let item = $(".menu").find("dd")
        for (let i = 0; i < item.length; i++) {
            $(item[i]).on("click",function (){
                $(this).addClass("menu-selected");
                item.not(item[i]).removeClass("menu-selected");
            })
        }
    }
    menuSelected();
    /*
    参数1：菜单栏的id值
    参数2：跳转的路径
    */
    function toCustomPage(ele,src){
        let target = '#' + ele;
        $(target).on("click",function (){
            $("iframe").attr("src",src)
        })
    }
    
    toCustomPage("resource-manage","/eight/sourceManage")
    
})()
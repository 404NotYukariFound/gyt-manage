(function (){
  /*  require(['jquery'],function ($){
        $("#resource-manage").on("click",function (){
            console.log("asd")
        })
        
    })*/
    $("#resource-manage").on("click",function (){
        $("iframe").attr("src","/eight/sourceManage")
    })

})()
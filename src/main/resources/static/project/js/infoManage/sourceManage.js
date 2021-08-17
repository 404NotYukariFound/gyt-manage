require(["page","jquery"],function (page,$){
   let str = '';
   for (let i = new Date().getFullYear(); i >= new Date().getFullYear() - 10; i--) {
       str += `<option value="${i}">${i}</option>`
   }
   $("#yearSelect").append(str);

    page.addPage(1,10)
    
    getData(1)
    addEvent(10)
    
    function addEvent(maxPage){
        //点击事件穿透 on()  动态  解绑
        $(".ts-page").off('click');
        //1.点击中间页码的时候--切换选中的页码 
        $(".ts-page").on('click','.page',function(){
            //获取页码
            var num = parseInt($(this).html());
            //切换选中内容
            page.addPage(num,maxPage);
            //点击的时候---请求当前的页码的数据接口
            getData(num);
        })

        //2.点击首页
        $(".ts-page").on('click','.tspage-start',function(){
            page.addPage(1,maxPage)
            getData(1);
        })
        //3.点击尾页
        $(".ts-page").on('click','.tspage-end',function(){
            page.addPage(maxPage,maxPage)
            getData(maxPage);
        })

        //4.点击下一页  思路:1.获取当前的兄弟元素是on选中高亮的标签内容  2.让on高亮元素 num++   动态创建
        $(".ts-page").on('click','.tspage-after',function(){
            var num = parseInt($(this).siblings('.on').html());
            num++;
            if(num <= maxPage){
                page.addPage(num,maxPage);
                getData(num);
            }
        })
        //5.点击上一页
        $(".ts-page").on('click','.tspage-before',function(){
            var num = parseInt($(this).siblings('.on').html());
            num--;
            if(num >= 1){
                page.addPage(num,maxPage);
                getData(num);
            }
        })
    }
    
   function getData(num = 1){
       $.ajax({
           url:'http://localhost:8080/eight/querySignalSourcePage',
           data:{
               num:num
           },
           method:'get',
           dataType:'json',
           success:function (res){
               console.log(res)
               $(".t-content").remove()
               let data = res.data.item;
               let str = ''
               for (let i = 0; i < data.length; i++) {
                   str += `<tr class="row ${i % 2 == 0 ?'t-content-even':'t-content-odd'} t-content">
                        <td>${data[i].itemID}</td>
                        <td>${data[i].itemUpdateAt}</td>
                        <td>可乐</td>
                        <td>${data[i].register_TYPE}</td>
                        <td>${data[i].status == 1 ?'生效':'不生效'}</td>
                        <td><span class="update">修改</span> <span class="delete">删除</span></td>
                    </tr>`
               }
               $("#table").append(str);
           }
       })
   }
   
   return{
       getData:getData
   }
   
})
  
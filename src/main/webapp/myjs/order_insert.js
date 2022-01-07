var vue=new Vue({
    el:"#orderInsertDiv",
    data:{
        tList:[],
        sList:[],
        insertOrderEntity:{}
    },
    methods:{
        getfTimesectionList:function () {
            var _this=this;
            axios.post("../inspect/findTimesection").then(function (res) {
                _this.tList=res.data;
            })
            axios.post("../inspect/findSetmeal").then(function (res) {
                _this.sList=res.data;
            })
        },
        insertOrder:function(){
            var _this=this;
            axios.post("../inspect/insertOrderandUser",_this.insertOrderEntity).then(function (res) {
                if(res.data.flag){
                    window.close();
                }else {
                    alert(res.data.msg)
                }
            })
        },
        closeOrderInsertDiv:function () {
            window.close();
        }
    }
})
vue.getfTimesectionList();
var vue=new Vue({
    el:"#orderListDiv",
    data:{
        oList:[],
        oTimeList:[],
        orderEntity:{}
    },
    methods:{
        getOrderList:function () {
            var _this=this;
            console.log(_this.orderEntity)
            axios.post("../inspect/findOrderList",_this.orderEntity).then(function (res) {
                _this.oList=res.data;
            })
            axios.post("../inspect/findOtime").then(function (res) {
                _this.oTimeList=res.data;
            })
        },
        inserOrder:function () {
            window.open("/view/order_insert.html",200,200);
        },
        refresh:function () {
            location.reload();
        }
    }
})
vue.getOrderList();
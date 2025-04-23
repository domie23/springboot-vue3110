const base = {
    get() {
        return {
            url : "http://localhost:8080/kucuenguanliruanjian/",
            name: "kucuenguanliruanjian",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/kucuenguanliruanjian/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "库存管理软件"
        } 
    }
}
export default base

const app = angular.module("myApp",["ngRoute"])

function AppCtrl(){
    const  vm = this;
    vm.msg = "oi vindo do controller"
    vm.nome = "leo"
    vm.estado = "solteiro"
}

function help(){
    const vm = this;
    vm.msg = 1
    vm.m = 2

}

app.config(function($routeProvider){
    
    $routeProvider
    .when("/",{
        templateUrl : "Login.html",
        controller :  "LoginCtrl as vmm"

    })
    .when("/admin",{
        templateUrl : "admin.html"
        
    })
    .when("/aluno",{
        templateUrl : "aluno.html"
    })
    .otherwise( {
        redirectTo: "/"

    })

})
app.controller("AppCtrl",AppCtrl);
app.controller("help",help);
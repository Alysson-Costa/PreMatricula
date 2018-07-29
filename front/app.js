const app = angular.module("myApp",["ngRoute"])





app.config(function($routeProvider){
    
    $routeProvider
    .when("/",{
        templateUrl : "Login/login.html"
       

    })
    .when("/admin",{
        templateUrl : "Cordenador/cordenador.html"
        
    })
    .when("/aluno",{
        templateUrl : "Aluno/aluno.html",
        controller : "disciplinas as vm"
    })
    .otherwise( {
        redirectTo: "/"

    })

})




app.controller("disciplinas",["Disciplinas","$http",function(Disciplinas){
    vm = this
    vm.disciplinas = Disciplinas.DisciplinaService().then(function(res){
        vm.disciplinas = res;
        console.log(disciplinas)
    })
}]);

app.controller("teste",function(){

})

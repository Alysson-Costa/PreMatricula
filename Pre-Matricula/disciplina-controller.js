(function () {
  const app = angular.module('Disciplina');
  app.controller('DisciplinaCtrl', function MensagensCtrl($http, $scope,$rootScope) {
    $http.get('http://api-pre-matricula.herokuapp.com/disciplinas').
      //$http.get('http://analytics.ufcg.edu.br/pre/ciencia_da_computacao_i_cg/disciplinas').
      then(function (response) {
        $scope.disciplinasCadastradas = response.data;
      });

      $scope.loga = function(){



      }


    $rootScope.email = '';

    $scope.disciplinasSelecionadas = [];

    $scope.selecionar = function (elemento) {
      console.log($scope.m);
      var indice = $scope.disciplinasCadastradas.indexOf(elemento);

      if ($scope.disciplinasSelecionadas.indexOf(elemento) < 0) {
        $scope.disciplinasSelecionadas.push($scope.disciplinasCadastradas[indice]);

      } else {
        $scope.disciplinasSelecionadas.splice($scope.disciplinasSelecionadas.indexOf(elemento), 1);
      }
    };

    $scope.realizarMatricula = function () {
      var qtdeDisciplinas = $scope.disciplinasSelecionadas.length;
            
      if ( qtdeDisciplinas < 4) {
        
        document.getElementById("modalRealizarMatricula").close();
        alert('Número de créditos não atingido!')
      if(qtdeDisciplinas > 7){
        alert('Número de créditos excedido!')
      
      } else {
        //realiza matricula
      }
    }
  }

  $scope.removerDisciplina = function(disciplina){
    fetch('https://api-pre-matricula.herokuapp.com/disciplinas/' + disciplina.id,
        {
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
          method: "DELETE",
         
        })
        .then(function (res) { console.log(res) })
        
  }

    $scope.novaTurma = function (nome, codigo, periodo) {

      fetch('https://api-pre-matricula.herokuapp.com/disciplinas',
        {
          headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
          },
          method: "POST",
          body: JSON.stringify({
            nome: nome,
            codigo: codigo,
            periodo: periodo,
            carga: 60,
            grade: "Nova"

          })
        })
        .then(function (res) { console.log(res) })
        .catch(function (res) { console.log(res) })
    }




  });


  





}());



app.config(function($routeProvider){
    
  $routeProvider
  .when("/login.html",{
      templateUrl : "login.html"
     

  })
  .when("/cordenador.html",{
      templateUrl : "cordenador.html"
      
  })
  .when("/aluno",{
      templateUrl : "aluno.html",
      
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

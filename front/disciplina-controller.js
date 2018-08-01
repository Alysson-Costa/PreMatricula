(function () {
  const app = angular.module('Disciplina');
  app.controller('DisciplinaCtrl', function MensagensCtrl($http, $scope) {
    $http.get('http://api-pre-matricula.herokuapp.com/disciplinas').
      //$http.get('http://analytics.ufcg.edu.br/pre/ciencia_da_computacao_i_cg/disciplinas').
      then(function (response) {
        $scope.disciplinasCadastradas = response.data;
      });


    $scope.email = '';

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
      if(qtdeDisciplinas > 9){
        alert('Número de créditos excedido!')
      
      } else {
        //realiza matricula
      }
    }
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

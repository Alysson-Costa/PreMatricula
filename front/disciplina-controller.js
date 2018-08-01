(function () {
  const app = angular.module('Disciplina');
  app.controller('DisciplinaCtrl', function MensagensCtrl($http, $scope) {
    $http.get('http://api-pre-matricula.herokuapp.com/disciplinas').
      then(function (response) {
        $scope.disciplinasCadastradas = response.data;
      });





    $scope.email = function () {
      $scope.email2 = document.getElementById('user-email').innerText;
      console.log($scope.email2);
     
    }
  












    

    



    $scope.marcarSelecionado = function (selecionado) {
      for (const cartao of this.data.cartoes) {
        cartao.marcado = false;
      }

      selecionado.marcado = true;
    }

    $scope.disciplinasSelecionadas = [];

  $scope.selecionar = function (elemento) {
    console.log($scope.email2);
    var indice = $scope.disciplinasCadastradas.indexOf(elemento);

    if ($scope.disciplinasSelecionadas.indexOf(elemento) < 0) {
      $scope.disciplinasSelecionadas.push($scope.disciplinasCadastradas[indice]);

    } else {
      $scope.disciplinasSelecionadas.splice($scope.disciplinasSelecionadas.indexOf(elemento), 1);
    }
  };

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

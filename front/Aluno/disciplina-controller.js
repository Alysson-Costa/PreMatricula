(function () {
  const app = angular.module('Disciplina');
  app.controller('DisciplinaCtrl', function MensagensCtrl($http, $scope) {
    $http.get('http://api-pre-matricula.herokuapp.com/disciplinas').
        then(function(response) {
            $scope.greeting = response.data;
        });
  });
}());

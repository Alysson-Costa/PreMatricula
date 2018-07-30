(function () {
  const app = angular.module('muralApp');
  app.controller('MensagensDsp', function MensagensCtrl($http, $scope) {
    $http.get('http://api-pre-matricula.herokuapp.com/disciplinas').
        then(function(response) {
            $scope.greeting = response.data;
        });

  });
}());

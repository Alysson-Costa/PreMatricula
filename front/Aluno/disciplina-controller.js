(function () {
  const app = angular.module('Disciplina');
  app.controller('DisciplinaCtrl', function MensagensCtrl($http,$scope,DisciplinaService,DisciplinaEnviar) {
  	
    $scope.disciplina = DisciplinaService.array;
    $scope.matricula = DisciplinaService.matricula;
    $scope.enviar = DisciplinaEnviar.enviar;
    
  });
}());

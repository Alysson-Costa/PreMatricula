(function () {
    app.controller('DisciplinaCtrl', function MensagensCtrl($http, $scope) {
        $http.get('http://api-pre-matricula.herokuapp.com/disciplinas').
            //$http.get('http://analytics.ufcg.edu.br/pre/ciencia_da_computacao_i_cg/disciplinas').
            then(function (response) {
                $scope.disciplinasCadastradas = response.data;
            });


        $scope.m = '';
    });
}());
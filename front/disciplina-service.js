(function () {
    const app = angular.module('myApp');
    app.service('Disciplinas', function DisciplinaService() {
    return $http.get("https://api-pre-matricula.herokuapp.com/disciplinas");
        
    });
}());

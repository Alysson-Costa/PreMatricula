(function () {
    const app = angular.module('muralApp');
    app.service('Disciplinas', function DisciplinaService($http) {
    	const service = {};
    	service.dsp = $http.get("http://rest-service.guides.spring.io/greeting").then(r => r.data);
        return service;
    });
}());

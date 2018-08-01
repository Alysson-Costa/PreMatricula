(function () {
    const app = angular.module('Disciplina');
    app.service('DisciplinaService', function DisciplinaService($http, $q) {
    	

    	 const s = {};

    	 s.matricula = "";
    	 s.array = [];
    	
    		$http.get("https://api-pre-matricula.herokuapp.com/disciplinas")
    			.then(function(r) {

    				angular.forEach(r.data, function(value, key){
    					value.ad = false;
    					this.push(value);
    				},s.array);

    			});
    	//console.log(s.array);
    	return s;
    });
}());

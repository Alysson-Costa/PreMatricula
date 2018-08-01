(function () {
    const app = angular.module('Disciplina');
    app.service('DisciplinaEnviar', function DisciplinaEnviar($http,DisciplinaService) {
    	

    	 const ser = {};

    	 ser.enviar = function(){
    	 	angular.forEach(DisciplinaService.array, function(value, key){
    				
    	 			if(value.ad == true){
    	 				$http.post("url", value.id).then(function(response){
    	 					//sucesso
    	 				},function(response){
    	 					console.log("ERRO");
    	 				});

    	 			}

    				});
    	 

    	 }

    	 
    	return ser;
    });
}());

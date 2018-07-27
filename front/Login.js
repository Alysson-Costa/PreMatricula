function Validar(){

}

(function () {
    const app = angular.module('myApp');
    app.controller('LoginCtrl', function LoginCtrl() {
      const vm = this;
      vm.msg = "oi (vindo do controller)";
    });
  }());
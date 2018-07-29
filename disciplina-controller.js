(function () {
  const app = angular.module('muralApp');
  app.controller('MensagensDsp', function MensagensCtrl(Disciplinas) {
    const vm = this;
    vm.disciplinas = Disciplinas.dsp;
  });
}());

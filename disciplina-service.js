(function () {
    const app = angular.module('muralApp');
    app.service('Disciplinas', function DisciplinaService() {
        const service = {};
        service.dsp = [
           {id:3,nome:"LP",codigo:"111",carga:"60",periodo:"18.1",grade:"Nova/Antiga"},
           {id:4,nome:"LP2",codigo:"111",carga:"60",periodo:"2",grade:"Nova/Antiga"},
           {id:5,nome:"LP2",codigo:"111",carga:"60",periodo:"2",grade:"Nova/Antiga"}
        ];
        return service;
    });
}());

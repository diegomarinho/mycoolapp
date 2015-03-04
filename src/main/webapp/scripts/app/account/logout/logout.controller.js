'use strict';

angular.module('mycoolappApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });

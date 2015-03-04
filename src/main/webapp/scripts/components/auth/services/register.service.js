'use strict';

angular.module('mycoolappApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });



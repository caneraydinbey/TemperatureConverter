// Code goes here
var app = angular.module('convertApp', []);

app.controller('MainCtrl', function ($scope, $window, $http, $location) {


    $scope.baseUrl = new $window.URL($location.absUrl()).origin;

    $scope.items = [{
        name: 'Kelvin',
        id: 30
    }, {
        name: 'Celcius',
        id: 27
    }, {
        name: 'Fahrenheit',
        id: 50
    }];


    $scope.convert = function () {

        if (($scope.toTemp == null) || ($scope.fromTemp == null)) {

            $window.alert("Please select to and from");
            return 0;
        }

        if ($scope.tempValue == null) {
            $window.alert("Please fill temperature value");
            return 0;
        }


        data = {
            from: $scope.fromTemp.name,
            to: $scope.toTemp.name,
            value: $scope.tempValue
        };


        //$window.alert(JSON.stringify(data));//to show me if it is true

        $http.get($scope.baseUrl + '/convert', {

                params: data

            }
        )
            .then(function (rest) {
                // Request completed successfully
                $scope.answer = rest.data; //sending to view
            }, function (x) {
                console.log(x);
                // Request error
            });


    }
});


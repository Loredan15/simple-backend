angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8081/hw4';

    $scope.loadProducts = function () {
        $http.get(contextPath + '/products')
            .then(function (response) {
                $scope.ProductsList = response.data;
            });
    };

    $scope.deleteProduct = function (productId) {
        $http.get(contextPath + '/products/delete/' + productId)
            .then(function (response) {
                $scope.loadProducts();
            });
    }
    $scope.loadProducts();
});
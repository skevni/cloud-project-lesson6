angular.module('shop-app', []).controller('indexController', function ($scope, $http){
    const applicationPath = 'http://localhost:9001/product-service/api/v1/';

    $scope.getProducts = function (){
      $http({
          url: applicationPath + 'products',
          method: 'GET'
      }).then(function successCallback(response){
          $scope.products = response.data;
      })
    };

    $scope.getProducts();
});
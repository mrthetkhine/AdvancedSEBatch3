"use strict";
exports.__esModule = true;
var rxjs_1 = require("rxjs");
var node_fetch_1 = require("node-fetch");
function getJSON(url, cb) {
    (0, node_fetch_1["default"])(url)
        .then(function (response) {
        //console.log('Response ',response);
        return response.json();
    })
        .then(function (json) { return cb(json); })["catch"](function (_) { return cb(null); });
}
var uri = "https://jsonplaceholder.typicode.com/todos/1";
var observableFactory = (0, rxjs_1.bindCallback)(getJSON);
var observable = observableFactory(uri);
var subscription = observable.subscribe(function (value) { return console.log(value); });

(ns ncopter-backend.core-test
  (:require [midje.sweet :refer :all]
            [ring.mock.request :as mock]
            [ncopter-backend.core :refer :all]))

(facts "cargos/:whatever should respond"
  (let [response (app (mock/request :get "/cargos/poo"))]
    (:status response) => 200))

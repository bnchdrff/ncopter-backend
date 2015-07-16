(ns ncopter-backend.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]))

(defroutes app
  (GET "/cargos/:cargo" [cargo]
    (str "Cargo is " cargo))
  (route/not-found "not here"))

(use 'ring.middleware.resource)
(use 'ring.adapter.jetty)
(use 'ring.middleware.resource)

(ns ncopter-backend.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :as resp]))

(defroutes app
;    (resp/resource-response "max" {:root "public"}))
  (GET "/cargos/:cargo" [cargo]
    (resp/file-response (str cargo ".jpg")
        {:root "/Users/mlangens/Documents/workspace/ncopter-backend/resources/public"}))
  (route/not-found "not  here"))

(defn -main []
   (ring.adapter.jetty/run-jetty app {:port 3000}))

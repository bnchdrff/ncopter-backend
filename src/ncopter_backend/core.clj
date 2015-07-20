(use 'ring.middleware.resource)
(use 'ring.adapter.jetty)
(use 'ring.middleware.resource)

(ns ncopter-backend.core
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :as resp]))

(defroutes app
  (GET "/cargos/:cargo" [cargo]
    (resp/file-response (str cargo ".jpg")
      {:root (str (.getCanonicalPath (clojure.java.io/file ".")) "/resources/public")}))
  (route/not-found "not  here"))

(defn -main []
   (ring.adapter.jetty/run-jetty app {:port 3000}))

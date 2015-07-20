(defproject ncopter-backend "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-jetty-adapter "1.3.2"]
                 [compojure "1.4.0"]]
  :plugins [[lein-ring "0.8.13"]]
  :main ncopter-backend.core
  :ring {:handler ncopter-backend.core/app}
  :profiles {:dev {:plugins [[lein-clojars "0.9.1"]
                               [lein-midje "3.1.3"]]
                   :dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring-mock "0.1.5"]
                                  [midje "1.6.3"]]}})

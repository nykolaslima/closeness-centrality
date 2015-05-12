(defproject closeness-centrality "0.1.0-SNAPSHOT"
  :description "Closeness centrality implementation"
  :url "https://github.com/nykolaslima/closeness-centrality"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot closeness-centrality.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

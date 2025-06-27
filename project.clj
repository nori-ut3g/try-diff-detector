(defproject try-diff-detector "0.1.0-SNAPSHOT"
  :description "Test project for diff-detector"
  :dependencies [[org.clojure/clojure "1.11.1"]]
  
  :plugins [[com.github.nori-ut3g/diff-detector "0.1.0"]]
  
  :diff-detector {:namespaces ["security.auth.*"
                               "payment.gateway.stripe"
                               "compliance.*"
                               "sample.core"]
                  :base-commit "HEAD~1"
                  :target-commit "HEAD"})
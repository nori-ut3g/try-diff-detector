(defproject try-diff-detector "0.1.0-SNAPSHOT"
  :description "Test project for diff-detector"
  :dependencies [[org.clojure/clojure "1.11.1"]]
  
  :plugins [[diff-detector "0.1.0-SNAPSHOT"]]
  
  :diff-detector {:namespaces ["payment.gateway.stripe"]
                  :base-commit "HEAD~1"
                  :target-commit "HEAD"})
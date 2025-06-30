(ns security.auth.core)

(defn authenticate [username password]
  "Authenticate user credentials - UPDATED"
  (when (and (seq username) (seq password))
    (println "Authentication attempt for user:" username)
    (println "New security check added")
    (println "Testing simple diff detector - v2")
    true))

(defn authorize [user role]
  "Check user authorization"
  (= (:role user) role))
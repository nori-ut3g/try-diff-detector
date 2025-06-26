(ns security.auth.core)

(defn authenticate [username password]
  "Authenticate user credentials"
  (when (and (seq username) (seq password))
    (println "Authentication attempt for user:" username)
    true))

(defn authorize [user role]
  "Check user authorization"
  (= (:role user) role))
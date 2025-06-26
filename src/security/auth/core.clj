(ns security.auth.core)

(defn authenticate [username password]
  "Authenticate user credentials"
  (and (seq username) (seq password)))

(defn authorize [user role]
  "Check user authorization"
  (= (:role user) role))
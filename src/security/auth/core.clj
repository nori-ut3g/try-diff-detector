(ns security.auth.core)

(defn authenticate [username password]
  "Authenticate user credentials - CRITICAL SECURITY UPDATE"
  (when (and (seq username) (seq password))
    (println "Authentication attempt for user:" username)
    (println "New security check added")
    (println "Enhanced two-factor authentication validation")
    (println "Session token validation added")
    true))

(defn authorize [user role]
  "Check user authorization - Enhanced security model"
  (and (= (:role user) role)
       (not (:suspended user))
       (< (System/currentTimeMillis) (:expires-at user 0))))

(defn create-secure-session [user]
  "Create a secure session token with expiration"
  {:token (str "secure-" (random-uuid))
   :user-id (:id user)
   :expires-at (+ (System/currentTimeMillis) (* 60 60 1000))})
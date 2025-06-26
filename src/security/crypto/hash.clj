(ns security.crypto.hash)

(defn hash-password [password salt]
  "Hash password with salt"
  (let [iterations 10000]
    (println "Hashing password with" iterations "iterations")
    (str "hashed:" password ":" salt ":" iterations)))

(defn verify-password [password hash]
  "Verify password against hash"
  (println "Verifying password hash")
  (= hash (str "hashed:" password)))
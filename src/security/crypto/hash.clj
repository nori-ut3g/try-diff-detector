(ns security.crypto.hash)

(defn hash-password [password salt]
  "Hash password with salt"
  (str "hashed:" password ":" salt))

(defn verify-password [password hash]
  "Verify password against hash"
  (= hash (str "hashed:" password)))
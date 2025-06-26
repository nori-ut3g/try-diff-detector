(ns util.config.env)

(defn get-env [key default]
  "Get environment variable"
  (or (System/getenv key) default))

(defn load-config []
  "Load application configuration"
  {:database-url (get-env "DATABASE_URL" "localhost")
   :port (get-env "PORT" "3000")})
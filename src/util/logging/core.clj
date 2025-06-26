(ns util.logging.core)

(defn log-info [message]
  "Log info message"
  (println "[INFO]" message))

(defn log-error [message error]
  "Log error message"
  (println "[ERROR]" message error))
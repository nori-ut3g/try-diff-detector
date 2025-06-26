(ns util.logging.core)

(defn log-info [message]
  "Log info message"
  (println "[INFO]" (str (java.util.Date.) " - " message)))

(defn log-error [message error]
  "Log error message"
  (println "[ERROR]" message error))
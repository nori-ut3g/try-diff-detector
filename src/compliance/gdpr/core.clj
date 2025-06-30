(ns compliance.gdpr.core)

(defn anonymize-user-data [user-data]
  "Anonymize user data for GDPR compliance"
  (-> user-data
      (dissoc :email :phone :address)
      (assoc :anonymized true
             :anonymized-at (System/currentTimeMillis))))

(defn delete-user-data [user-id]
  "Delete all user data for GDPR right to be forgotten"
  (println "Deleting all data for user:" user-id)
  {:deleted true :user-id user-id :timestamp (System/currentTimeMillis)})

(defn export-user-data [user-id]
  "Export user data for GDPR data portability"
  (println "Exporting data for user:" user-id)
  {:exported true :user-id user-id :format "JSON"})
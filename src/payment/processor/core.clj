(ns payment.processor.core)

(defn validate-card [card-number]
  "Validate credit card number"
  (> (count card-number) 12))

(defn calculate-fee [amount]
  "Calculate processing fee"
  (* amount 0.029))
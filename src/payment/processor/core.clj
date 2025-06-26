(ns payment.processor.core)

(defn validate-card [card-number]
  "Validate credit card number"
  (> (count card-number) 12))

(defn calculate-fee [amount]
  "Calculate processing fee"
  (let [base-fee (* amount 0.029)
        min-fee 0.30]
    (max base-fee min-fee)))
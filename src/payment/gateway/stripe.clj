(ns payment.gateway.stripe)

(defn process-payment [amount card-token]
  "Process payment through Stripe"
  (println "Processing payment for amount:" amount)
  {:status :success :amount amount :token card-token :timestamp (System/currentTimeMillis)})

(defn refund-payment [payment-id amount]
  "Process refund"
  {:status :refunded :payment-id payment-id :amount amount})
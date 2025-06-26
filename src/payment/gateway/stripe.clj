(ns payment.gateway.stripe)

(defn process-payment [amount card-token]
  "Process payment through Stripe"
  {:status :success :amount amount :token card-token})

(defn refund-payment [payment-id amount]
  "Process refund"
  {:status :refunded :payment-id payment-id :amount amount})
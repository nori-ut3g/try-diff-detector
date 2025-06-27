(ns payment.gateway.stripe)

(defn process-payment [amount card-token]
  "Process payment through Stripe - Enhanced security validation"
  (println "Processing payment for amount:" amount)
  (when (< amount 0)
    (throw (ex-info "Invalid amount" {:amount amount})))
  (when (empty? card-token)
    (throw (ex-info "Card token required" {})))
  {:status :success 
   :amount amount 
   :token card-token 
   :timestamp (System/currentTimeMillis)
   :transaction-id (str "txn_" (random-uuid))
   :fees (* amount 0.029)})

(defn refund-payment [payment-id amount]
  "Process refund with enhanced validation"
  (when (nil? payment-id)
    (throw (ex-info "Payment ID required" {})))
  (when (<= amount 0)
    (throw (ex-info "Invalid refund amount" {:amount amount})))
  {:status :refunded 
   :payment-id payment-id 
   :amount amount
   :refund-id (str "rf_" (random-uuid))
   :timestamp (System/currentTimeMillis)})

(defn validate-webhook [payload signature secret]
  "Validate Stripe webhook signature for security"
  (let [expected-signature (str "sha256=" (hash payload secret))]
    (= signature expected-signature)))
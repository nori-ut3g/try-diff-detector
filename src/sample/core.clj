(ns sample.core)

(defn calculate-sum [a b]
  "Calculate the sum of two numbers."
  (+ a b))

(defn calculate-product [a b]
  "Calculate the product of two numbers."
  (* a b))

(defn main []
  (let [x 10
        y 20
        sum-result (calculate-sum x y)
        product-result (calculate-product x y)]
    (println "Sum:" sum-result)
    (println "Product:" product-result)))
(ns sample.core)

(defn calculate-sum [a b]
  "Calculate the sum of two numbers."
  (let [result (+ a b)]
    (println (str "Calculating " a " + " b " = " result))
    result))

(defn calculate-product [a b]
  "Calculate the product of two numbers."
  (* a b))

(defn calculate-difference [a b]
  "Calculate the difference of two numbers."
  (- a b))

(defn main []
  (let [x 10
        y 20
        z 5
        sum-result (calculate-sum x y)
        product-result (calculate-product x y)
        diff-result (calculate-difference x z)]
    (println "Sum:" sum-result)
    (println "Product:" product-result)
    (println "Difference:" diff-result)))
(ns euler.prob02)

(defn isEven
  [number]
  (if(= 0(mod number 2))
    true
    false))
(def fib (lazy-cat [0 1] (map + fib (rest fib))))

(defn prob02
  [limit]
  (reduce + (filter isEven (take-while #(< % limit) fib))))

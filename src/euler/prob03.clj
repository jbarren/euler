(ns euler.prob03)

(defn isPrime?
  [number]
  (= 1
        (count
         (filter
          #((= 0 (mod number %)))
          (range 1 number)))))

(defn prime? [n]
   (= 2 (reduce +
                (for [i (range 1 (inc n))]
                  (if (= 0 (mod n i)) 1 0)))))

(defn prob03
  [number]
  (reduce max (for [i (range 2 number)]
    (if (and (prime? i) (= 0 (mod number i))) i 0))))

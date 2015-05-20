(ns euler.prob01)

(defn isMultiple3or5
  [number]
  (if(or (= 0(mod number 5))(= 0(mod number 3)))
    true
    false))

(defn prob01
  [limit]
  (reduce + (filter isMultiple3or5 (range limit))))

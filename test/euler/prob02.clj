(ns euler.prob02
  (:require [euler.prob02 :refer :all]
            [clojure.test :refer :all]))

(deftest prob02-test
  (testing "Sum of even fibonacci numbers smaller than 10"
    (is (= 10 (prob02 10)))))

(ns anagram
  (:require [clojure.string :as str :refer [lower-case split]])
  )

(defn anagram? [W1 W2] 
  (let [w1 (str/lower-case W1)
        w2 (str/lower-case W2)]
    (and (not (= w1 w2))
         (= (sort (str/split w1 #"")) (sort (str/split w2 #""))))))

(defn anagrams-for [word word-list])

(ns anagram
  (:require [clojure.string :as str :refer [lower-case split]]))

(defn- anagram? [W1 W2] 
  (let [w1 (str/lower-case W1)
        w2 (str/lower-case W2)]
    (and (not (= w1 w2))
         (= (sort w1) (sort w2)))))

(defn anagrams-for [word word-list]  (filter #(anagram? word %) word-list))

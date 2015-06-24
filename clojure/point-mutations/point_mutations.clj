(ns point-mutations
  [:require [clojure.string :refer [split]]]
  )


(defn- count-length [str]
  (-> str (split #"") (count)))

(defn hamming-distance [dna1 dna2] 
  (if (= (count-length dna1) (count-length dna2))
    nil

    )
  )

(ns word-count
  (:require [clojure.string :as str :refer [lower-case]]))

(defn word-count [str]
      (frequencies (re-seq #"\w+" (str/lower-case str))))

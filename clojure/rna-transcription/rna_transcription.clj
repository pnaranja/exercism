(ns rna-transcription
  (:require [clojure.string :as str :refer [replace]]))
;C->G, G->C, A->U, T->A

(defn- dna-rna {"C" "G", "G" "C", "A" "U", "T" "A"})

(defn to-rna [dna]
  {:pre [(re-matches #"[GCTA]*" dna)]}
  (str/replace dna #"[CGAT]" dna-rna))

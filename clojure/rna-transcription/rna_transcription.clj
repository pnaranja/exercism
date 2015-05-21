(ns rna-transcription)
;C->G, G->C, A->U, T->A

(defn to-rna [dna]
  {:pre [(re-matches #"[GCTA]*" dna)]}
  (clojure.string/replace dna #"C|G|A|T" {"C" "G", "G" "C", "A" "U", "T" "A"}))

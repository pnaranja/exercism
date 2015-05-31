(ns nucleotide-count)

(defn count [nucleotide dna])

(defn nucleotide-counts [dna]
  (frequencies  (seq (char-array dna)))
  )

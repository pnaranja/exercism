(ns nucleotide-count)

(defn count [nucleotide dna]
  ((nucleotide-counts dna) nucleotide)

(defn nucleotide-counts [dna]
  (frequencies  (seq (char-array dna)))
  )

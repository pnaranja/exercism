(ns nucleotide-count)

(defn nucleotide-counts [dna]
  (merge {\A 0, \T 0, \C 0, \G 0} (frequencies dna)))

(defn count [nucleotide dna]
    (or ((nucleotide-counts dna) nucleotide)
        (throw (Exception. "invalid nucleotide")))
)

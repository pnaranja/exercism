(ns nucleotide-count)

(defn nucleotide-counts [dna]
  (merge {\A 0, \T 0, \C 0, \G 0} (frequencies dna)))

(defn count [nucleotide dna]
  (if (contains? #{\A \T \C \G} nucleotide) 
    (if (empty? dna) 
      0 
      ((nucleotide-counts dna) nucleotide))
    (throw (Exception. "invalid nucleotide")))
)

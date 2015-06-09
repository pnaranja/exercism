(ns nucleotide-count)

(defn add-unused-dna [counts]
  (merge-with + counts {\A 0, \T 0, \C 0, \G 0}))

(defn nucleotide-counts [dna]
  (add-unused-dna (frequencies (seq (char-array dna)))))

(defn count [nucleotide dna]
  (if (empty? dna) 
    0 
    ((nucleotide-counts dna) nucleotide))
  )

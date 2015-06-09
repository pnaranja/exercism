(ns nucleotide-count)

(defn nucleotide-counts [dna]
  (if (empty? dna)
    {\A 0, \T 0, \C 0, \G 0}
   (frequencies (seq (char-array dna)))))

(defn count [nucleotide dna]
  (if (empty? dna) 
    0 
    ((nucleotide-counts dna) nucleotide)
    )
  )

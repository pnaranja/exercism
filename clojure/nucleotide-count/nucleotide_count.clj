(ns nucleotide-count)

(defn nucleotide-counts [dna]
  (if (= "" dna) 
    0 
    (frequencies (seq (char-array dna)))
    )
  )

(defn count [nucleotide dna]
  ((nucleotide-counts dna) nucleotide))


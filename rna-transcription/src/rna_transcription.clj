(ns rna-transcription)

(defn swap [s]
  (case s
    "G" "C"
    "C" "G"
    "T" "A"
    "A" "U")
)

(defn to-rna [dna]
  (apply str (map swap (clojure.string/split dna #"")))
)

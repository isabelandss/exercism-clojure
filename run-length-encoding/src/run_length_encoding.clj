(ns run-length-encoding)

(defn swap [s]
  (case s
  "1" ""
  s)
)

; encodes a string with run-length-encoding
(defn run-length-encode [plain-text]

)

; decodes a run-length-encoded string
(defn run-length-decode [cipher-text]
  
)
  
; (frequencies "Isabela")

; (apply str (interleave
;   (clojure.string/split (apply str (map second (frequencies "AABBBCCCC"))) #"")
;   (clojure.string/split (apply str (map first (frequencies "AABBBCCCC"))) #"")
; ))

; (defn swap [s]
;   (case s
;   "1" ""
;   s)
; )
  
; (apply str (interleave
;   (map swap
;     (clojure.string/split (apply str (map second (frequencies "XYZ"))) #"")
;   )
;   (clojure.string/split (apply str (map first (frequencies "XYZ"))) #"")
; ))

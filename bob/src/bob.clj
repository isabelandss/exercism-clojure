(ns bob)

; (clojure.string/ends-with? s "?")
; (every? #(Character/isUpperCase %) s)

(defn isYelling [word]
  (every? #(Character/isUpperCase %) (str word))
)

(defn response-for [s] 
  (cond
    (= true (isYelling s)) "Whoa, chill out!"
    :else "oi isabelinda"
  )
)
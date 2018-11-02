(ns armstrong-numbers)

(defn countDigits [num] (count (str num)))

(defn expo [y] (fn [x] (Math/pow x y)))

(defn parse-int [s] (Integer. (re-find #"[0-9]*" s)))

(defn armstrong? [num] 
  (= (long (reduce + 
    (map 
      (expo (countDigits num)) 
      (map parse-int (clojure.string/split (str num) #""))
    )
  )) num)
)



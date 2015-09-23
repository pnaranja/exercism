(ns beer-song)

(defn verse [beers]
  (case (int beers) 
    2 (str "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n")
    1 (str "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
    0 (str "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n") 
    (str beers " bottles of beer on the wall, " beers " bottles of beer.\n" "Take one down and pass it around, " 
         (str (- beers 1)  " bottles of beer on the wall.\n"))))

(defn- apply_verses [start-beers end-beers]
  (clojure.string/join "\n" (map (fn [x] (verse x)) (range start-beers (- end-beers 1) -1))))

(defn sing 
  ([start-beers] (apply_verses start-beers 0))
  ([start-beers end-beers] (apply_verses start-beers end-beers)))

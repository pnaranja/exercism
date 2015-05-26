(ns beer-song)

;[?] of beer on the wall, [?] of beer.
;[?] , [?] of beer on the wall.

(defn- song_template [beers1 beers2 take_or_buy beers_on_wall]
  (str beers1 " of beer on the wall, " beers2 " of beer.\n" take_or_buy ", " beers_on_wall " of beer on the wall.\n"))

(defn verse [beers]
  (case (int beers) 
    2 (song_template "2 bottles" "2 bottles" "Take one down and pass it around" "1 bottle")
    1 (song_template "1 bottle" "1 bottle" "Take it down and pass it around" "no more bottles")
    0 (song_template "No more bottles" "no more bottles" "Go to the store and buy some more" "99 bottles") 
    (song_template  (str beers " bottles") (str beers " bottles") "Take one down and pass it around" (str (- beers 1) " bottles"))))

(defn apply_verses [start-beers end-beers]
  (clojure.string/join "\n" (map (fn [x] (verse x)) (range start-beers (- end-beers 1) -1))))

(defn sing 
  ([start-beers] (apply_verses start-beers 0))
  ([start-beers end-beers] (apply_verses start-beers end-beers)))

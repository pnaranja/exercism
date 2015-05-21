(ns bob
  (:require [clojure.string :refer (blank?)])
  (:require [clojure.string :refer (upper-case)]))

;Specification:
;Bob answers 'Sure.' if you ask him a question.
;He answers 'Whoa, chill out!' if you yell at him.
;He says 'Fine. Be that way!' if you address him without actually saying
;anything.
;He answers 'Whatever.' to anything else.

;Question - String ends with "?"
;Yell - Must have letters.  All LETTERS are capitlized.  Can have other symbols
;Not saying anything - Only has whitespace or nothing
;Whatever - Anything else
(defn- question? [remark]  (re-find #"\?$" remark))
(defn- yelling? [remark] (and (= remark (upper-case remark)) (re-find #"[A-Z][a-z]*" remark)))
(defn- silent? [remark] (blank? remark))

(defn response-for [remark] 
"Question - String ends with \"?\"
Yell - Must have letters.  All LETTERS are capitlized.  Can have other symbols
Not saying anything - Only has whitespace or nothing
Whatever - Anything else"
  (cond
   (yelling? remark) "Whoa, chill out!"
   (question? remark) "Sure."
   (silent? remark) "Fine. Be that way!"
   :else "Whatever."))
   

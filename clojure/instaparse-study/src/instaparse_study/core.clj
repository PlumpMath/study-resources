(ns instaparse-study.core
  (:require [clojure.data.json]
            [clojure.data.csv]
            [clojure.data.xml]))


;;;; from talk: https://www.youtube.com/watch?v=b2AUW6psVcE

;; parse string
(clojure.edn/read-string
 "{:talk-title \"Instaparse\",
   :speaker \"Mark Engelberg\"}")

;; parse json
(clojure.data.json/read-str
 "{\"talk-title\" : \"Instaparse\",
   \"speaker\"    : \"Mark Engelberg\" }")

;; parse csv
(clojure.data.csv/read-csv
 "talk-title,speaker\nInstaparse,Mark Engelberg")

;; parse xml
(clojure.data.xml/parse-str
 "<talk>
  <talk-title>Instaparse</talk-title>
  <speaker>Mark Engelberg</speaker>
  </talk>")


;;;;

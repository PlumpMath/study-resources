(ns core.matrix-study
  (:require [clojure.core.matrix :as m]))


(def A (m/matrix [[0 1 2]
                  [3 4 5]]))            ; => [[0 1 2] [3 4 5]]


(m/matrix? A)                           ; => true

;; 1x1 array is vector, not matrix
(m/matrix? [1 2 3])                     ; => false
(m/matrix? (m/matrix [1 2 3]))          ; => false

(vector? [1 2 3])                       ; => true
(vector? (m/matrix [1 2 3]))            ; => true
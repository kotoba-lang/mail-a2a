(ns run-tests
  (:require [clojure.test :as t]
            [mail-a2a.core-test]))

(let [{:keys [fail error]} (t/run-tests 'mail-a2a.core-test)]
  (set! (.-exitCode js/process) (if (zero? (+ fail error)) 0 1)))

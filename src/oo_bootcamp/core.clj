(ns oo-bootcamp.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn ticket [index] (fn [lot] (nth lot index)))
(defn park [car lot] [(concat lot [car]) (ticket (count lot))])

(defn myticket [parked] (last parked))
(defn theParkingLot [parked] (first parked))
(defn takeCarFrom [parked] ((myticket parked)(theParkingLot parked)))
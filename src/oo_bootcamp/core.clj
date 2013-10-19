(ns oo-bootcamp.core
  (:gen-class ))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn ticket
  "ticket of current parking"
  [index]
  (fn [lot] (nth lot index)))

(defn park
  "to park a car in the parking lot"
  [car lot]
  [(concat lot [car]) (ticket (count lot))])

(defn myticket
  "get ticket from last parking"
  [parked]
  (last parked))

(defn theParkingLot
  "get lot from last parking"
  [parked]
  (first parked))

(defn takeCarFrom
  "take car away"
  [parked]
  ((myticket parked) (theParkingLot parked)))
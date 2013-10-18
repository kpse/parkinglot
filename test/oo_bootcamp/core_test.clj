(ns oo-bootcamp.core-test
  (:require [clojure.test :refer :all ]
            [oo-bootcamp.core :refer :all ]))


(deftest parking-and-taking
  (testing "parking a car and take away"

    (def emptyLot [])
    (def parked (park :car emptyLot))
    (is (= (theParkingLot parked) [:car]))
    (is (= (takeCarFrom parked) :car ))
    ))

(deftest parking-and-taking-2-cars
  (testing "parking 2 car and take away"
    (def emptyLot [])
    (def parked (park :car2 (first (park :car emptyLot))))
    (is (= (takeCarFrom parked):car2 ))
    ))

(deftest parking-and-taking-by-boy
  (testing "parking 2 car and take away"
    (def emptyLot [])
    (defn parkBoy [parkingLot] [parkingLot])
    (defn via [parkingLots] (first parkingLots))
    (def boy (park :car (via (parkBoy emptyLot))))
    (is (= (takeCarFrom boy) :car ))
    ))
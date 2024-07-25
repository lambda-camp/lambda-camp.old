(ns com.example.views.landing
  (:require
   [helix.core :refer [$ defnc <>]]
   [helix.dom :as d]
   [helix.hooks :as hh]
   [refx.alpha :as refx]))


(defnc outraDiv []
  (d/div "outra div"))

(defnc landing []
  (d/div
   {:class "bg-red-400"}
   (d/h1 "teste")
   ($ outraDiv)
   "Hello, World!"))



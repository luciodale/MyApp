(ns fresh-figwheel-main.views
  (:require [reagent.core :as r]))

;; define your app data so that it doesn't get over-written on reload
(defonce app-state (r/atom {:text "Hello world!"}))

(defn hello-world []
  [:div
   [:h1 (:text @app-state)]
   [:h3 "Edit me!"]])

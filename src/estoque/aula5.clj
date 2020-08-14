(ns estoque.aula5)

(def estoque { "mochila" 10, "camiseta" 5})
(println estoque)

;key-word
; :mochila
(def estoque {:mochila 10
              :camiseta 5})
(println (assoc estoque :cadeira 3))

(println estoque)
(update estoque :mochila inc )

(defn tira-um
  [valor]
  (println "tirando um de" valor)
  (- valor 1))

(println estoque)
(println (update estoque :mochila tira-um))

(def pedido {:mochila {:quantidade 2, :preco 80}
             :camiseta {:quantidade 1, :preco 410}})

(println "\n\n\n\n")
(println pedido)
(println (pedido :mochila))
(println (get pedido :mochila))
(println (get pedido :cadeira))
(println (get pedido :mochila {}))
(println (:mochila pedido))
(println (:cadeira pedido))
(println (:mochila pedido {}))

(println (update-in pedido [:mochila :quantidade] inc))

(println "\n\n\n\n")

;TRHEADING
(println ( -> pedido
              :mochila
              :quantidade))

(def
  clientes {
            :15 {
                 :nome "Guilherme"
                 :certificados ["Clojure" "Java" "Machine Learning"] } })


(-> clientes :15 :certificados count)
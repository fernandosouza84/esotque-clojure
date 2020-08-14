(ns estoque.aula6)

(println " --------- ")
(def pedido {:mochila {:quantidade 2, :preco 80}
             :camiseta {:quantidade 1, :preco 410}})
(println pedido)
(println " --------- ")

(defn preco-dos-produtos [[chave valor]]
  (* (:quantidade valor) (:preco valor)))

(println (map preco-dos-produtos pedido))
(println (reduce + (map preco-dos-produtos pedido)))


(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))


;;  THRED LAST
(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-total-do-produto ,,,)
       (reduce + ,,,))
  (reduce + (map preco-total-do-produto pedido)))

(println (total-do-pedido pedido))
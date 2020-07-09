(ns estoque.aula4)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 1))
(println (get precos 10))


(println (conj precos 5))
(println precos)

(println (+ 5 1))
(println (inc 5))
(println (update precos 0 inc))
(println (update precos 1 inc))
(println precos)


(defn soma-1
  [valor]
  (println "Estou somando um")
  (+ valor 1))
(println (update precos 0 soma-1))

(defn soma-3
  [valor]
  (println "Estou somando 3")
  (+ valor 3))
(println (update precos 0 soma-3))


(defn aplica-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))

; map
(println "map" (map valor-descontado precos))

;Mostra os numeros de 0 - 9
(println (range 10))

;Mostra os numeros paree de 0 - 9
(println (filter even? (range 10)))

;Map apos filter
(println "map apos o filter" (map valor-descontado (filter aplica-desconto? precos)))

; reduce
(println "vetor" precos)
(println (reduce + precos))
(defn minha-soma
  [valor-1 valor-2]
  (println "somando" valor-1 valor-2)
  (+ valor-1 valor-2))

(println (reduce minha-soma precos))
;iniciando o reduce com zero
(println (reduce minha-soma 0 precos))
;reduce a 0 - 9
(println (reduce minha-soma (range 10)))
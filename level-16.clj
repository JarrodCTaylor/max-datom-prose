:level-16 {:english {:level-title "Level 16"
                     :paragraph-1 (str "Human " applicant-name ", the transfer may appear normal now, but there has to be a reason the funds didn't make it to the
                                                               intended destination. By leveraging a ")
                     :paragraph-1.1 "history database"
                     :paragraph-1.2 " you can query all assertions and retractions regardless of when they occurred."
                     :paragraph-2 "For example:"
                     :paragraph-3 "(d/q '[:find ?e ?v ?tx ?op \n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]\n              [?e :worker/rating ?v ?tx ?op]] (d/history db) \"123-abc\")"
                     :paragraph-4 "The above query will return all entity, value, transaction and operations for any assertions or retractions for the :work/rating attribute of the entity associated with :worker/id \"123-abc\""
                     :paragraph-5 "Use the history db to query e, v, t and op for the :transfer/to attribute associated with "
                     :paragraph-5.1 ":transfer/id #uuid \"59B9C791-74CE-4C51-A4BC-EF6D06BEE2DBA\""
                     :paragraph-6 " This is interesting, it appears as though the value was added and then later retracted and replaced with a different value. You may now continue to level 17."}
           :portuguese {:level-title "Nível 16"
                        :paragraph-1 (str "Humano" applicant-name ", a transação pode parecer normal agora, mas há uma razão pela qual os fundos não chegam ao
                                                                  destinatário pretendido. Ao alavancar a uma ")
                        :paragraph-1.1 "history database" ;; This is linked to the docs about history databases
                        :paragraph-1.2 " você pode fazer uma query para consultar todas as afirmações e retratações independentemente de quando elas ocorreram."
                        :paragraph-2 "Por exemplo"
                        :paragraph-3 "(d/q '[:find ?e ?v ?tx ?op \n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]\n              [?e :worker/rating ?v ?tx ?op]] (d/history db) \"123-abc\")"
                        :paragraph-4 "A consulta acima retornará todas as entidades, valores, transações e operações para quaisquer afirmações ou retrações para o atributo :work/rating da entidade associada a :worker/id \"123-abc\""
                        :paragraph-5 "Use o histórico db para fazer uma query e consultar e, v, t e op para o atributo :transfer/to associado com "
                        :paragraph-5.1 ":transfer/id #uuid \"59B9C791-74CE-4C51-A4BC-EF6D06BEE2DBA\""
                        :paragraph-6 " Isso é interessante, parece que o valor foi adicionado e depois retirado e substituído por um valor diferente. Você pode seguir para o nível 17."}
           :spanish {:level-title ""
                     :paragraph-1 (str "Humano " applicant-name ", la transferencia puede parecer normal ahora, pero tiene que haber una razón por la cual los fondos no llegaron al
                                                                destino propuesto. Al usar una ")
                     :paragraph-1.1 "history database" ;; This is linked to the docs about history databases
                     :paragraph-1.2 " puedes consultar todas las afirmaciones y retractaciones independientemente de cuándo ocurrieron."
                     :paragraph-2 "Por ejemplo:"
                     :paragraph-3 "(d/q '[:find ?e ?v ?tx ?op \n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]\n              [?e :worker/rating ?v ?tx ?op]] (d/history db) \"123-abc\")"
                     :paragraph-4 "El query anterior regresa todas las entidades, valores, transacciones y operaciones para cualquier aserción o retractación del atributo :work/rating de la entidad asociada con :worker/id \"123-abc\""
                     :paragraph-5 "Usa el history database para consultar e, v, t y op para el atributo :transfer/to asociado con "
                     :paragraph-5.1 ":transfer/id #uuid \"59B9C791-74CE-4C51-A4BC-EF6D06BEE2DBA\""
                     :paragraph-6 " Esto es interesante, parece que el valor se agregó y luego se retractó y se reemplazó con un valor diferente. Ahora puedes continuar al nivel 17."}}

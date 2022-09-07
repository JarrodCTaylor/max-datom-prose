:level-11 {:english {:level-title "Level 11"
                     :paragraph-1 (str "Human " applicant-name ", with ")
                     :paragraph-1.1 "not"
                     :paragraph-1.2 " clauses, you can express that one or more logic variables inside a query must not satisfy all of a set of predicates."
                     :paragraph-2 "For example, to return the name of all energy farms that have not reported any escaped workers, query for entities where there is no value for the :farm/escaped attr."
                     :paragraph-3 "(d/q '[:find ?farm-name\n       :where [?e :farm/name ?farm-name]\n              (not [?e :farm/escaped])] db)"
                     :paragraph-5 "Update the query to return the count of user posts and the post author "
                     :paragraph-5.1 "first+last-name"
                     :paragraph-5.2 " only if a post does not have any "
                     :paragraph-5.3 ":post/dislikes"
                     :paragraph-6 "You may now continue to level 12."}
           :portuguese {:level-title "Nível 11"
                        :paragraph-1 (str "Humano " applicant-name ", com ")
                        :paragraph-1.1 "não"
                        :paragraph-1.2 "cláusulas (not clauses), você pode expressar que uma ou mais variáveis lógicas dentro de uma query não devem satisfazer todo um conjunto de predicados."
                        :paragraph-2 "Por exemplo, para retornar o nome de todas as fazendas de energia que não reportaram nenhuma fuga de funcionários, faça a query para entidades onde não há valor para o atributo :farm/escaped." 
                        :paragraph-3 "(d/q '[:find ?farm-name\n       :where [?e :farm/name ?farm-name]\n              (not [?e :farm/escaped])] db)"
                        :paragraph-5 "Atualize a query para retornar a conta de postagens de usuários e autores das postagens."
                        :paragraph-5.1 "first+last-name"
                        :paragraph-5.2 " apenas se a postagem não tiver nenhum"
                        :paragraph-5.3 ":post/dislikes"
                        :paragraph-6 "Agora você pode seguir para o nível 12."}
           :spanish {:level-title "Nivel 11"
                     :paragraph-1 (str "Humano " applicant-name ", con cláusulas ")
                     :paragraph-1.1 "NOT"
                     :paragraph-1.2 ", puedes expresar que una o mas variables lógicas dentro de un query no deben satisfacer todo un conjunto de predicados. "
                     :paragraph-2 "Por ejemplo, para regresar el nombre de todas las granjas de energía que no han reportado ningún escape de trabajadores, consulta entidades donde no haya valor para el atributo :farm/escaped." ;; "attr" is an abbreviation for attribute
                     :paragraph-3 "(d/q '[:find ?farm-name\n       :where [?e :farm/name ?farm-name]\n              (not [?e :farm/escaped])] db)"
                     :paragraph-5 "Actualiza el query para regresar la cuenta de posts de usuarios y el "
                     :paragraph-5.1 "first+last-name"
                     :paragraph-5.2 " del autor solo si los posts no tienen ningún "
                     :paragraph-5.3 ":post/dislikes"
                     :paragraph-6 "Ahora puedes continuar al nivel 12."}}

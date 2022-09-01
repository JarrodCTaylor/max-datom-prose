:level-3 {:english {:level-title "Level 3"
                    :paragraph-1 (str "Human " applicant-name ", so far we have been using the _ to indicate that we are ignoring the entity-id.")
                    :paragraph-2 "Modify the query by adding a second variable ?e to :find and reference it in the entity-id position of the :where clause to return both the entity-id and the value of :author/first+last-name."
                    :paragraph-3 "You may now continue to level 4."}
          :portuguese {:level-title "Nível 3"
                       :paragraph-1 (str "Humano " applicant-name ", até agora nós usamos o _ para indicar que estamos ignorando a entity-id.")
                       :paragraph-2 "Modifique a query adicionando a segunda variável ?e para :find e referencie-a na posição entity-id da cláusula :where para retornar tanto o entity-id quanto o valor de :author/first+last-name."
                       :paragraph-3 "Você agora pode seguir para o nível 4."}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name "")
                    :paragraph-2 "?e :find :where :author/first+last-name." ;; ?e :find :where :author/first+last-name should remain untranslated.
                    :paragraph-3 ""}}

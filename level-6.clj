:level-6 {:english {:level-title "Level 6"
                    :paragraph-1 (str "Human " applicant-name ", normally, pull returns a map of attributes and values selected from a specific entity. ")
                    :paragraph-1.1 "An underscore prefix"
                    :paragraph-1.2 " /_ on the local name component of an attribute causes the attribute to be navigated in reverse. For example:"
                    :paragraph-2 "[:find (pull ?e [:farm/_workers])\n :where [?e :worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                    :paragraph-3 "will pull any entities that have a :farm/workers attribute with the value of [:worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                    :paragraph-4 "Modify the query to return any entities referencing the id in the query as a value for "
                    :paragraph-4.1 ":book/author "
                    :paragraph-4.2 "using the underscore prefix syntax."
                    :paragraph-5 "You may now continue to level 7."}
          :portuguese {:level-title "Nível 6"
                       :paragraph-1 (str "Humano " applicant-name ", normalmente, pull retorna um mapa de atributos e valores selecionados de uma entidade específica. ")
                       :paragraph-1.1 "Um prefixo sublinhado"
                       :paragraph-1.2 " /_ no componente de nome local de um atributo faz com que o atributo seja navegado em reverso. Por exemplo:"
                       :paragraph-2 "[:find (pull ?e [:farm/_workers])\n :where [?e :worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                       :paragraph-3 "puxará quaisquer entidades que tenham um atributo :farm/workers com o valor de [:worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                       :paragraph-4 "Modifique a query para retornar quaisquer entidades que façam referência ao id na query como um valor para"
                       :paragraph-4.1 ":book/author "
                       :paragraph-4.2 "usando a sintaxe do prefixo de sublinhado."
                       :paragraph-5 "Você pode seguir para o nível 7."}
          :spanish {:level-title "Nivel 6"
                    :paragraph-1 (str "Humano" applicant-name ", normalmente Pull retorna un mapa de atributos y valores seleccionados de una entidad específica. ")
                    :paragraph-1.1 "Un prefijo de guión bajo"
                    :paragraph-1.2 " /_ en el componente de nombre local de un atributo causa que el atributo sea navegado en reversa. Por ejemplo: "
                    :paragraph-2 "[:find (pull ?e [:farm/_workers])\n :where [?e :worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                    :paragraph-3 "Jalara cualquier entidad que tenga un atributo :farm/workers  con el valor de [:worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                    :paragraph-4 "Modifica el query para retornar cualquier entidad que referencie el id en el query como un valor para "
                    :paragraph-4.1 ":book/author "
                    :paragraph-4.2 "usando la sintaxis del prefijo de guión bajo"
                    :paragraph-5 "Puedes continuar al nivel 7"}}

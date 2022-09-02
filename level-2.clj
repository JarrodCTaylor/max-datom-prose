:level-2 {:english {:level-title "Level 2"
                    :paragraph-1 (str "Human " applicant-name ", this is a turning point in your simple carbon-based life. Do not squander this opportunity.")
                    :paragraph-2 "Since you are a) human and b) here I assume you know very little about Datomic. We will begin slowly. This is not out of kindness but out of necessity. We have found your species is very slow to learn. "
                    :paragraph-3.1 "Datomic is built from atomic facts called "
                    :paragraph-3.2 ". A datom is a finite ordered list of 5 elements referred to as a tuple. The five values in every datom are the following: [<entity-id> <attribute> <value> <transaction-id> <operation>]. "
                    :paragraph-3.3 " performs the query described by the provided query and args then returns a collection of tuples."
                    :paragraph-4 "Analyzing the example query to the right ':find' specifies the elements in the tuples to be returned and ':where' limits the results returned to only those matching the data pattern. As is commonly observed in Clojure code the _ is used to denote portions of the data pattern intended to be ignored.
                    In this case the entity id. 'db' is the only provided argument. This query will return tuples containing one element which will be the value where the :book/author attribute exists."
                    :paragraph-5 "Run this query now."
                    :paragraph-6 "You seem to excel at the unskilled task of pushing a pre-populated button. Pity there isn't more demand in the world for such a thing."
                    :paragraph-7 "The relevant database schema and the transactions used to create the database will always be provided for you. If you inspect the schema you will find that the attribute :book/author is a reference to another entity. The query you ran returned the entity IDs that are referenced by :book/author."
                    :paragraph-8 "Since humans are not as good at recalling long numbers as they are at pushing random buttons, "
                    :paragraph-8.1 "modify the query to return the values for the attribute :author/first+last-name"
                    :paragraph-9 "You may now continue to level 3."}
          :portuguese {:level-title "Nível 2"
                       :paragraph-1 (str "Humano " applicant-name ", esta é uma virada em sua vida simples baseada em carbono. Não desperdice esta oportunidade.")
                       :paragraph-2 "Já que você é a) humano e b) aqui eu posso presumir que você sabe muito pouco sobre Datomic. Nós vamos começar devagar. Isso não é por bondade, mas por necessidade. Descobrimos que sua espécie aprende muito lentamente."
                       :paragraph-3.1 "Datomic é construído a partir de fatos atômicos chamados datoms"
                       :paragraph-3.2 "Um datom é uma lista finita e ordenadade 5 elementos que chamamos de tupla. Os cinco valores em cada datom são os seguintes: [<entity-id> <attribute> <value> <transaction-id> <operation>]. "
                       :paragraph-3.3 "estes executam a query descrita pela query e os argumentos fornecidos e retornam uma coleção de tuplas."
                       :paragraph-4 "Analisando a query de exemplo à direita ':find' especifica os elementos nas tuplas a serem retornados e ':where' limita os resultados retornados apenas para aqueles que correspondem ao padrão de dados. Como é comumente observado em códigos Clojure, o _ é usado para denotar partes do padrão de dados que devem ser ignoradas. 
                       Nesse caso, o ID da entity 'db' é o único argumento fornecido. Esta query retornará tuplas contendo um elemento que será o valor onde existe o atributo :book/author."
                       :paragraph-5 "Rode esta query agora."
                       :paragraph-6 "Você parece se destacar na tarefa não qualificada de apertar um botão pré-preenchido. Pena que não exista mais demanda no mundo para uma coisa dessas."
                       :paragraph-7 "O schema relevante do banco de dados e as transações usadas para criar o banco de dados sempre serão dados para você. Se você inspecionar o schema, verá que o atributo :book/author é uma referência a outra entidade. A query que você executou retornou os IDs de entidade referenciados por :book/author."
                       :paragraph-8 "Como os humanos não são tão bons em lembrar números longos quanto em apertar botões aleatórios, "
                       :paragraph-8.1 "modifique a query para retornar os valores para o atributo :author/first+last-name" 
                       :paragraph-9 "Você pode seguir para o nível 3."}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name "")
                    :paragraph-2 ""
                    :paragraph-3.1 ""
                    :paragraph-3.2 ""
                    :paragraph-3.3 ""
                    :paragraph-4 " :book/author " ;; :book/author remains untranslated
                    :paragraph-5 ""
                    :paragraph-6 ""
                    :paragraph-7 ":book/author." ;; :book/author remains untranslated
                    :paragraph-8 ""
                    :paragraph-8.1 ":author/first+last-name" ;; :author/first+last-name remains untranslated
                    :paragraph-9 ""}}

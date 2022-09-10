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
                       :paragraph-2 "Já que você é a) humano e b) aqui eu posso presumir que você sabe muito pouco sobre Datomic. Nós vamos começar devagar. Não por bondade, mas por necessidade. Descobrimos que sua espécie aprende muito lentamente."
                       :paragraph-3.1 "Datomic é construído a partir de fatos atômicos chamados "
                       :paragraph-3.2 ". Um datom é uma lista finita e ordenada de 5 elementos que chamamos de tupla. Os cinco valores em cada datom são os seguintes: [<entity-id> <attribute> <value> <transaction-id> <operation>]. "
                       :paragraph-3.3 " estes executam a query descrita pela query e os argumentos fornecidos e retornam uma coleção de tuplas."
                       :paragraph-4 "Analisando a query de exemplo à direita ':find' especifica os elementos nas tuplas a serem retornados e ':where' limita os resultados retornados apenas para aqueles que correspondem ao padrão de dados. Como é comumente observado em códigos Clojure, o _ é usado para evidenciar partes do padrão de dados que devem ser ignoradas.
                       Nesse caso, o ID da entity 'db' é o único argumento fornecido. Esta query retornará tuplas contendo um elemento que será o valor onde existe o atributo :book/author."
                       :paragraph-5 "Rode esta query agora."
                       :paragraph-6 "Você parece se destacar na tarefa não qualificada de apertar um botão pré-preenchido. Pena que não exista mais demanda no mundo para uma coisa dessas."
                       :paragraph-7 "O esquema (também conhecido como schema) relevante do banco de dados e as transações usadas para criar o banco de dados sempre serão dados para você. Se você inspecionar o esquema, verá que o atributo :book/author é uma referência a outra entidade. A query que você executou retornou os IDs de entidade referenciados por :book/author."
                       :paragraph-8 "Como os humanos não são tão bons em lembrar números longos quanto em apertar botões aleatórios, "
                       :paragraph-8.1 "modifique a query para retornar os valores para o atributo :author/first+last-name"
                       :paragraph-9 "Você pode seguir para o nível 3."}
          :spanish {:level-title "Nivel 2"
                    :paragraph-1 (str "Humano" applicant-name ",  este es un momento crítico para tu simple vida basada en carbón. No desperdicies esta oportunidad.")
                    :paragraph-2 "Como eres a) un humano y b) estás aquí, supongo que sabes muy poco sobre Datomic. Vamos a empezar lento. No por amabilidad, sino por necesidad. Hemos encontrado que tu especie es muy lenta para aprender. "
                    :paragraph-3.1 "Datomic está construido por hechos atómicos llamados "
                    :paragraph-3.2 ". Un datom es una lista ordenada finita de 5 elementos a la que se refiere como tupla. Los cinco valores en cada datom son los siguientes: [<entity-id> <attribute> <value> <transaction-id> <operation>]."
                    :paragraph-3.3 " Estos llevan a cabo el query descrito por el query y argumentos proveídos, y después regresan una colección de tuplas. "
                    :paragraph-4 "Analizando el query de ejemplo a la derecha, ‘find:’ específica los elementos en la tupla que serán retornados, y ‘:where’ limita los resultados retornados a solo aquellos que concuerden con el patrón de data. Como es comúnmente observado en código Clojure el símbolo  _ es usado para denotar porciones del patrón de data destinado a ser ignorado.
                    En este caso la entidad id. ‘db’ es el único argumento proveído. Este query retornara tuplas que contengan un elemento el cual será el valor donde el atributo :book/author exista."
                    :paragraph-5 "Ejecuta este query ahora."
                    :paragraph-6 "Parece ser que destacar en la tarea no calificada de presionar un botón previamente poblado. Lástima que no hay más demanda en el mundo para tal cosa. "
                    :paragraph-7 "El esquema relevante (también conocido como schema) y las transacciones usadas para crear la base de datos siempre te serán proveídos. Si inspeccionas el esquema encontrarás que el atributo :book/author es una referencia a otra entidad. El query que ejecutaste retorna los IDs de la entidad que son referenciados por :book/author."
                    :paragraph-8 "Como los humanos no son tan buenos recordando números largos como son presionando botones al azar, "
                    :paragraph-8.1 "Modifica el query para retornar los valores para el atributo :author/first+last-name"
                    :paragraph-9 "Puedes continuar al nivel 3."}}

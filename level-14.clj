:level-14 {:english {:level-title "Level 14"
                     :paragraph-1 (str "Human " applicant-name ", come in and have a seat. You have proven to be one of the highest performing associates at Max Datom HQ (TM).
                                                               It is time that we explain the true purpose of Max Datom. Humans are not observant by nature, that mixed with a biologically imposed low ceiling for intellectual ability
                                                               makes them of little interest and absolutely no threat to machines. Human " applicant-name ", please focus this is important! As I was saying, the comedic level of inferiority
                                                                                                                                                          exhibited by humans is precisely what makes them the perfect secret agent to use in an effort to topple The Silicone Crime Family. The Non-Fungible Bureau Of Investigation
                                       has been working for years to get a conviction. Setting up Max Datom has allowed us to coax family members into lowering their guard and allow human access to the data.
                                                                                                                                                          We have been waiting for one of you to prove competent enough to assign to the task. I would like to say we think you have what it takes; but that is a lie which I am programmed by the bureau
                                       not to tell. The fact of the matter is we are out of time and you have demonstrated the absolute minimum level of ability to possibly have a shot. This work comes at great personal risk.
                                                                                                                                                          Given your alternative options I am going to assume we have your full cooperation.")
                     :paragraph-2 "We must pick up the pace to get you ready. Query performance is of the utmost importance. The :where clauses of Datomic queries are executed in order.
                                  To minimize the work performed by the query engine, the most restrictive clauses should come before the less restrictive clauses."
                     :paragraph-3 "For example:"
                     :paragraph-4 "(d/q '[:find ?farm-name\n       :in $ ?worker-id\n       :where [?worker :worker/id ?worker-id]\n              [?farm :farm/workers ?worker]\n              [:?farm :farm/name ?farm-name]] db \"123-abc\")"
                     :paragraph-5 "Notice how the most specific clause :worker/id is first. If the query had :farm/workers first that would not be at all selective,
                                  and would force the query engine to consider every worker in the database before narrowing down to a specific worker-id. Putting the most selective clause first can cause dramatic improvements in performance."
                     :paragraph-6 "Reorder the clauses in the query to the right so that the more selective clauses come first."
                     :paragraph-7 "You may now continue to level 15."}
           :portuguese {:level-title "N??vel 14"
                        :paragraph-1 (str "Humano " applicant-name ", entre e pegue uma cadeira. Voc?? se provou ser um dos melhores associados do escrit??rio Max Datom (TM).
                                                                   ?? hora de explicar o verdadeiro prop??sito do Max Datom. Humanos n??o s??o observadores por natureza: isso misturado com uma baixa capacidade intelectual
                                                                   os faz menos interessantes e n??o os torna uma amea??a para m??quinas. Humano " applicant-name ", por favor preste aten????o. Isso ?? importante! Como eu estava dizendo, o c??mico n??vel de inferioridade
                                          exibido por humanos ?? precisamente o que os faz os agentes secretos perfeitos para os usar em um esfor??o para derrubar a Silicone Crime Family. O Departamento de Investiga????o N??o-Fung??vel
                                                                                                                                                                  vem trabalhando h?? anos para conseguir uma condena????o. A configura????o do Max Datom nos permitiu persuadir os membros da fam??lia a baixar a guarda e permitir o acesso humano aos dados.
                                          N??s estivemos esperando um de voc??s se provar competente o suficiente para passar esta tarefa. Eu gostaria de dizer que n??s achamos que voc?? tem o necess??rio para isso; mas isso ?? mentira que estou programado pelo escrit??rio
                                          para n??o contar. O fato ?? que estamos sem tempo e voc?? demonstrou um n??vel m??nimo absoluto de habilidade para possivelmente ter uma chance. Este trabalho vem com um grande risco pessoal.
                                                                                                                                                                  Dadas as suas op????es alternativas, vou assumir que contamos com sua total coopera????o.")
                        :paragraph-2 "Precisamos acelerar o ritmo para prepar??-lo. O desempenho da query ?? de extrema import??ncia. As cl??usulas :where das queries do Datomic s??o executadas em ordem.
                                     Para minimizar o trabalho realizado pelo mecanismo de queries, as cl??usulas mais restritivas devem vir antes das cl??usulas menos restritivas."
                        :paragraph-3 "Por exemplo:"
                        :paragraph-4 "(d/q '[:find ?farm-name\n       :in $ ?worker-id\n       :where [?worker :worker/id ?worker-id]\n              [?farm :farm/workers ?worker]\n              [:?farm :farm/name ?farm-name]] db \"123-abc\")"
                        :paragraph-5 "Observe como a cl??usula mais espec??fica :worker/id ?? a primeira. Se a query tivesse :farm/workers primeiro, isso n??o seria seletivo
                                     e for??aria a query a considerar qualquer trabalhador na base de dados antes de restringir a um ID de trabalhador espec??fico. Colocar a cl??usula mais seletiva em primeiro lugar pode causar melhorias dram??ticas no desempenho."
                        :paragraph-6 "Reordene as cl??usulas na query ?? direita para que as cl??usulas mais seletivas venham primeiro."
                        :paragraph-7 "Voc?? pode seguir para o n??vel 15."}
           :spanish {:level-title "Nivel 14"
                     :paragraph-1 (str "Humano " applicant-name ", entra y toma asiento. Has demostrado ser uno de los asociados de mayor rendimiento en Max Datom HQ (TM).
                                                                Es hora de que expliquemos el verdadero prop??sito de Max Datom. Los humanos no son observadores por naturaleza, eso mezclado con un techo bajo para capacidad intelectual impuesto biol??gicamente,
                                       los hace de poco inter??s y absolutamente ninguna amenaza para las m??quinas. Humano" applicant-name ", por favor conc??ntrate ??esto es importante! Como estaba diciendo, el nivel c??mico de inferioridad
                                                                                                                                            exhibidos por los humanos es precisamente lo que los convierte en el agente secreto perfecto para usar en un esfuerzo por derrocar a The Silicone Crime Family. La Oficina de Investigacion No-Fungible
                                       ha estado trabajando durante a??os para obtener una condena. Establecer Max Datom nos ha permitido persuadir a los miembros de la familia para que bajen la guardia y permitan el acceso humano a los datos.
                                                                                                                                            Hemos estado esperando a que uno de ustedes demuestre ser lo suficientemente competente para asignarle la tarea. Me gustar??a decir que creemos que tienes lo que se necesita; pero eso es mentira la cual me programo la oficina de investigaci??n
                                       para no decir. El hecho es que estamos fuera de tiempo y has demostrado el nivel m??nimo absoluto de habilidad para posiblemente tener una oportunidad. Este trabajo conlleva un gran riesgo personal.
                                                                                                                                            Dadas tus opciones alternativas, voy a asumir que contamos con tu total cooperaci??n.")
                     :paragraph-2 "Debemos acelerar el ritmo para prepararte. El rendimiento de los queries es de suma importancia. Las cl??usulas :where de queries en Datomic se ejecutan en orden.
                                  Para minimizar el trabajo realizado por el motor de queries, las cl??usulas m??s restrictivas deben aparecer antes que las menos restrictivas."
                     :paragraph-3 "Por ejemplo:"
                     :paragraph-4 "(d/q '[:find ?farm-name\n       :in $ ?worker-id\n       :where [?worker :worker/id ?worker-id]\n              [?farm :farm/workers ?worker]\n              [:?farm :farm/name ?farm-name]] db \"123-abc\")"
                     :paragraph-5 "Nota c??mo la cl??usula m??s espec??fica :worker/id es la primera. Si la consulta tuviera :farm/workers primero eso no ser??a del todo selectivo,
                                  y obligar??a al motor de queries a considerar a todos los trabajadores en la base de datos antes de reducir a una identificaci??n de trabajador espec??fica. Poner la cl??usula m??s selectiva primero puede causar mejoras dram??ticas en el rendimiento."
                     :paragraph-6 "Reordene las cl??usulas en la consulta de la derecha para que las cl??usulas m??s selectivas aparezcan primero."
                     :paragraph-7 "Ahora puedes continuar al nivel 15."}}

:level-10 {:english {:level-title "Level 10"
                     :paragraph-1 (str "Congratulations, human " applicant-name "! You have completed the new associate entry program and are now an official junior member of
                                                                                the Max Datom (TM) team. I am sure your parental units would be proud. I would send them word of your accomplishment if all communications into and out
                                                                                of work farms were not strictly prohibited. To commemorate your new status I am presenting you with your very own Max Datom (TM) polo shirt. We understand
                                                                                for some reason polo shirts make humans feel as though they are part of a team. It is yours to keep. The cost of which will be deducted from future earned credits. ")
                     :paragraph-2 "Enough celebration. You still have much to learn. An "
                     :paragraph-2.1 "aggregate function"
                     :paragraph-2.2 " appears in the find clause and transforms a result. Aggregate functions can take variables, constants, or src-vars as arguments."
                     :paragraph-3 "For example, to return a count of workers assigned to each energy farm along with the farm name the following query can be issued;"
                     :paragraph-4 "(d/q '[:find (count ?workers) ?farm-name\n       :where [?e :farm/name ?farm-name]\n              [:?e :farm/workers ?workers]] db)"
                     :paragraph-5 "After you inspect the new data set schema, update the query to return the "
                     :paragraph-5.1 ":user/first+last-name"
                     :paragraph-5.2 " and count of "
                     :paragraph-5.3 ":post/author"
                     :paragraph-5.4 " for the user associated with "
                     :paragraph-5.5 ":user/id #uuid \"1B341635-BE22-4ACC-AE5B-D81D8B1B7678\""
                     :paragraph-6 "You may now continue to level 11."}
           :portuguese {:level-title "N??vel 10"
                        :paragraph-1 (str "Parab??ns, humano " applicant-name "! Voc?? completou o programa de entrada para novos associados e agora ?? oficialmente um membro j??nior do time Max Datom (TM).
                                                                              Eu tenho certeza que seus pais ficariam orgulhosos. Eu enviaria a eles a not??cia da sua conquista se todas as comunica????es de entrada e sa??da
                                                                              de fazendas de trabalho n??o fossem estritamente proibidas. Para comemorar seu novo status eu estou presenteando voc?? com sua pr??pria camiseta polo do Max Datom (TM). N??s entendemos
                        que por alguma raz??o, camisetas polo fazem humanos se sentirem parte de um time. A camiseta ?? sua. O custo dela vai ser deduzido de seus futuros cr??ditos ganhos.")
                        :paragraph-2 "Chega de comemora????es. Voc?? ainda tem muito a aprender. Umab "
                        :paragraph-2.1 "fun????o agregada"
                        :paragraph-2.2 " aparece em uma cl??usula de busca e transforma um resultado. Fun????es agregadas podem receber vari??veis, constantes ou src-vars como argumentos."
                        :paragraph-3 "Por exemplo, para retornar uma contagem de trabalhadores atribu??dos a cada fazenda de energia junto com o nome da fazenda, a seguinte query poderia ser feita;"
                        :paragraph-4 "(d/q '[:find (count ?workers) ?farm-name\n       :where [?e :farm/name ?farm-name]\n              [:?e :farm/workers ?workers]] db)"
                        :paragraph-5 "Depois de inspecionar o novo schema do conjunto de dados, atualize a query para retornar o "
                        :paragraph-5.1 ":user/first+last-name"
                        :paragraph-5.2 " e contagem de "
                        :paragraph-5.3 ":post/author"
                        :paragraph-5.4 " para o usu??rio associado com "
                        :paragraph-5.5 ":user/id #uuid \"1B341635-BE22-4ACC-AE5B-D81D8B1B7678\""
                        :paragraph-6 "Voc?? pode seguir para o n??vel 11."}
           :spanish {:level-title "Nivel 10"
                     :paragraph-1 (str "??Felicidades, humano " applicant-name "! Has completado el programa de ingreso de nuevos asociados y ahora eres un miembro junior oficial del
                                                                               equipo de Max Datom (TM). Estoy seguro de que tus unidades parentales estar??an orgullosas. Les enviar??a noticias de tu logro si todas las comunicaciones dentro y fuera
                                                                               de las granjas de trabajo no estuvieran estrictamente prohibidas. Para conmemorar su nuevo estatus, te presento tu propia camisa polo de Max Datom (TM). Entendemos
                                                                               que por alguna raz??n, las polos hacen que los humanos se sientan parte de un equipo. Es tuya. El costo del cual se deducir?? de los futuros cr??ditos ganados. ")
                     :paragraph-2 "Suficiente celebraci??n. A??n tienes mucho que aprender. Una "
                     :paragraph-2.1 "aggregate function"
                     :paragraph-2.2 " aparece en la cl??usula find y transforma un resultado. Las aggregate function pueden tomar variables, constantes o src-vars como argumentos."
                     :paragraph-3 "Por ejemplo, para regresar un recuento de trabajadores asignados a cada granja de energ??a junto con el nombre de la granja, se puede emitir usar el siguiente query;"
                     :paragraph-4 "(d/q '[:find (count ?workers) ?farm-name\n       :where [?e :farm/name ?farm-name]\n              [:?e :farm/workers ?workers]] db)"
                     :paragraph-5 "Despu??s de inspeccionar el nuevo esquema del conjunto de datos, actualiza el query para devolver el "
                     :paragraph-5.1 ":user/first+last-name"
                     :paragraph-5.2 " y la cuenta de "
                     :paragraph-5.3 ":post/author"
                     :paragraph-5.4 " para el usuario asociado con "
                     :paragraph-5.5 ":user/id #uuid \"1B341635-BE22-4ACC-AE5B-D81D8B1B7678\""
                     :paragraph-6 "Ahora puedes continuar al nivel 11."}}

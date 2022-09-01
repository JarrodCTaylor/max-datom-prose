:level-17 {:english {:level-title "Level 17"
                     :paragraph-1 (str "Human " applicant-name ", the :transfer/to value appearing to have been changed is worth investigating. Using a ")
                     :paragraph-1.1 "as-of"
                     :paragraph-1.2 " database will allow us to query the database at a specific point in time. The point in time can be specified either as an instant or as a transaction id."
                     :paragraph-2 "For example:"
                     :paragraph-3 "@(def db-before (d/as-of (d/db conn) 23364758362548))\n\n (d/q '[:find ?v \n        :in $ ?worker-id\n        :where [?e :worker/id ?worker-id]\n               [?e :worker/rating ?v]] db-before \"123-abc\")"
                     :paragraph-4 "The above query will return the value for :worker/rating at the point in time corresponding to the transaction id 23364758362548."
                     :paragraph-5 "Pull the all the data including the :account/owner for "
                     :paragraph-5.1 ":transfer/id #uuid \"59b9c791-74ce-4c51-a4bc-ef6d06bee2db\""
                     :paragraph-5.2 " as-of transaction id "
                     :paragraph-5.3 "13194139533319"
                     :paragraph-5.4 "."
                     :paragraph-6 (str "Finally the proof we need! The Silicone Family seems to be using their own accounts for the destination of transfers then after the money
                                       is moved they amend the transfer to appear as though it should have gone to the correct recipient. Simple but effective. Good work " applicant-name " we will take it from here.")}
           :portuguese {:level-title "Nível 17"
                        :paragraph-1 (str "Humano " applicant-name ", vale a pena investigar o valor :transfer/to que parece ter sido alterado. Usando um ")
                        :paragraph-1.1 "as-of"
                        :paragraph-1.2 "a base de dados vai nos permitir fazer uma query em um ponto específico no tempo. O ponto no tempo pode ser especificado tanto como instant ou como transaction id."
                        :paragraph-2 "Por exemplo:"
                        :paragraph-3 "@(def db-before (d/as-of (d/db conn) 23364758362548))\n\n (d/q '[:find ?v \n        :in $ ?worker-id\n        :where [?e :worker/id ?worker-id]\n               [?e :worker/rating ?v]] db-before \"123-abc\")"
                        :paragraph-4 "A query acima vai retornar o valor para :worker/rating no ponto específico no tempo correspondendo à transaction id 23364758362548."
                        :paragraph-5 "Puxe todos os dados incluindo o :account/owner para"
                        :paragraph-5.1 ":transfer/id #uuid \"59b9c791-74ce-4c51-a4bc-ef6d06bee2db\""
                        :paragraph-5.2 "como de transaction id"
                        :paragraph-5.3 "13194139533319"
                        :paragraph-5.4 "."
                        :paragraph-6 (str "Finalmente a prova que precisamos! A Silicone Family parece estar usando suas próprias contas para o destino das transferências. Depois que o dinheiro
                                        é movido, eles alteram a transferência para parecer que deveria ter ido para o destinatário correto. Simples mas efetivo. Bom trabalho " applicant-name ", vamos cuidar deste caso a partir daqui.")}
           :spanish {:level-title ""
                     :paragraph-1 (str "" applicant-name ":transfer/to ")
                     :paragraph-1.1 "as-of"
                     :paragraph-1.2 ""
                     :paragraph-2 ""
                     :paragraph-3 "@(def db-before (d/as-of (d/db conn) 23364758362548))\n\n (d/q '[:find ?v \n        :in $ ?worker-id\n        :where [?e :worker/id ?worker-id]\n               [?e :worker/rating ?v]] db-before \"123-abc\")"
                     :paragraph-4 ":worker/rating 23364758362548."
                     :paragraph-5 ":account/owner "
                     :paragraph-5.1 ":transfer/id #uuid \"59b9c791-74ce-4c51-a4bc-ef6d06bee2db\""
                     :paragraph-5.2 ""
                     :paragraph-5.3 "13194139533319"
                     :paragraph-5.4 "."
                     :paragraph-6 (str " " applicant-name "")}}

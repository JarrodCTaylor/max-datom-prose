:level-4 {:english {:level-title "Level 4"
                    :paragraph-1 (str "Human " applicant-name ", ")
                    :paragraph-1.1 " occurs when a variable appears in more than one data pattern. In the following query, ?e appears twice: "
                    :paragraph-2 "[:find ?e ?farm-id\n :where [?e :worker/age 27] \n        [?e :worker/energy-farm-id ?farm-id]]"
                    :paragraph-3 "Matches for the variable ?e must unify, i.e. represent the same value in every clause in order to satisfy the set of clauses. A matching ?e must have both :worker/age 27 and a value for :worker/energy-farm-id which will be bound to ?farm-id:"
                    :paragraph-4 "Modify the query to return the "
                    :paragraph-4.1 ":book/publication-date "
                    :paragraph-4.2 "for the entity with a "
                    :paragraph-4.3 ":book/name "
                    :paragraph-4.4 "of "
                    :paragraph-4.5 "\"Process and Grow RAM\""
                    :paragraph-5 "You may now continue to level 5."}}

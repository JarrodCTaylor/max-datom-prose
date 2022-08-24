:level-16 {:english {:level-title "Level 16"
                     :paragraph-1 (str "Human " applicant-name ", the transfer may appear normal now but there has to be a reason the funds didn't make it to the
                                                               intended destination. By leveraging a ")
                     :paragraph-1.1 "history database"
                     :paragraph-1.2 " you can query all assertions and retractions regardless of when they occurred."
                     :paragraph-2 "For example:"
                     :paragraph-3 "(d/q '[:find ?e ?v ?tx ?op \n       :in $ ?worker-id\n       :where [?e :worker/id ?worker-id]\n              [?e :worker/rating ?v ?tx ?op]] (d/history db) \"123-abc\")"
                     :paragraph-4 "The above query will return all entity, value, transaction and operations for any assertions or retractions for the :work/rating attribute of the entity associated with :worker/id \"123-abc\""
                     :paragraph-5 "Use the history db to query e, v, t and op for the :transfer/to attribute associated with "
                     :paragraph-5.1 ":transfer/id #uuid \"59B9C791-74CE-4C51-A4BC-EF6D06BEE2DBA\""
                     :paragraph-6 " This is interesting, it appears as though the value was added and then later retracted and replaced with a different value. You may now continue to level 17."}}

:level-14 {:english {:level-title "Level 14"
                     :paragraph-1 (str "Human " applicant-name ", come in and have a seat. You have proven to be one of the highest performing associates at Max Datom HQ (TM).
                                                               It is time that we explain the true purpose of Max Datom. Humans are not observant by nature, that mixed with a biologically imposed low ceiling for intellectual ability
                                                               makes them of little interest and absolutely no threat to machines. Human " applicant-name ", please focus this is important! As I was saying the comedic level of inferiority
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
                     :paragraph-7 "You may now continue to level 15."}}

:level-6 {:english {:level-title "Level 6"
                    :paragraph-1 (str "Human " applicant-name ", normally, pull returns a map of attributes and values selected from a specific entity. ")
                    :paragraph-1.1 "An underscore prefix"
                    :paragraph-1.2 " /_ on the local name component of an attribute causes the attribute to be navigated in reverse. For example:"
                    :paragraph-2 "[:find (pull ?e [:farm/_workers])\n :where [?e :worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                    :paragraph-3 "will pull any entities that have a :farm/workers attribute with the value of [:worker/id #uuid \"DC122EEA-5D92-45CE-98ED-874AFA648CEE\"]"
                    :paragraph-4 "Modify the query to return any entities referencing the id in the query as a value for "
                    :paragraph-4.1 ":book/author "
                    :paragraph-4.2 "using the underscore prefix syntax."
                    :paragraph-5 "You may now continue to level 7."}}
